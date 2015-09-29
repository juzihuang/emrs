package com.model;

public class AdmEmployee {
	public final static String SEX_MAN="男";
	public final static String SEX_WOMAN="女";
	
	private  long id;
	private  String userNumber;
	private  String password;
	private  String realName;
	private  String sex;
	private  long  roolId;


	private  String  roolName;
	private  String createTime;
	private  String updateTime;
	
	//id
	public long getId(){
		return this.id;
	}
	public void setId(long id){
		this.id=id;
	}
	//userNumber
	public String getUserNumber(){
		return this.userNumber;
	}
	public void setUserNumber(String userNumber){
		this.userNumber=userNumber;
	}
	//password
	public String getPassword(){
		return this.password;
	}
	public void setPassword(String password){
		this.password=password;
	}
	//realName
	public String getRealName(){
		return this.realName;
	}
	public void setRealName(String realName){
		this.realName = realName;
	}
	// sex
	public String getSex(){
		return this.sex;
	}
	public void setSex(String sex){
		this.sex=sex;
	}
	//roolId
	public long getRoolId(){
		return this.roolId;
	}
	public void setRoolId(long roolId){
		this.roolId=roolId;
	}
    //roolName
	public String getRoolName() {
		return roolName;
	}

	public void setRoolName(String roolName) {
		this.roolName = roolName;
	}
	//createTime;
	public String getCreateTime(){
		return this.createTime;
	}
	public void setCreateTime(String createTime){
		this.createTime=createTime;
	}
	//updateTime;
	public String getUpdateTime(){
		return this.updateTime;
	}
	public void setUpdateTime(String updateTime){
		this.updateTime=updateTime;
	}
}
