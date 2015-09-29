package com.action;

import com.common.struts2.BaseAction;
import com.model.BloodSugarRecord;
import com.model.Page;
import com.opensymphony.xwork2.ActionSupport;
import com.service.BloodSugarRecordService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.lang.Validate;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class BloodSugarRecordAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	@Autowired
	private BloodSugarRecordService bloodSugarRecordService;
	@Autowired
	Page page;//按页查询参数
	/*
	 * 添加血糖监测 2015/9/17
	 */
	public String addBloodSugarRecord() {
		// getPara and validate
		//参数不为空
		String patient_id = this.getJsonObject("patient_id").toString();
		Validate.notNull(patient_id, "参数病案号不可为空");
		//参数可为空
		String date = this.getJsonObject("date").toString();
		String before_breakfast=this.getJsonObject("before_breakfast").toString();
		String after_breakfast = this.getJsonObject("after_breakfast").toString();
		String before_lunch=this.getJsonObject("before_lunch").toString();
		String after_lunch = this.getJsonObject("after_lunch").toString();
		String before_supper=this.getJsonObject("before_supper").toString();
		String after_supper = this.getJsonObject("after_supper").toString();
		String mark = this.getJsonObject("mark").toString();
		String doctor_id = this.getJsonObject("doctor_id").toString();
		String nurse_id = this.getJsonObject("nurse_id").toString();
    /*	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
		String log_time = df.format(new Date()).toString();// 获取当前系统时间为录入时间
*/		// set new BloodSugarRecord
		BloodSugarRecord bloodSugarRecord = new BloodSugarRecord();
		bloodSugarRecord.setPatient_id(patient_id);
		bloodSugarRecord.setDate(date);
		bloodSugarRecord.setBefore_breakfast(Float.parseFloat(before_breakfast));
		bloodSugarRecord.setAfter_breakfast(Float.parseFloat(after_breakfast));
		bloodSugarRecord.setBefore_lunch(Float.parseFloat(before_lunch));
		bloodSugarRecord.setAfter_lunch(Float.parseFloat(after_lunch));
		bloodSugarRecord.setBefore_supper(Float.parseFloat(before_supper));
		bloodSugarRecord.setAfter_supper(Float.parseFloat(after_supper));
		bloodSugarRecord.setMark(mark);
		bloodSugarRecord.setDoctor_id(Long.parseLong(doctor_id));
		bloodSugarRecord.setNurse_id(Long.parseLong(nurse_id));
		
		// save BloodSugarRecord
		bloodSugarRecordService.addBloodSugarRecord(bloodSugarRecord);
		// log and return
		String logContent = "完成添加血糖监测记录(BloodSugarRecord_number:" + bloodSugarRecord.getPatient_id()
				+ ")";
		ActionSupport.LOG.info(logContent);// 日志
		this.setErrorCodeAndResult("0", true);// 设置返回
		return SUCCESS;
	}

	public String getBloodSugarRecord() throws Exception {
		// getPara and validate
		String patient_id = this.getJsonObject("patient_id").toString();
		Validate.notNull(patient_id, "参数patient_id不可为空");
		// call service to query
		BloodSugarRecord bloodSugarRecord = new BloodSugarRecord();
		bloodSugarRecord.setPatient_id(patient_id);
		bloodSugarRecord = bloodSugarRecordService.getBloodSugarRecord(bloodSugarRecord);
		// construct result
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", bloodSugarRecord.getId());
		jsonObject.put("patient_id", bloodSugarRecord.getPatient_id());
		jsonObject.put("date", bloodSugarRecord.getDate());
		jsonObject.put("before_breakfast", bloodSugarRecord.getBefore_breakfast());
		jsonObject.put("after_breakfast", bloodSugarRecord.getAfter_breakfast());
		jsonObject.put("before_lunch", bloodSugarRecord.getBefore_lunch());
		jsonObject.put("after_lunch", bloodSugarRecord.getAfter_lunch());
		jsonObject.put("before_supper", bloodSugarRecord.getBefore_supper());
		jsonObject.put("after_supper", bloodSugarRecord.getAfter_supper());
		jsonObject.put("mark", bloodSugarRecord.getMark());
		jsonObject.put("doctor_id", bloodSugarRecord.getDoctor_id());
		jsonObject.put("nurse_id", bloodSugarRecord.getNurse_id());
		/*jsonObject.put("signature_id", BloodSugarRecord.getSignature_id());
		jsonObject.put("log_time", BloodSugarRecord.getLog_time());*/
		// reply message
		this.setErrorCodeAndResult("0", jsonObject);
		return SUCCESS;
	}

	public String updateBloodSugarRecord() throws Exception {
		//参数不为空
		String patient_id = this.getJsonObject("patient_id").toString();
		Validate.notNull(patient_id, "参数病案号不可为空");
		//参数可为空
		String date = this.getJsonObject("date").toString();
		String before_breakfast=this.getJsonObject("before_breakfast").toString();
		String after_breakfast = this.getJsonObject("after_breakfast").toString();
		String before_lunch=this.getJsonObject("before_lunch").toString();
		String after_lunch = this.getJsonObject("after_lunch").toString();
		String before_supper=this.getJsonObject("before_supper").toString();
		String after_supper = this.getJsonObject("after_supper").toString();
		String mark = this.getJsonObject("mark").toString();
		String doctor_id = this.getJsonObject("doctor_id").toString();
		String nurse_id = this.getJsonObject("nurse_id").toString();
		//String  log_time = this.getJsonObject("log_time").toString();
		/*SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
		String log_time = df.format(new Date()).toString();// 获取当前系统时间为录入时间
*/		// set new BloodSugarRecord
		BloodSugarRecord bloodSugarRecord = new BloodSugarRecord();
		bloodSugarRecord.setPatient_id(patient_id);
		bloodSugarRecord.setDate(date);
		bloodSugarRecord.setBefore_breakfast(Float.parseFloat(before_breakfast));
		bloodSugarRecord.setAfter_breakfast(Float.parseFloat(after_breakfast));
		bloodSugarRecord.setBefore_lunch(Float.parseFloat(before_lunch));
		bloodSugarRecord.setAfter_lunch(Float.parseFloat(after_lunch));
		bloodSugarRecord.setBefore_supper(Float.parseFloat(before_supper));
		bloodSugarRecord.setAfter_supper(Float.parseFloat(after_supper));
		bloodSugarRecord.setMark(mark);
		bloodSugarRecord.setDoctor_id(Long.parseLong(doctor_id));
		bloodSugarRecord.setNurse_id(Long.parseLong(nurse_id));
		// save BloodSugarRecord
		bloodSugarRecordService.updateBloodSugarRecord(bloodSugarRecord);
		// log and return
		String logContent = "完成更新血糖监测记录(BloodSugarRecord_number:" + bloodSugarRecord.getPatient_id()
				+ ")";
		ActionSupport.LOG.info(logContent);// 日志
		this.setErrorCodeAndResult("0", true);// 设置返回
		return SUCCESS;
	}

	public String deleteBloodSugarRecord() throws Exception {
		// getPara and validate
		String id = this.getJsonObject("id").toString();
		Validate.notNull(id, "参数id不可为空");
		// call service to query
		BloodSugarRecord bloodSugarRecord = new BloodSugarRecord();
		bloodSugarRecord.setId(id);
		bloodSugarRecordService.deleteBloodSugarRecord(bloodSugarRecord);
		// reply message
		this.setErrorCodeAndResult("0", true);
		return SUCCESS;
	}
	//分页查询
	public String getBloodSugarRecordList() throws Exception {
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
		//get 病案号
		String patient_id = this.getJsonObject("patient_id").toString();
		Validate.notNull(patient_id, "参数病案号不可为空");

		//查询
		List<BloodSugarRecord> bloodSugarRecordList = bloodSugarRecordService.getBloodSugarRecordList(page,patient_id);
		JSONArray jsonArray = new JSONArray();
		for(BloodSugarRecord bloodSugarRecord:bloodSugarRecordList){
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("id", bloodSugarRecord.getId());
			jsonObject.put("patient_id", bloodSugarRecord.getPatient_id());
			jsonObject.put("date", bloodSugarRecord.getDate());
			jsonObject.put("before_breakfast", bloodSugarRecord.getBefore_breakfast());
			jsonObject.put("after_breakfast", bloodSugarRecord.getAfter_breakfast());
			jsonObject.put("before_lunch", bloodSugarRecord.getBefore_lunch());
			jsonObject.put("after_lunch", bloodSugarRecord.getAfter_lunch());
			jsonObject.put("before_supper", bloodSugarRecord.getBefore_supper());
			jsonObject.put("after_supper", bloodSugarRecord.getAfter_supper());
			jsonObject.put("mark", bloodSugarRecord.getMark());
			jsonObject.put("doctor_id", bloodSugarRecord.getDoctor_id());
			jsonObject.put("nuesr_id", bloodSugarRecord.getNurse_id());		
			jsonArray.add(jsonObject);
		}
		// reply message
		this.setErrorCodeAndResultByPage("0",jsonArray,sEcho,displayLength);
		return SUCCESS;
	}



}
