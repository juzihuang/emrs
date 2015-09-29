package com.action;

import com.common.struts2.BaseAction;
import com.model.IntensiveCareRecord;
import com.model.Page;
import com.opensymphony.xwork2.ActionSupport;
import com.service.IntensiveCareRecordService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.lang.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class IntensiveCareRecordAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	@Autowired
	private IntensiveCareRecordService intensiveCareRecordService;
	@Autowired
	Page page;//按页查询参数
	/*
	 * 添加重症护理记录2015/9/24
	 */
	public String addIntensiveCareRecord() {
		// getPara and validate
		//参数不为空
		String patient_id = this.getJsonObject("patient_id").toString();
		Validate.notNull(patient_id, "参数病案号不可为空");
		//参数可为空
		String date = this.getJsonObject("date").toString();
		String temperature=this.getJsonObject("temperature").toString();
		String pulse = this.getJsonObject("pulse").toString();
		String breath=this.getJsonObject("breath").toString();
		String blood_pressure = this.getJsonObject("blood_pressure").toString();
		String oxygen_saturation=this.getJsonObject("oxygen_saturation").toString();
		String input_amount_liquid = this.getJsonObject("input_amount_liquid").toString();
		String input_amount_other = this.getJsonObject("input_amount_other").toString();
		String output_amount_urine = this.getJsonObject("output_amount_urine").toString();
		String output_amount_other = this.getJsonObject("output_amount_other").toString();
		String condition_and_treatment = this.getJsonObject("condition_and_treatment").toString();
		String recorder_id = this.getJsonObject("recorder_id").toString();
    /*	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
		String log_time = df.format(new Date()).toString();// 获取当前系统时间为录入时间
*/		// set new IntensiveCareRecord
		IntensiveCareRecord intensiveCareRecord = new IntensiveCareRecord();
		intensiveCareRecord.setPatient_id(patient_id);
		intensiveCareRecord.setDate(date);
		intensiveCareRecord.setTemperature(temperature);
		intensiveCareRecord.setPulse(pulse);
		intensiveCareRecord.setBreath(breath);
		intensiveCareRecord.setBlood_pressure(blood_pressure);
		intensiveCareRecord.setOxygen_saturation(oxygen_saturation);
		intensiveCareRecord.setInput_amount_liquid(input_amount_liquid);
		intensiveCareRecord.setInput_amount_other(input_amount_other);
		intensiveCareRecord.setOutput_amount_urine(output_amount_urine);
		intensiveCareRecord.setOutput_amount_other(output_amount_other);
		intensiveCareRecord.setCondition_and_treatment(condition_and_treatment);
		intensiveCareRecord.setRecorder_id(recorder_id);
		
		// save IntensiveCareRecord
		intensiveCareRecordService.addIntensiveCareRecord(intensiveCareRecord);
		// log and return
		String logContent = "完成添加重症护理记录(patient_id:" + intensiveCareRecord.getPatient_id()
				+ ")";
		ActionSupport.LOG.info(logContent);// 日志
		this.setErrorCodeAndResult("0", true);// 设置返回
		return SUCCESS;
	}

	public String getIntensiveCareRecord() throws Exception {
		// getPara and validate
		String patient_id = this.getJsonObject("patient_id").toString();
		Validate.notNull(patient_id, "参数patient_id不可为空");
		// call service to query
		IntensiveCareRecord intensiveCareRecord = new IntensiveCareRecord();
		intensiveCareRecord.setPatient_id(patient_id);
		intensiveCareRecord = intensiveCareRecordService.getIntensiveCareRecord(intensiveCareRecord);
		// construct result
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", intensiveCareRecord.getId());
		jsonObject.put("patient_id", intensiveCareRecord.getPatient_id());
		jsonObject.put("date", intensiveCareRecord.getDate());
		jsonObject.put("temperature", intensiveCareRecord.getTemperature());
		jsonObject.put("pulse", intensiveCareRecord.getPulse());
		jsonObject.put("breath", intensiveCareRecord.getBreath());
		jsonObject.put("blood_pressure", intensiveCareRecord.getBlood_pressure());
		jsonObject.put("oxygen_saturation", intensiveCareRecord.getOxygen_saturation());
		jsonObject.put("input_amount_liquid", intensiveCareRecord.getInput_amount_liquid());
		jsonObject.put("input_amount_other", intensiveCareRecord.getInput_amount_other());
		jsonObject.put("output_amount_urine", intensiveCareRecord.getOutput_amount_urine());
		jsonObject.put("output_amount_other", intensiveCareRecord.getOutput_amount_other());
		jsonObject.put("condition_and_treatment", intensiveCareRecord.getCondition_and_treatment());
		jsonObject.put("recorder_id", intensiveCareRecord.getRecorder_id());
		/*jsonObject.put("signature_id", IntensiveCareRecord.getSignature_id());
		jsonObject.put("log_time", IntensiveCareRecord.getLog_time());*/
		// reply message
		this.setErrorCodeAndResult("0", jsonObject);
		return SUCCESS;
	}

	public String updateIntensiveCareRecord() throws Exception {
		//参数不为空
		String patient_id = this.getJsonObject("patient_id").toString();
		Validate.notNull(patient_id, "参数病案号不可为空");
		//参数可为空
		String date = this.getJsonObject("date").toString();
		String temperature=this.getJsonObject("temperature").toString();
		String pulse = this.getJsonObject("pulse").toString();
		String breath=this.getJsonObject("breath").toString();
		String blood_pressure = this.getJsonObject("blood_pressure").toString();
		String oxygen_saturation=this.getJsonObject("oxygen_saturation").toString();
		String input_amount_liquid = this.getJsonObject("input_amount_liquid").toString();
		String input_amount_other = this.getJsonObject("input_amount_other").toString();
		String output_amount_urine = this.getJsonObject("output_amount_urine").toString();
		String output_amount_other = this.getJsonObject("output_amount_other").toString();
		String condition_and_treatment = this.getJsonObject("condition_and_treatment").toString();
		String recorder_id = this.getJsonObject("recorder_id").toString();
    /*	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
		String log_time = df.format(new Date()).toString();// 获取当前系统时间为录入时间
*/		// set new IntensiveCareRecord
		IntensiveCareRecord intensiveCareRecord = new IntensiveCareRecord();
		intensiveCareRecord.setPatient_id(patient_id);
		intensiveCareRecord.setDate(date);
		intensiveCareRecord.setTemperature(temperature);
		intensiveCareRecord.setPulse(pulse);
		intensiveCareRecord.setBreath(breath);
		intensiveCareRecord.setBlood_pressure(blood_pressure);
		intensiveCareRecord.setOxygen_saturation(oxygen_saturation);
		intensiveCareRecord.setInput_amount_liquid(input_amount_liquid);
		intensiveCareRecord.setInput_amount_other(input_amount_other);
		intensiveCareRecord.setOutput_amount_urine(output_amount_urine);
		intensiveCareRecord.setOutput_amount_other(output_amount_other);
		intensiveCareRecord.setCondition_and_treatment(condition_and_treatment);
		intensiveCareRecord.setRecorder_id(recorder_id);
		// save IntensiveCareRecord
		intensiveCareRecordService.updateIntensiveCareRecord(intensiveCareRecord);
		// log and return
		String logContent = "完成更新重症护理记录(IntensiveCareRecord_number:" + intensiveCareRecord.getPatient_id()
				+ ")";
		ActionSupport.LOG.info(logContent);// 日志
		this.setErrorCodeAndResult("0", true);// 设置返回
		return SUCCESS;
	}

	public String deleteIntensiveCareRecord() throws Exception {
		// getPara and validate
		String id = this.getJsonObject("id").toString();
		Validate.notNull(id, "参数id不可为空");
		// call service to query
		IntensiveCareRecord intensiveCareRecord = new IntensiveCareRecord();
		intensiveCareRecord.setId(id);
		intensiveCareRecordService.deleteIntensiveCareRecord(intensiveCareRecord);
		// reply message
		this.setErrorCodeAndResult("0", true);
		return SUCCESS;
	}
	//分页查询
	public String getIntensiveCareRecordList() throws Exception {
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
		List<IntensiveCareRecord> intensiveCareRecordList = intensiveCareRecordService.getIntensiveCareRecordList(page,patient_id);
		JSONArray jsonArray = new JSONArray();
		for(IntensiveCareRecord intensiveCareRecord:intensiveCareRecordList){
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("id", intensiveCareRecord.getId());
			jsonObject.put("patient_id", intensiveCareRecord.getPatient_id());
			jsonObject.put("date", intensiveCareRecord.getDate());
			jsonObject.put("temperature", intensiveCareRecord.getTemperature());
			jsonObject.put("pulse", intensiveCareRecord.getPulse());
			jsonObject.put("breath", intensiveCareRecord.getBreath());
			jsonObject.put("blood_pressure", intensiveCareRecord.getBlood_pressure());
			jsonObject.put("oxygen_saturation", intensiveCareRecord.getOxygen_saturation());
			jsonObject.put("input_amount_liquid", intensiveCareRecord.getInput_amount_liquid());
			jsonObject.put("input_amount_other", intensiveCareRecord.getInput_amount_other());
			jsonObject.put("output_amount_urine", intensiveCareRecord.getOutput_amount_urine());
			jsonObject.put("output_amount_other", intensiveCareRecord.getOutput_amount_other());
			jsonObject.put("condition_and_treatment", intensiveCareRecord.getCondition_and_treatment());
			jsonObject.put("recorder_id", intensiveCareRecord.getRecorder_id());	
			jsonArray.add(jsonObject);
		}
		// reply message
		this.setErrorCodeAndResultByPage("0",jsonArray,sEcho,displayLength);
		return SUCCESS;
	}



}
