package com.action;

import com.common.struts2.BaseAction;
import com.model.BloodTransfusionRecord;
import com.model.Page;
import com.opensymphony.xwork2.ActionSupport;
import com.service.BloodTransfusionRecordService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.lang.Validate;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class BloodTransfusionRecordAction extends BaseAction {
	/**
	 *  
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	private BloodTransfusionRecordService bloodTransfusionRecordService;
	@Autowired
	Page page;//按页查询参数
	/*
	 * 添加血糖监测 2015/9/17
	 */
	public String addBloodTransfusionRecord() {
		// getPara and validate
		//参数不为空
		String patient_id = this.getJsonObject("patient_id").toString();
		Validate.notNull(patient_id, "参数病案号不可为空");
		//参数可为空
		String history_blood_trans = this.getJsonObject("history_blood_trans").toString();
		String pregnancies=this.getJsonObject("pregnancies").toString();
		String labors = this.getJsonObject("labors").toString();
		String patient_blood_trans_type=this.getJsonObject("patient_blood_trans_type").toString();
		String donor_name = this.getJsonObject("donor_name").toString();
		String donor_blood_type=this.getJsonObject("donor_blood_type").toString();
		String donor_blood_num = this.getJsonObject("donor_blood_num").toString();
		String donor_blood_breed = this.getJsonObject("donor_blood_breed").toString();
		String donor_blood_volume = this.getJsonObject("donor_blood_volume").toString();
		String recheck_blood_result = this.getJsonObject("recheck_blood_result").toString();
		String cross_match_test_and_result = this.getJsonObject("cross_match_test_and_result").toString();
		String irregular_antibody_screen_res=this.getJsonObject("irregular_antibody_screen_res").toString();
		String other_examination_result = this.getJsonObject("other_examination_result").toString();
		String rechecker_id=this.getJsonObject("rechecker_id").toString();
		String cross_matcher_id = this.getJsonObject("cross_matcher_id").toString();
		String blood_pickup_id = this.getJsonObject("blood_pickup_id").toString();
		String blood_get_id = this.getJsonObject("blood_get_id").toString();
		String pickup_date = this.getJsonObject("pickup_date").toString();
    /*	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
		String log_time = df.format(new Date()).toString();// 获取当前系统时间为录入时间
*/		// set new BloodTransfusionRecord
		BloodTransfusionRecord bloodTransfusionRecord = new BloodTransfusionRecord();
		bloodTransfusionRecord.setPatient_id(patient_id);
		bloodTransfusionRecord.setHistory_blood_trans(history_blood_trans);
		bloodTransfusionRecord.setPregnancies(Integer.parseInt(pregnancies));
		bloodTransfusionRecord.setLabors(Integer.parseInt(labors));
		bloodTransfusionRecord.setPatient_blood_trans_type(patient_blood_trans_type);
		bloodTransfusionRecord.setDonor_name(donor_name);
		bloodTransfusionRecord.setDonor_blood_type(donor_blood_type);
		bloodTransfusionRecord.setDonor_blood_num(donor_blood_num);
		bloodTransfusionRecord.setDonor_blood_breed(donor_blood_breed);
		bloodTransfusionRecord.setDonor_blood_volume(donor_blood_volume);
		bloodTransfusionRecord.setRecheck_blood_result(recheck_blood_result);
		bloodTransfusionRecord.setCross_match_test_and_result(cross_match_test_and_result);
		bloodTransfusionRecord.setIrregular_antibody_screen_res(irregular_antibody_screen_res);
		bloodTransfusionRecord.setOther_examination_result(other_examination_result);
		bloodTransfusionRecord.setRechecker_id(rechecker_id);
		bloodTransfusionRecord.setCross_matcher_id(cross_matcher_id);
		bloodTransfusionRecord.setBlood_pickup_id(blood_pickup_id);
		bloodTransfusionRecord.setBlood_get_id(blood_get_id);
		bloodTransfusionRecord.setPickup_date(pickup_date);
		
		// save BloodTransfusionRecord
		bloodTransfusionRecordService.addBloodTransfusionRecord(bloodTransfusionRecord);
		// log and return
		String logContent = "完成添加输血记录(patient_id:" + bloodTransfusionRecord.getPatient_id()
				+ ")";
		ActionSupport.LOG.info(logContent);// 日志
		this.setErrorCodeAndResult("0", true);// 设置返回
		return SUCCESS;
	}

	public String getBloodTransfusionRecord() throws Exception {
		// getPara and validate
		String patient_id = this.getJsonObject("patient_id").toString();
		Validate.notNull(patient_id, "参数patient_id不可为空");
		// call service to query
		BloodTransfusionRecord bloodTransfusionRecord = new BloodTransfusionRecord();
		bloodTransfusionRecord.setPatient_id(patient_id);
		bloodTransfusionRecord = bloodTransfusionRecordService.getBloodTransfusionRecord(bloodTransfusionRecord);
		// construct result
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", bloodTransfusionRecord.getId());
		jsonObject.put("history_blood_trans", bloodTransfusionRecord.getHistory_blood_trans());
		jsonObject.put("pregnancies", bloodTransfusionRecord.getPregnancies());
		jsonObject.put("labors", bloodTransfusionRecord.getLabors());
		jsonObject.put("patient_blood_trans_type", bloodTransfusionRecord.getPatient_blood_trans_type());
		jsonObject.put("donor_name", bloodTransfusionRecord.getDonor_name());
		jsonObject.put("donor_blood_type", bloodTransfusionRecord.getDonor_blood_type());
		jsonObject.put("donor_blood_num", bloodTransfusionRecord.getDonor_blood_num());
		jsonObject.put("donor_blood_breed", bloodTransfusionRecord.getDonor_blood_breed());
		jsonObject.put("donor_blood_volume", bloodTransfusionRecord.getDonor_blood_volume());
		jsonObject.put("recheck_blood_result", bloodTransfusionRecord.getRecheck_blood_result());
		jsonObject.put("cross_match_test_and_result", bloodTransfusionRecord.getCross_match_test_and_result());
		jsonObject.put("irregular_antibody_screen_res", bloodTransfusionRecord.getIrregular_antibody_screen_res());
		jsonObject.put("other_examination_result", bloodTransfusionRecord.getOther_examination_result());
		jsonObject.put("rechecker_id", bloodTransfusionRecord.getRechecker_id());
		jsonObject.put("cross_matcher_id", bloodTransfusionRecord.getCross_matcher_id());
		jsonObject.put("blood_pickup_id", bloodTransfusionRecord.getBlood_pickup_id());
		jsonObject.put("blood_get_id", bloodTransfusionRecord.getBlood_get_id());
		jsonObject.put("pickup_date", bloodTransfusionRecord.getPickup_date());
		/*jsonObject.put("signature_id", BloodTransfusionRecord.getSignature_id());
		jsonObject.put("log_time", BloodTransfusionRecord.getLog_time());*/
		// reply message
		this.setErrorCodeAndResult("0", jsonObject);
		return SUCCESS;
	}

	public String updateBloodTransfusionRecord() throws Exception {
		//参数不为空
		String patient_id = this.getJsonObject("patient_id").toString();
		Validate.notNull(patient_id, "参数病案号不可为空");
		//参数可为空
		String history_blood_trans = this.getJsonObject("history_blood_trans").toString();
		String pregnancies=this.getJsonObject("pregnancies").toString();
		String labors = this.getJsonObject("labors").toString();
		String patient_blood_trans_type=this.getJsonObject("patient_blood_trans_type").toString();
		String donor_name = this.getJsonObject("donor_name").toString();
		String donor_blood_type=this.getJsonObject("donor_blood_type").toString();
		String donor_blood_num = this.getJsonObject("donor_blood_num").toString();
		String donor_blood_breed = this.getJsonObject("donor_blood_breed").toString();
		String donor_blood_volume = this.getJsonObject("donor_blood_volume").toString();
		String recheck_blood_result = this.getJsonObject("recheck_blood_result").toString();
		String cross_match_test_and_result = this.getJsonObject("cross_match_test_and_result").toString();
		String irregular_antibody_screen_res=this.getJsonObject("irregular_antibody_screen_res").toString();
		String other_examination_result = this.getJsonObject("other_examination_result").toString();
		String rechecker_id=this.getJsonObject("rechecker_id").toString();
		String cross_matcher_id = this.getJsonObject("cross_matcher_id").toString();
		String blood_pickup_id = this.getJsonObject("blood_pickup_id").toString();
		String blood_get_id = this.getJsonObject("blood_get_id").toString();
		String pickup_date = this.getJsonObject("pickup_date").toString();
		 /*	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
		String log_time = df.format(new Date()).toString();// 获取当前系统时间为录入时间
*/		// set new BloodTransfusionRecord
		BloodTransfusionRecord bloodTransfusionRecord = new BloodTransfusionRecord();
		bloodTransfusionRecord.setPatient_id(patient_id);
		bloodTransfusionRecord.setHistory_blood_trans(history_blood_trans);
		bloodTransfusionRecord.setPregnancies(Integer.parseInt(pregnancies));
		bloodTransfusionRecord.setLabors(Integer.parseInt(labors));
		bloodTransfusionRecord.setPatient_blood_trans_type(patient_blood_trans_type);
		bloodTransfusionRecord.setDonor_name(donor_name);
		bloodTransfusionRecord.setDonor_blood_type(donor_blood_type);
		bloodTransfusionRecord.setDonor_blood_num(donor_blood_num);
		bloodTransfusionRecord.setDonor_blood_breed(donor_blood_breed);
		bloodTransfusionRecord.setDonor_blood_volume(donor_blood_volume);
		bloodTransfusionRecord.setRecheck_blood_result(recheck_blood_result);
		bloodTransfusionRecord.setCross_match_test_and_result(cross_match_test_and_result);
		bloodTransfusionRecord.setIrregular_antibody_screen_res(irregular_antibody_screen_res);
		bloodTransfusionRecord.setOther_examination_result(other_examination_result);
		bloodTransfusionRecord.setRechecker_id(rechecker_id);
		bloodTransfusionRecord.setCross_matcher_id(cross_matcher_id);
		bloodTransfusionRecord.setBlood_pickup_id(blood_pickup_id);
		bloodTransfusionRecord.setBlood_get_id(blood_get_id);
		bloodTransfusionRecord.setPickup_date(pickup_date);
		// save BloodTransfusionRecord
		bloodTransfusionRecordService.updateBloodTransfusionRecord(bloodTransfusionRecord);
		// log and return
		String logContent = "更新输血记录完成(patient_id:" + bloodTransfusionRecord.getPatient_id()
				+ ")";
		ActionSupport.LOG.info(logContent);// 日志
		this.setErrorCodeAndResult("0", true);// 设置返回
		return SUCCESS;
	}

	public String deleteBloodTransfusionRecord() throws Exception {
		// getPara and validate
		String id = this.getJsonObject("id").toString();
		Validate.notNull(id, "参数id不可为空");
		// call service to query
		BloodTransfusionRecord bloodTransfusionRecord = new BloodTransfusionRecord();
		bloodTransfusionRecord.setId(id);
		bloodTransfusionRecordService.deleteBloodTransfusionRecord(bloodTransfusionRecord);
		// reply message
		this.setErrorCodeAndResult("0", true);
		return SUCCESS;
	}
	//分页查询
	public String getBloodTransfusionRecordList() throws Exception {
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
		List<BloodTransfusionRecord> bloodTransfusionRecordList = bloodTransfusionRecordService.getBloodTransfusionRecordList(page,patient_id);
		JSONArray jsonArray = new JSONArray();
		for(BloodTransfusionRecord bloodTransfusionRecord:bloodTransfusionRecordList){
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("id", bloodTransfusionRecord.getId());
			jsonObject.put("history_blood_trans", bloodTransfusionRecord.getHistory_blood_trans());
			jsonObject.put("pregnancies", bloodTransfusionRecord.getPregnancies());
			jsonObject.put("labors", bloodTransfusionRecord.getLabors());
			jsonObject.put("patient_blood_trans_type", bloodTransfusionRecord.getPatient_blood_trans_type());
			jsonObject.put("donor_name", bloodTransfusionRecord.getDonor_name());
			jsonObject.put("donor_blood_type", bloodTransfusionRecord.getDonor_blood_type());
			jsonObject.put("donor_blood_num", bloodTransfusionRecord.getDonor_blood_num());
			jsonObject.put("donor_blood_breed", bloodTransfusionRecord.getDonor_blood_breed());
			jsonObject.put("donor_blood_volume", bloodTransfusionRecord.getDonor_blood_volume());
			jsonObject.put("recheck_blood_result", bloodTransfusionRecord.getRecheck_blood_result());
			jsonObject.put("cross_match_test_and_result", bloodTransfusionRecord.getCross_match_test_and_result());
			jsonObject.put("irregular_antibody_screen_res", bloodTransfusionRecord.getIrregular_antibody_screen_res());
			jsonObject.put("other_examination_result", bloodTransfusionRecord.getOther_examination_result());
			jsonObject.put("rechecker_id", bloodTransfusionRecord.getRechecker_id());
			jsonObject.put("cross_matcher_id", bloodTransfusionRecord.getCross_matcher_id());
			jsonObject.put("blood_pickup_id", bloodTransfusionRecord.getBlood_pickup_id());
			jsonObject.put("blood_get_id", bloodTransfusionRecord.getBlood_get_id());
			jsonObject.put("pickup_date", bloodTransfusionRecord.getPickup_date());	
			jsonArray.add(jsonObject);
		}
		// reply message
		this.setErrorCodeAndResultByPage("0",jsonArray,sEcho,displayLength);
		return SUCCESS;
	}



}
