package com.common.struts2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.Validate;
import org.apache.struts2.ServletActionContext;
import net.sf.json.JSONException;
import net.sf.json.JSONObject;

import com.common.log.Logger;
import com.ibatis.common.logging.Log;
import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport {
	private static final long serialVersionUID=1L;
	private transient String jsonParams;//json对象名称
	private JSONObject jsonObject;//json对象
	@SuppressWarnings("unused")
	@Logger
	private Log log;//log 对象自动注入
	protected Object result=null;
	protected String errorCode="0";//默认为0
	protected String errorMessage=null;//错误信息
	protected String sEcho=null;//分页响应
	protected String iTotalRecords=null;//总记录数
	protected String iTotalDisplayRecords=null;//显示记录数
	/*
	 * 
	 */
	//get http request
	protected HttpServletRequest getRequest(){
		System.out.println(ServletActionContext.getRequest().toString());
		return ServletActionContext.getRequest();
	}
	
	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getsEcho() {
		return sEcho;
	}

	public void setsEcho(String sEcho) {
		this.sEcho = sEcho;
	}

	public String getiTotalRecords() {
		return iTotalRecords;
	}

	public void setiTotalRecords(String iTotalRecords) {
		this.iTotalRecords = iTotalRecords;
	}

	public String getiTotalDisplayRecords() {
		return iTotalDisplayRecords;
	}

	public void setiTotalDisplayRecords(String iTotalDisplayRecords) {
		this.iTotalDisplayRecords = iTotalDisplayRecords;
	}

	//get http response
	protected HttpServletResponse getResponse(){
		return ServletActionContext.getResponse();
	} 
	
	//get json object
	public Object getJsonObject(String jsonItem){
		if(jsonObject==null){
			try{
				//check the key is existed 
				Validate.notNull(this.jsonParams,"jsonParams参数为空");
				this.jsonObject=JSONObject.fromObject(this.jsonParams);
			}catch(JSONException e){
				throw new IllegalArgumentException("json格式错误");
			}
		}
		try{
			return jsonObject.get(jsonItem);
		}catch(JSONException e){
			throw new IllegalArgumentException("json格式错误");
		}
	}
	//获取session
	protected Object getSessionValue(String key){
		return ServletActionContext.getRequest().getSession().getAttribute(key);
	}
	//设置session值
	protected void setSessionValue(String key,Object value){
		ServletActionContext.getRequest().getSession().setAttribute(key, value);
	}
	//删除session属性
	protected void removeSessionValue(String key){
		ServletActionContext.getRequest().getSession().removeAttribute(key);
	}
	
	//getter and setter
	public String getJsonParams(){
		return this.jsonParams;
	}
	public void setJsonParams(String jsonParams){
		this.jsonParams = jsonParams;
	}
	public Object getResult(){
		return this.result;
	}
	public void setResult(Object result){
		this.result=result;
	}
	public String  getErrorMessage(){
		return this.errorMessage;
	}
	public void setErrorMessage(String errorMessage){
		this.errorMessage = errorMessage;
	}
	
	//set error code and error message
	//分页显示
	public void setErrorCodeAndResultByPage(String errorCode,Object result,String sEcho,String total){
		this.errorCode=errorCode;
		this.result=result;
		this.sEcho=sEcho;
		this.iTotalRecords=total;
		this.iTotalDisplayRecords=total;
	}
	public void setErrorCodeAndResult(String errorCode, Object result){
		this.errorCode = errorCode;
		this.result = result;
	}
	
	public void setErrorCodeAndMsg(String errorCode, String errorMessage){
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}
	
}
