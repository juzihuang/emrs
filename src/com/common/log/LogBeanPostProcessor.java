package com.common.log;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanInitializationException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Log4j日志注解化的应用 基本原理如下: 通过自定义一个BeanPostProcessor, 在对所有bean初始化之前,
 * 对每一个bean的field进行检查, 是否适用了Logger注解, 如果有, 则调用LogFactory创建一个logger实例.
 * 
 */
public class LogBeanPostProcessor implements BeanPostProcessor {
	
	/**
	 * 初始化之后的操作
	 */
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		return bean;
	}

	/**
	 * 初始化之前的操作的处理
	 */
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		List<Class<?>> clazzes = getAllClasses(bean);
		for (Class<?> clazz : clazzes) {
			initializeLog(bean, clazz);
		}
		return bean;
	}

	/**
	 * 初始化添加日志功能的
	 * 
	 * @param bean
	 * @param clazz
	 */
	private void initializeLog(Object bean, Class<? extends Object> clazz) {
		Field[] fiels = clazz.getDeclaredFields();
		for (Field field : fiels) {
			if (field.getAnnotation(Logger.class) == null) {
				continue;
			}
			if (!field.getType().isAssignableFrom(Log.class)) {
				continue;
			}
			// 获取是否可以方法的属性
			boolean visable = field.isAccessible();
			try {
				//通过反射将私有方法设置为可以访问
				field.setAccessible(true);
				field.set(bean, LogFactory.getLog(clazz));
			} catch (Exception e) {
				throw new BeanInitializationException(String.format(
						"初始化logger失败!bean=%s;field=%s", bean, field));
			} finally {
				// 恢复原来的访问修饰
				field.setAccessible(visable);
			}
		}
	}

	/**
	 * 
	 * 获取参数bean对象的class以及所有父类的列表,该列表中顺序为从父类中当前类
	 * 
	 * @param bean
	 * @return
	 */
	private List<Class<?>> getAllClasses(Object bean) {
		Class<? extends Object> clazz = bean.getClass();
		List<Class<?>> clazzes = new ArrayList<Class<?>>();
		while (clazz != null) {
			clazzes.add(clazz);
			clazz = clazz.getSuperclass();
		}
		Collections.reverse(clazzes);
		return clazzes;
	}
}