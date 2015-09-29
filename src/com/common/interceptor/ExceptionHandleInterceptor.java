package com.common.interceptor;

import com.common.exception.ActionException;
import com.common.exception.ServiceException;
import com.common.struts2.BaseAction;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class ExceptionHandleInterceptor extends AbstractInterceptor {
	/**
	 * 设置默认序列化版本号
	 */
	private static final long serialVersionUID = 1L;
	
	private ActionInvocation invocation;
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		String result=null;
		//获取action调用的方法
		String actionUrl = invocation.getInvocationContext().getName();
		this.invocation=invocation;
		try{
			result = this.invocation.invoke();//调用action
		}catch(Exception e){
			processException(e,actionUrl);
			result="success";
		}
		return result;
	}
	/*
	 * 异常处理过程
	 */
	private void processException(Exception e, String actionUrl){
		BaseAction baseAction = (BaseAction)this.invocation.getAction();
		if (e instanceof NullPointerException || e instanceof IllegalArgumentException) {
			baseAction.setErrorCodeAndMsg("1000", e.getMessage());
		} else if(e instanceof NoSuchMethodException){
			baseAction.setErrorCodeAndMsg("1003", "无此方法");
		} else if(e instanceof ServiceException){
			ServiceException se = (ServiceException) e;
			baseAction.setErrorCodeAndMsg(se.getErrorCode(), se.getMessage());
		} else if((e instanceof ActionException)){
			ActionException ae = (ActionException) e;
			baseAction.setErrorCodeAndMsg(ae.getErrorCode(), ae.getMessage());
		} 
		//添加到系统日志当中
	}
	

}
