package com.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.lang.Validate;
import org.springframework.beans.factory.annotation.Autowired;

import com.common.struts2.BaseAction;
import com.model.AdmEmployee;
import com.model.InpatientArea;
import com.model.Page;
import com.opensymphony.xwork2.ActionSupport;
import com.service.InpatientAreaService;
import com.service.impl.InpatientAreaServiceImpl;

public class InpatientAreaAction extends BaseAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	private InpatientAreaService inpatientAreaService;
	@Autowired
	Page page;//按页查询参数
	public String test() throws Exception {

		// getPara and validate
		// String userNumber = (String) this.getJsonObject("userNumber");
		// System.out.println(userNumber);
		this.setErrorCodeAndResult("0", true);
		return SUCCESS;
	}

	/*
	 * 添加病区 2015/9/6
	 */
	public String addInpatientArea() {
		// getPara and validate
		String name = this.getJsonObject("name").toString();
		Validate.notNull(name, "参数name不可为空");
		String str_area_direct_id = this.getJsonObject("area_direct_id")
				.toString();
		long area_direct_id = Long.parseLong(str_area_direct_id);
		Validate.notNull(area_direct_id, "参数area_direct_id不可为空");
		long big_nurse_id = Long.parseLong(this.getJsonObject("big_nurse_id")
				.toString());
		Validate.notNull(big_nurse_id, "参数big_nurse_id不可为空");
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
		String createTime = (String) df.format(new Date());// 获取当前系统时间
		// set new InpatientArea
		InpatientArea inpatientArea = new InpatientArea();
		inpatientArea.setName(name);
		inpatientArea.setBig_nurse_id(big_nurse_id);
		inpatientArea.setArea_direct_id(area_direct_id);
		inpatientArea.setCreate_time(createTime);

		// save inpatientArea
		inpatientAreaService.addInpatientArea(inpatientArea);
		// log and return
		String logContent = "完成添加病区(inpatientArea:" + inpatientArea.getId()
				+ ")";
		ActionSupport.LOG.info(logContent);// 日志
		this.setErrorCodeAndResult("0", true);// 设置返回
		return SUCCESS;
	}

	public String getInpatientArea() throws Exception {
		// getPara and validate
		String id = this.getJsonObject("id").toString();
		Validate.notNull(id, "参数id不可为空");
		// call service to query
		InpatientArea inpatientArea = new InpatientArea();
		inpatientArea.setId(Integer.parseInt(id));
		inpatientArea = inpatientAreaService.getInpatientArea(inpatientArea);
		// construct result
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", inpatientArea.getId());
		jsonObject.put("name", inpatientArea.getName());
		jsonObject.put("area_direct_id", inpatientArea.getArea_direct_id());
		jsonObject.put("big_nurse_id", inpatientArea.getBig_nurse_id());
		jsonObject.put("create_time", inpatientArea.getCreate_time());
		// reply message
		this.setErrorCodeAndResult("0", jsonObject);
		return SUCCESS;
	}

	public String updateInpatientArea() throws Exception {
		// getPara and validate
		String id = this.getJsonObject("id").toString();
		Validate.notNull(id, "参数id不可为空");
		String name = this.getJsonObject("name").toString();
		Validate.notNull(name, "参数name不可为空");
		String str_area_direct_id = this.getJsonObject("area_direct_id")
				.toString();
		long area_direct_id = Long.parseLong(str_area_direct_id);
		Validate.notNull(area_direct_id, "参数area_direct_id不可为空");
		long big_nurse_id = Long.parseLong(this.getJsonObject("big_nurse_id")
				.toString());
		Validate.notNull(big_nurse_id, "参数big_nurse_id不可为空");
		// set new InpatientArea
		InpatientArea inpatientArea = new InpatientArea();
		inpatientArea.setId(Long.parseLong(id));
		inpatientArea.setName(name);
		inpatientArea.setBig_nurse_id(big_nurse_id);
		inpatientArea.setArea_direct_id(area_direct_id);
		// save inpatientArea
		inpatientAreaService.updateInpatientArea(inpatientArea);
		// log and return
		String logContent = "完成修改病区(inpatientArea id:" + inpatientArea.getId()
				+ ")";
		ActionSupport.LOG.info(logContent);// 日志
		this.setErrorCodeAndResult("0", true);// 设置返回
		return SUCCESS;
	}

	public String deleteInpatientArea() throws Exception {
		// getPara and validate
		String id = this.getJsonObject("id").toString();
		Validate.notNull(id, "参数id不可为空");
		// call service to query
		InpatientArea inpatientArea = new InpatientArea();
		inpatientArea.setId(Integer.parseInt(id));
		inpatientAreaService.deleteInpatientArea(inpatientArea);
		// reply message
		this.setErrorCodeAndResult("0", true);
		return SUCCESS;
	}
	//分页查询
	public String getInpatientAreaList() throws Exception {
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
		List<InpatientArea> inpatientAreaList = inpatientAreaService.getInpatientAreaList(page);
		JSONArray jsonArray = new JSONArray();
		for(InpatientArea inpatientArea:inpatientAreaList){
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("id", inpatientArea.getId());
			jsonObject.put("name", inpatientArea.getName());
			jsonObject.put("area_direct_id", inpatientArea.getArea_direct_id());
			jsonObject.put("big_nurse_id", inpatientArea.getBig_nurse_id());
			jsonObject.put("create_time", inpatientArea.getCreate_time());
			jsonArray.add(jsonObject);
		}
		// reply message
		this.setErrorCodeAndResultByPage("0",jsonArray,sEcho,displayLength);
		return SUCCESS;
	}

}
