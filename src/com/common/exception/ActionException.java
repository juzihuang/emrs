package com.common.exception;

import java.util.ResourceBundle;

public class ActionException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private String errorCode;//错误代码
	
	//获取错误编码表
	private static ResourceBundle errorList=ResourceBundle.getBundle("com.common.error.message");
	//构造方法
	public ActionException(){
		super();//调用父类的构造方法
	}
	public ActionException(String errorCode) {
		super(errorList.getString(errorCode));
		this.errorCode = errorCode;
	}
	public ActionException(String errorCode, Throwable cause) {
		super(errorList.getString(errorCode), cause);
		this.errorCode = errorCode;
	}
	//获取错误编码
	public String getErrorCode(){
		return this.errorCode;
	}

}
