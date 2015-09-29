package com.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.lang.Validate;
import org.springframework.beans.factory.annotation.Autowired;

import com.service.AdmEmployeeService;
import com.common.struts2.BaseAction;
import com.model.AdmEmployee;
import com.model.Page;
import com.opensymphony.xwork2.ActionSupport;

public class AdmEmployeeAction extends BaseAction {
	private static final long serialVersionUID = 1L;
	@Autowired
	private AdmEmployeeService aEService;// AdmEmployee servic object
	@Autowired
	Page page;//按页查询参数
	/*
	 * test
	 */
	public String test() throws Exception {
	   
		// getPara and validate
//		String userNumber = (String) this.getJsonObject("userNumber");
//		System.out.println(userNumber);
		this.setErrorCodeAndResult("0", true);
		return SUCCESS;
	}
	/*
	 * 根据模糊查询获取用户列表 roolId=-1时表示查询所有角色
	 */
	public String getAdmEmployeeList() throws Exception {
		//get page info
		String sEcho = this.getJsonObject("sEcho").toString();
		Validate.notEmpty(sEcho, "参数sEcho不可为空");
		String displayStart = this.getJsonObject("iDisplayStart").toString();
		Validate.notEmpty(displayStart, "参数iDisplayStart不可为空");
		String displayLength = this.getJsonObject("iDisplayLength").toString();
		Validate.notEmpty(displayLength, "参数iDisplayLength不可为空");
		Integer iRowNumEnd=Integer.parseInt(displayStart)+Integer.parseInt(displayLength);
		page.setRowNumStart(displayStart);
		page.setRowNumEnd(iRowNumEnd.toString());
		page.setRowLength(displayLength);
		//查询
		List<AdmEmployee> admEmployeeList = aEService.getAdmEmployeeList(page);
		JSONArray jsonArray = new JSONArray();
		for(AdmEmployee admE:admEmployeeList){
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("userNumber", admE.getUserNumber());
			jsonObject.put("password", admE.getPassword());
			jsonObject.put("realName", admE.getRealName());
			jsonObject.put("sex", admE.getSex());
			jsonObject.put("roolName", admE.getRoolName());
			jsonObject.put("createTime", admE.getCreateTime());
			jsonObject.put("updateTime", admE.getUpdateTime());
			jsonArray.add(jsonObject);
		}
		// reply message
		this.setErrorCodeAndResultByPage("0",jsonArray,sEcho,displayLength);
		return SUCCESS;
	}

	public String getAdmEmployee() throws Exception {
		// getPara and validate
		String userNumber =this.getJsonObject("userNumber").toString();
		Validate.notNull(userNumber, "参数userNumber不可为空");
		// call service to query
		AdmEmployee admEmployee = new AdmEmployee();
		admEmployee.setUserNumber(userNumber);
		AdmEmployee admE = aEService.getAdmEmployee(admEmployee);
		// construct result
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("userNumber", admE.getUserNumber());
		jsonObject.put("password", admE.getPassword());
		jsonObject.put("realName", admE.getRealName());
		jsonObject.put("sex", admE.getSex());
		jsonObject.put("roolName", admE.getRoolName());
		jsonObject.put("createTime", admE.getCreateTime());
		jsonObject.put("updateTime", admE.getUpdateTime());
		// reply message
		this.setErrorCodeAndResult("0", jsonObject);
		return SUCCESS;
	}

	public String addAdmEmpolyee() throws Exception {
		// getPara and validate
		String userNumber = (String) this.getJsonObject("userNumber");
		Validate.notNull(userNumber, "参数userNumber不可为空");
		String password = (String) this.getJsonObject("password");
		Validate.notNull(password, "参数password不可为空");
		String realName = (String) this.getJsonObject("realName");
		Validate.notNull(realName, "参数realName不可为空");
		String sex = (String) this.getJsonObject("sex");
		Validate.notNull(sex, "参数sex不可为空");
		long roolId = Long.parseLong(this.getJsonObject("roolId").toString());
		Validate.notNull(roolId, "参数roolId不可为空");
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
		String createTime = (String) df.format(new Date());// 获取当前系统时间
		String updateTime = createTime;// 设置修改时间与创建时间一致
		// set new AdmEmployee
		AdmEmployee admEmployee = new AdmEmployee();
		admEmployee.setUserNumber(userNumber);
		admEmployee.setPassword(password);
		admEmployee.setRealName(realName);
		admEmployee.setSex(sex);
		admEmployee.setRoolId(roolId);
		admEmployee.setCreateTime(createTime);
		admEmployee.setUpdateTime(updateTime);
		// save admEmployee
		aEService.addAdmEmployee(admEmployee);
		// log and return
		String logContent = "完成添加用户(userNumber:" + admEmployee.getUserNumber()
				+ ")";
		ActionSupport.LOG.info(logContent);// 日志
		this.setErrorCodeAndResult("0", true);// 设置返回
		return SUCCESS;
	}

	public String updateAdmEmpolyee() throws Exception {
		// getPara and validate
		String userNumber = this.getJsonObject("userNumber").toString();
		Validate.notNull(userNumber, "参数userNumber不可为空");
		String password =this.getJsonObject("password").toString();
		Validate.notNull(password, "参数password不可为空");
		String realName =this.getJsonObject("realName").toString();
		Validate.notNull(realName, "参数realName不可为空");
		String sex = this.getJsonObject("sex").toString();
		Validate.notNull(sex, "参数sex不可为空");
		long roolId = Long.parseLong(this.getJsonObject("roolId").toString());
		Validate.notNull(roolId, "参数roolId不可为空");
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
		String updateTime =df.format(new Date()).toString();// 获取当前系统时间
		// set new AdmEmployee
		AdmEmployee admEmployee = new AdmEmployee();
		admEmployee.setUserNumber(userNumber);
		admEmployee.setPassword(password);
		admEmployee.setRealName(realName);
		admEmployee.setSex(sex);
		admEmployee.setRoolId(roolId);
		admEmployee.setUpdateTime(updateTime);
		// update admEmployee
		aEService.updateAdmEmployee(admEmployee);
		// log and return
		String logContent = "完成修改用户(userNumber:" + admEmployee.getUserNumber()
				+ ")";
		ActionSupport.LOG.info(logContent);// 日志
		this.setErrorCodeAndResult("0", true);// 设置返回
		return SUCCESS;
	}

	public String deleteAdmEmpolyee() throws Exception {
		String userNumber = (String) this.getJsonObject("userNumber");
		Validate.notNull(userNumber, "参数userNumber不可为空");
		// set admEmployee
		AdmEmployee admEmployee = new AdmEmployee();
		admEmployee.setUserNumber(userNumber);
		// delete admEmployee
		aEService.deleteAdmEmployee(admEmployee);
		// log and return
		String logContent = "完成删除用户(userNumber:" + admEmployee.getUserNumber()
				+ ")";
		ActionSupport.LOG.info(logContent);// 日志
		this.setErrorCodeAndResult("0", true);// 设置返回
		return SUCCESS;
	}
}
