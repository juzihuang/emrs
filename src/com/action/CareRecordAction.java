package com.action;

import com.common.struts2.BaseAction;
import com.model.CareRecord;
import com.model.Page;
import com.opensymphony.xwork2.ActionSupport;
import com.service.CareRecordService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.lang.Validate;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class CareRecordAction extends BaseAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	private CareRecordService careRecordService;
	@Autowired
	Page page;//按页查询参数
	/*
	 * 添加病区 2015/9/6
	 */
	public String addCareRecord() {
		// getPara and validate
		//参数不为空
		String patient_record_number = this.getJsonObject("patient_record_number").toString();
		Validate.notNull(patient_record_number, "参数病案号不可为空");
		//参数可为空
		String  doctor_diagnosis = this.getJsonObject("doctor_diagnosis").toString();
		String  in_hospital_time= this.getJsonObject("in_hospital_time").toString();
		String  disease_degree = this.getJsonObject("disease_degree").toString();
		String  in_hospital_way = this.getJsonObject("in_hospital_way").toString();
		String  history_and_main = this.getJsonObject("history_and_main").toString();
		String  abnormal_character = this.getJsonObject("abnormal_character").toString();
		String  temperature = this.getJsonObject("temperature").toString();
		String  pulse = this.getJsonObject("pulse").toString();
		String  pulse_describe = this.getJsonObject("pulse_describe").toString();
		String  boold_pressure = this.getJsonObject("boold_pressure").toString();
		String  breath = this.getJsonObject("breath").toString();
		String  breath_describe = this.getJsonObject("breath_describe").toString();
		String  pupil_describe = this.getJsonObject("pupil_describe").toString();
		String  consciousness = this.getJsonObject("consciousness").toString();
		String  sprit = this.getJsonObject("sprit").toString();
		String  skin_describe = this.getJsonObject("skin_describe").toString();
		String  oral_cavity_decribe = this.getJsonObject("oral_cavity_decribe").toString();
		String  mucosa_decribe = this.getJsonObject("mucosa_decribe").toString();
		String  sight_decribe = this.getJsonObject("sight_decribe").toString();
		String  hearing_decribe = this.getJsonObject("hearing_decribe").toString();
		String  drain_big_decribe = this.getJsonObject("drain_big_decribe").toString();
		String  drain_small_decribe = this.getJsonObject("drain_small_decribe").toString();
		String  drain_else = this.getJsonObject("drain_else").toString();
		String  transport_ability_describe = this.getJsonObject("transport_ability_describe").toString();
		String  language_ability = this.getJsonObject("language_ability").toString();
		String  self_care = this.getJsonObject("self_care").toString();
		String  career = this.getJsonObject("career").toString();
		String  culture = this.getJsonObject("culture").toString();
		String  marray = this.getJsonObject("marray").toString();
		String  child = this.getJsonObject("child").toString();
		String  pay_way = this.getJsonObject("pay_way").toString();
		String  smoke = this.getJsonObject("smoke").toString();
		String  alcohol = this.getJsonObject("alcohol").toString();
		String  diet = this.getJsonObject("diet").toString();
		String  sleep = this.getJsonObject("sleep").toString();
		String  allergic_medicine = this.getJsonObject("allergic_medicine").toString();
		String  allergic_food = this.getJsonObject("allergic_food").toString();
		String  allergic_else = this.getJsonObject("allergic_else").toString();
		String  care_level = this.getJsonObject("care_level").toString();
		String  care_decumbence = this.getJsonObject("care_decumbence").toString();
		String  care_diet = this.getJsonObject("care_diet").toString();
		String  cure_way = this.getJsonObject("cure_way").toString();
		String  care_solution = this.getJsonObject("care_solution").toString();
		String  way_and_outcome = this.getJsonObject("way_and_outcome").toString();
		String  signature_id = this.getJsonObject("signature_id").toString();
		//String  log_time = this.getJsonObject("log_time").toString();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
		String log_time = df.format(new Date()).toString();// 获取当前系统时间为录入时间
		// set new CareRecord
		CareRecord careRecord = new CareRecord();
		careRecord.setPatient_record_number(patient_record_number);
		careRecord.setDoctor_diagnosis(doctor_diagnosis);
		careRecord.setIn_hospital_time(in_hospital_time);
		careRecord.setDisease_degree(disease_degree);
		careRecord.setIn_hospital_way(in_hospital_way);
		careRecord.setHistory_and_main(history_and_main);
		careRecord.setAbnormal_character(abnormal_character);
		careRecord.setTemperature(temperature);
		careRecord.setPulse(pulse);
		careRecord.setPulse_describe(pulse_describe);
		careRecord.setBoold_pressure(boold_pressure);
		careRecord.setBreath(breath);
		careRecord.setBreath_describe(breath_describe);
		careRecord.setPupil_describe(pupil_describe);
		careRecord.setConsciousness(consciousness);
		careRecord.setSprit(sprit);
		careRecord.setSkin_describe(skin_describe);
		careRecord.setOral_cavity_decribe(oral_cavity_decribe);
		careRecord.setMucosa_decribe(mucosa_decribe);
		careRecord.setSight_decribe(sight_decribe);
		careRecord.setHearing_decribe(hearing_decribe);
		careRecord.setDrain_big_decribe(drain_big_decribe);
		careRecord.setDrain_small_decribe(drain_small_decribe);
		careRecord.setDrain_else(drain_else);
		careRecord.setTransport_ability_describe(transport_ability_describe);
		careRecord.setLanguage_ability(language_ability);
		careRecord.setSelf_care(self_care);
		careRecord.setCareer(career);
		careRecord.setCulture(culture);
		careRecord.setMarray(marray);
		careRecord.setChild(child);
		careRecord.setPay_way(pay_way);
		careRecord.setSmoke(smoke);
		careRecord.setAlcohol(alcohol);
		careRecord.setDiet(diet);
		careRecord.setSleep(sleep);
		careRecord.setAllergic_medicine(allergic_medicine);
		careRecord.setAllergic_food(allergic_food);
		careRecord.setAllergic_else(allergic_else);
		careRecord.setCare_level(care_level);
		careRecord.setCare_decumbence(care_decumbence);
		careRecord.setCare_diet(care_diet);
		careRecord.setCure_way(cure_way);
		careRecord.setCare_solution(care_solution);
		careRecord.setWay_and_outcome(way_and_outcome);
		careRecord.setSignature_id(signature_id);
		careRecord.setLog_time(log_time);
		// save careRecord
		careRecordService.addCareRecord(careRecord);
		// log and return
		String logContent = "完成添加一般护理记录(careRecord_number:" + careRecord.getPatient_record_number()
				+ ")";
		ActionSupport.LOG.info(logContent);// 日志
		this.setErrorCodeAndResult("0", true);// 设置返回
		return SUCCESS;
	}

	public String getCareRecord() throws Exception {
		// getPara and validate
		String id = this.getJsonObject("id").toString();
		Validate.notNull(id, "参数id不可为空");
		// call service to query
		CareRecord careRecord = new CareRecord();
		careRecord.setId(id);
		careRecord = careRecordService.getCareRecord(careRecord);
		// construct result
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", careRecord.getId());
		jsonObject.put("patient_record_number", careRecord.getPatient_record_number());
		jsonObject.put("doctor_diagnosis", careRecord.getDoctor_diagnosis());
		jsonObject.put("in_hospital_time", careRecord.getIn_hospital_time());
		jsonObject.put("disease_degree", careRecord.getDisease_degree());
		jsonObject.put("in_hospital_way", careRecord.getIn_hospital_way());
		jsonObject.put("history_and_main", careRecord.getHistory_and_main());
		jsonObject.put("abnormal_character", careRecord.getAbnormal_character());
		jsonObject.put("temperature", careRecord.getTemperature());
		jsonObject.put("pulse", careRecord.getPulse());
		jsonObject.put("pulse_describe", careRecord.getPulse_describe());
		jsonObject.put("boold_pressure", careRecord.getBoold_pressure());
		jsonObject.put("breath", careRecord.getBreath());
		jsonObject.put("breath_describe", careRecord.getBreath_describe());
		jsonObject.put("pupil_describe", careRecord.getPupil_describe());
		jsonObject.put("consciousness", careRecord.getConsciousness());
		jsonObject.put("sprit", careRecord.getSprit());
		jsonObject.put("skin_describe", careRecord.getSkin_describe());
		jsonObject.put("oral_cavity_decribe", careRecord.getOral_cavity_decribe());
		jsonObject.put("mucosa_decribe", careRecord.getMucosa_decribe());
		jsonObject.put("sight_decribe", careRecord.getSight_decribe());
		jsonObject.put("hearing_decribe", careRecord.getHearing_decribe());
		jsonObject.put("drain_big_decribe", careRecord.getDrain_big_decribe());
		jsonObject.put("drain_small_decribe", careRecord.getDrain_small_decribe());
		jsonObject.put("drain_else", careRecord.getDrain_else());
		jsonObject.put("transport_ability_describe", careRecord.getTransport_ability_describe());
		jsonObject.put("language_ability", careRecord.getLanguage_ability());
		jsonObject.put("self_care", careRecord.getSelf_care());
		jsonObject.put("career", careRecord.getCareer());
		jsonObject.put("culture", careRecord.getCulture());
		jsonObject.put("marray", careRecord.getMarray());
		jsonObject.put("child", careRecord.getChild());
		jsonObject.put("pay_way", careRecord.getPay_way());
		jsonObject.put("smoke", careRecord.getSmoke());
		jsonObject.put("alcohol", careRecord.getAlcohol());
		jsonObject.put("diet", careRecord.getDiet());
		jsonObject.put("sleep", careRecord.getSleep());
		jsonObject.put("allergic_medicine", careRecord.getAllergic_medicine());
		jsonObject.put("allergic_food", careRecord.getAllergic_food());
		jsonObject.put("allergic_else", careRecord.getAllergic_else());
		jsonObject.put("care_level", careRecord.getCare_level());
		jsonObject.put("care_decumbence", careRecord.getCare_decumbence());
		jsonObject.put("care_diet", careRecord.getCare_diet());
		jsonObject.put("cure_way", careRecord.getCure_way());
		jsonObject.put("care_solution", careRecord.getCare_solution());
		jsonObject.put("way_and_outcome", careRecord.getWay_and_outcome());
		jsonObject.put("signature_id", careRecord.getSignature_id());
		jsonObject.put("log_time", careRecord.getLog_time());
		// reply message
		this.setErrorCodeAndResult("0", jsonObject);
		return SUCCESS;
	}

	public String updateCareRecord() throws Exception {
		//参数不为空
		String patient_record_number = this.getJsonObject("patient_record_number").toString();
		Validate.notNull(patient_record_number, "参数病案号不可为空");
		//参数可为空
		String  doctor_diagnosis = this.getJsonObject("doctor_diagnosis").toString();
		String  in_hospital_time= this.getJsonObject("in_hospital_time").toString();
		String  disease_degree = this.getJsonObject("disease_degree").toString();
		String  in_hospital_way = this.getJsonObject("in_hospital_way").toString();
		String  history_and_main = this.getJsonObject("history_and_main").toString();
		String  abnormal_character = this.getJsonObject("abnormal_character").toString();
		String  temperature = this.getJsonObject("temperature").toString();
		String  pulse = this.getJsonObject("pulse").toString();
		String  pulse_describe = this.getJsonObject("pulse_describe").toString();
		String  boold_pressure = this.getJsonObject("boold_pressure").toString();
		String  breath = this.getJsonObject("breath").toString();
		String  breath_describe = this.getJsonObject("breath_describe").toString();
		String  pupil_describe = this.getJsonObject("pupil_describe").toString();
		String  consciousness = this.getJsonObject("consciousness").toString();
		String  sprit = this.getJsonObject("sprit").toString();
		String  skin_describe = this.getJsonObject("skin_describe").toString();
		String  oral_cavity_decribe = this.getJsonObject("oral_cavity_decribe").toString();
		String  mucosa_decribe = this.getJsonObject("mucosa_decribe").toString();
		String  sight_decribe = this.getJsonObject("sight_decribe").toString();
		String  hearing_decribe = this.getJsonObject("hearing_decribe").toString();
		String  drain_big_decribe = this.getJsonObject("drain_big_decribe").toString();
		String  drain_small_decribe = this.getJsonObject("drain_small_decribe").toString();
		String  drain_else = this.getJsonObject("drain_else").toString();
		String  transport_ability_describe = this.getJsonObject("transport_ability_describe").toString();
		String  language_ability = this.getJsonObject("language_ability").toString();
		String  self_care = this.getJsonObject("self_care").toString();
		String  career = this.getJsonObject("career").toString();
		String  culture = this.getJsonObject("culture").toString();
		String  marray = this.getJsonObject("marray").toString();
		String  child = this.getJsonObject("child").toString();
		String  pay_way = this.getJsonObject("pay_way").toString();
		String  smoke = this.getJsonObject("smoke").toString();
		String  alcohol = this.getJsonObject("alcohol").toString();
		String  diet = this.getJsonObject("diet").toString();
		String  sleep = this.getJsonObject("sleep").toString();
		String  allergic_medicine = this.getJsonObject("allergic_medicine").toString();
		String  allergic_food = this.getJsonObject("allergic_food").toString();
		String  allergic_else = this.getJsonObject("allergic_else").toString();
		String  care_level = this.getJsonObject("care_level").toString();
		String  care_decumbence = this.getJsonObject("care_decumbence").toString();
		String  care_diet = this.getJsonObject("care_diet").toString();
		String  cure_way = this.getJsonObject("cure_way").toString();
		String  care_solution = this.getJsonObject("care_solution").toString();
		String  way_and_outcome = this.getJsonObject("way_and_outcome").toString();
		String  signature_id = this.getJsonObject("signature_id").toString();
		//String  log_time = this.getJsonObject("log_time").toString();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
		String log_time = df.format(new Date()).toString();// 获取当前系统时间为录入时间
		// set new CareRecord
		CareRecord careRecord = new CareRecord();
		careRecord.setPatient_record_number(patient_record_number);
		careRecord.setDoctor_diagnosis(doctor_diagnosis);
		careRecord.setIn_hospital_time(in_hospital_time);
		careRecord.setDisease_degree(disease_degree);
		careRecord.setIn_hospital_way(in_hospital_way);
		careRecord.setHistory_and_main(history_and_main);
		careRecord.setAbnormal_character(abnormal_character);
		careRecord.setTemperature(temperature);
		careRecord.setPulse(pulse);
		careRecord.setPulse_describe(pulse_describe);
		careRecord.setBoold_pressure(boold_pressure);
		careRecord.setBreath(breath);
		careRecord.setBreath_describe(breath_describe);
		careRecord.setPupil_describe(pupil_describe);
		careRecord.setConsciousness(consciousness);
		careRecord.setSprit(sprit);
		careRecord.setSkin_describe(skin_describe);
		careRecord.setOral_cavity_decribe(oral_cavity_decribe);
		careRecord.setMucosa_decribe(mucosa_decribe);
		careRecord.setSight_decribe(sight_decribe);
		careRecord.setHearing_decribe(hearing_decribe);
		careRecord.setDrain_big_decribe(drain_big_decribe);
		careRecord.setDrain_small_decribe(drain_small_decribe);
		careRecord.setDrain_else(drain_else);
		careRecord.setTransport_ability_describe(transport_ability_describe);
		careRecord.setLanguage_ability(language_ability);
		careRecord.setSelf_care(self_care);
		careRecord.setCareer(career);
		careRecord.setCulture(culture);
		careRecord.setMarray(marray);
		careRecord.setChild(child);
		careRecord.setPay_way(pay_way);
		careRecord.setSmoke(smoke);
		careRecord.setAlcohol(alcohol);
		careRecord.setDiet(diet);
		careRecord.setSleep(sleep);
		careRecord.setAllergic_medicine(allergic_medicine);
		careRecord.setAllergic_food(allergic_food);
		careRecord.setAllergic_else(allergic_else);
		careRecord.setCare_level(care_level);
		careRecord.setCare_decumbence(care_decumbence);
		careRecord.setCare_diet(care_diet);
		careRecord.setCure_way(cure_way);
		careRecord.setCare_solution(care_solution);
		careRecord.setWay_and_outcome(way_and_outcome);
		careRecord.setSignature_id(signature_id);
		careRecord.setLog_time(log_time);
		// save careRecord
		careRecordService.updateCareRecord(careRecord);
		// log and return
		String logContent = "完成更新一般护理记录(careRecord_number:" + careRecord.getPatient_record_number()
				+ ")";
		ActionSupport.LOG.info(logContent);// 日志
		this.setErrorCodeAndResult("0", true);// 设置返回
		return SUCCESS;
	}

	public String deleteCareRecord() throws Exception {
		// getPara and validate
		String id = this.getJsonObject("id").toString();
		Validate.notNull(id, "参数id不可为空");
		// call service to query
		CareRecord careRecord = new CareRecord();
		careRecord.setId(id);
		careRecordService.deleteCareRecord(careRecord);
		// reply message
		this.setErrorCodeAndResult("0", true);
		return SUCCESS;
	}
	//分页查询
	public String getCareRecordList() throws Exception {
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
		String patient_record_number = this.getJsonObject("patient_record_number").toString();
		Validate.notNull(patient_record_number, "参数病案号不可为空");

		//查询
		List<CareRecord> careRecordList = careRecordService.getCareRecordList(page,patient_record_number);
		JSONArray jsonArray = new JSONArray();
		for(CareRecord careRecord:careRecordList){
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("id", careRecord.getId());
			jsonObject.put("patient_record_number", careRecord.getPatient_record_number());
			jsonObject.put("signature_id", careRecord.getSignature_id());
			jsonObject.put("log_time", careRecord.getLog_time());
			jsonArray.add(jsonObject);
		}
		// reply message
		this.setErrorCodeAndResultByPage("0",jsonArray,sEcho,displayLength);
		return SUCCESS;
	}



}
