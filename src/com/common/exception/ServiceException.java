package com.common.exception;

import java.util.ResourceBundle;
/**
 * service层抛出的异常
 *
 */
public class ServiceException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private String errorCode; //错误代码
	private static ResourceBundle resource = ResourceBundle.getBundle("com.common.error.message");//错误消息资源文件
	public ServiceException(){
		super();
	}
	public ServiceException(String errorCode) {
		super(resource.getString(errorCode));
		this.errorCode = errorCode;
	}
	public ServiceException(String errorCode, Throwable cause) {
		super(resource.getString(errorCode), cause);
		this.errorCode = errorCode;
	}
	public String getErrorCode() {
		return errorCode;
	}
}
