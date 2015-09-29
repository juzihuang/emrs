package com.action;

import com.common.struts2.BaseAction;
import com.model.TemperatureRecord;
import com.model.TemperatureRecord;
import com.model.Page;
import com.opensymphony.xwork2.ActionSupport;
import com.service.TemperatureRecordService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
//import netscape.javascript.JSObject;
import org.apache.commons.lang.Validate;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by azhl on 2015/9/15.
 */
public class TemperatureRecordAction extends BaseAction{
    /**
     */
    private static final long serialVersionUID = 1L;
    @Autowired
    private TemperatureRecordService temperatureRecordService;
    @Autowired
    Page page;//按页查询参数
    /*
     * 体温记录
     */
    public String addTemperatureRecord(){
        // getPara and validate
        //参数不可为空
        String patient_id = this.getJsonObject("patient_id").toString();
        Validate.notNull(patient_id, "参数patient_id不可为空");
        //参数可为空
        /*this.getJsonObject("id").toString();
        this.getJsonObject("patient_id").toString();*/
        String  time_day=this.getJsonObject("time_day").toString();//2015 08 03
        String  time_hour_2=this.getJsonObject("time_hour_2").toString();
        String  time_hour_6=this.getJsonObject("time_hour_6").toString();
        String  time_hour_10=this.getJsonObject("time_hour_10").toString();
        String  time_hour_14=this.getJsonObject("time_hour_14").toString();
        String  time_hour_18=this.getJsonObject("time_hour_18").toString();
        String  time_hour_22=this.getJsonObject("time_hour_22").toString();
        String  days_after_operation=this.getJsonObject("days_after_operation").toString();
        String  pulse=this.getJsonObject("pulse").toString();
        String  breath=this.getJsonObject("breath").toString();
        String  blood_pressure=this.getJsonObject("blood_pressure").toString();
        String  stool_frequency=this.getJsonObject("stool_frequency").toString();
        String  fluid_in=this.getJsonObject("fluid_in").toString();
        String  fluid_out=this.getJsonObject("fluid_out").toString();
        String  fluid_sum=this.getJsonObject("fluid_sum").toString();
        String  weight=this.getJsonObject("weight").toString();
        String  height=this.getJsonObject("height").toString();
        String  allergen=this.getJsonObject("allergen").toString();
        String  urinary_volume=this.getJsonObject("urinary_volume").toString();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
        String create_time = df.format(new Date()).toString();// 获取当前系统时间为录入时间
        // set new TemperatureRecord
        TemperatureRecord temperatureRecord=new TemperatureRecord();
        temperatureRecord.setPatient_id(patient_id);
        temperatureRecord.setTime_day(time_day);
        temperatureRecord.setTime_hour_2(Float.parseFloat(time_hour_2));
        temperatureRecord.setTime_hour_6(Float.parseFloat(time_hour_6));
        temperatureRecord.setTime_hour_10(Float.parseFloat(time_hour_10));
        temperatureRecord.setTime_hour_14(Float.parseFloat(time_hour_14));
        temperatureRecord.setTime_hour_18(Float.parseFloat(time_hour_18));
        temperatureRecord.setTime_hour_22(Float.parseFloat(time_hour_22));
        temperatureRecord.setDays_after_operation(Integer.parseInt(days_after_operation));
        temperatureRecord.setPulse(Integer.parseInt(pulse));
        temperatureRecord.setBreath(Integer.parseInt(breath));
        temperatureRecord.setBlood_pressure(blood_pressure);
        temperatureRecord.setStool_frequency(Integer.parseInt(stool_frequency));
        temperatureRecord.setFluid_in(Float.parseFloat(fluid_in));
        temperatureRecord.setFluid_out(Float.parseFloat(fluid_out));
        temperatureRecord.setFluid_sum(Float.parseFloat(fluid_sum));
        temperatureRecord.setWeight(Float.parseFloat(weight));
        temperatureRecord.setHeight(Float.parseFloat(height));
        temperatureRecord.setAllergen(allergen);
        temperatureRecord.setUrinary_volume(Long.parseLong(urinary_volume));
        temperatureRecord.setCreate_time(create_time);
        // save temperatureRecord
        temperatureRecordService.addTemperatureRecord(temperatureRecord);
        // log and return
        String logContent = "完成添加体温记录(temperatureRecord_number:" + temperatureRecord.getPatient_id()
                + ")";
        ActionSupport.LOG.info(logContent);// 
        this.setErrorCodeAndResult("0", true);// 
        return SUCCESS;
    }
    public String updateTemperatureRecord(){
        // getPara and validate
        //参数不可为空
        String patient_id = this.getJsonObject("patient_id").toString();
        Validate.notNull(patient_id, "参数病案号不可为空");
      //参数可为空
        /*this.getJsonObject("id").toString();
        this.getJsonObject("patient_id").toString();*/
        String  time_day=this.getJsonObject("time_day").toString();//��ʽ2015 08 03
        String  time_hour_2=this.getJsonObject("time_hour_2").toString();
        String  time_hour_6=this.getJsonObject("time_hour_6").toString();
        String  time_hour_10=this.getJsonObject("time_hour_10").toString();
        String  time_hour_14=this.getJsonObject("time_hour_14").toString();
        String  time_hour_18=this.getJsonObject("time_hour_18").toString();
        String  time_hour_22=this.getJsonObject("time_hour_22").toString();
        String  days_after_operation=this.getJsonObject("days_after_operation").toString();
        String  pulse=this.getJsonObject("pulse").toString();
        String  breath=this.getJsonObject("breath").toString();
        String  blood_pressure=this.getJsonObject("blood_pressure").toString();
        String  stool_frequency=this.getJsonObject("stool_frequency").toString();
        String  fluid_in=this.getJsonObject("fluid_in").toString();
        String  fluid_out=this.getJsonObject("fluid_out").toString();
        String  fluid_sum=this.getJsonObject("fluid_sum").toString();
        String  weight=this.getJsonObject("weight").toString();
        String  height=this.getJsonObject("height").toString();
        String  allergen=this.getJsonObject("allergen").toString();
        String  urinary_volume=this.getJsonObject("urinary_volume").toString();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
        String create_time = df.format(new Date()).toString();// 获取当前系统时间为录入时间
        // set new TemperatureRecord
        TemperatureRecord temperatureRecord=new TemperatureRecord();
        temperatureRecord.setPatient_id(patient_id);
        temperatureRecord.setTime_day(time_day);
        temperatureRecord.setTime_hour_2(Float.parseFloat(time_hour_2));
        temperatureRecord.setTime_hour_6(Float.parseFloat(time_hour_6));
        temperatureRecord.setTime_hour_10(Float.parseFloat(time_hour_10));
        temperatureRecord.setTime_hour_14(Float.parseFloat(time_hour_14));
        temperatureRecord.setTime_hour_18(Float.parseFloat(time_hour_18));
        temperatureRecord.setTime_hour_22(Float.parseFloat(time_hour_22));
        temperatureRecord.setDays_after_operation(Integer.parseInt(days_after_operation));
        temperatureRecord.setPulse(Integer.parseInt(pulse));
        temperatureRecord.setBreath(Integer.parseInt(breath));
        temperatureRecord.setBlood_pressure(blood_pressure);
        temperatureRecord.setStool_frequency(Integer.parseInt(stool_frequency));
        temperatureRecord.setFluid_in(Float.parseFloat(fluid_in));
        temperatureRecord.setFluid_out(Float.parseFloat(fluid_out));
        temperatureRecord.setFluid_sum(Float.parseFloat(fluid_sum));
        temperatureRecord.setWeight(Float.parseFloat(weight));
        temperatureRecord.setHeight(Float.parseFloat(height));
        temperatureRecord.setAllergen(allergen);
        temperatureRecord.setUrinary_volume(Long.parseLong(urinary_volume));
        temperatureRecord.setCreate_time(create_time);
        // save temperatureRecord
        temperatureRecordService.updateTemperatureRecord(temperatureRecord);
        // log and return
        String logContent = "完成更新体温记录(temperatureRecord_number:" + temperatureRecord.getPatient_id()
                + ")";
        ActionSupport.LOG.info(logContent);// ��־
        this.setErrorCodeAndResult("0", true);// ���÷���
        return SUCCESS;
    }
    public String deleteTemperatureRecord() throws Exception {
        // getPara and validate
        String id = this.getJsonObject("id").toString();
        Validate.notNull(id, "参数id不可为空");
        // call service to query
        TemperatureRecord temperatureRecord = new TemperatureRecord();
        temperatureRecord.setId(id);
        temperatureRecordService.deleteTemperatureRecord(temperatureRecord);
        // reply message
        this.setErrorCodeAndResult("0", true);
        return SUCCESS;
    }
    public String getTemperatureRecord() throws Exception {
        // getPara and validate
        String id = this.getJsonObject("id").toString();
        Validate.notNull(id, "参数id不可为空");
        // call service to query
        TemperatureRecord temperatureRecord = new TemperatureRecord();
        temperatureRecord.setId(id);
        temperatureRecord = temperatureRecordService.getTemperatureRecord(temperatureRecord);
        // construct result
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", temperatureRecord.getId());
        jsonObject.put("patient_id", temperatureRecord.getPatient_id());
        jsonObject.put("time_day", temperatureRecord.getTime_day());
        jsonObject.put("time_hour_2", temperatureRecord.getTime_hour_2());
        jsonObject.put("time_hour_6", temperatureRecord.getTime_hour_6());
        jsonObject.put("time_hour_10", temperatureRecord.getTime_hour_10());
        jsonObject.put("time_hour_14", temperatureRecord.getTime_hour_14());
        jsonObject.put("time_hour_18", temperatureRecord.getTime_hour_18());
        jsonObject.put("time_hour_22", temperatureRecord.getTime_hour_22());
        jsonObject.put("days_after_operation", temperatureRecord.getDays_after_operation());
        jsonObject.put("pulse", temperatureRecord.getPulse());
        jsonObject.put("breath", temperatureRecord.getBreath());
        jsonObject.put("blood_pressure", temperatureRecord.getBlood_pressure());
        jsonObject.put("stool_frequency", temperatureRecord.getStool_frequency());
        jsonObject.put("fluid_in", temperatureRecord.getFluid_in());
        jsonObject.put("fluid_out", temperatureRecord.getFluid_out());
        jsonObject.put("fluid_sum", temperatureRecord.getFluid_sum());
        jsonObject.put("weight", temperatureRecord.getWeight());
        jsonObject.put("height", temperatureRecord.getHeight());
        jsonObject.put("allergen", temperatureRecord.getAllergen());
        jsonObject.put("urinary_volume", temperatureRecord.getUrinary_volume());
        jsonObject.put("create_time", temperatureRecord.getCreate_time());
        // reply message
        this.setErrorCodeAndResult("0", jsonObject);
        return SUCCESS;
    }
    //分页查询
    public String getTemperatureRecordList() throws Exception {
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
        List<TemperatureRecord> temperatureRecordList = temperatureRecordService.getTemperatureRecordList(page);
        JSONArray jsonArray = new JSONArray();
        for(TemperatureRecord temperatureRecord:temperatureRecordList){
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("patient_id", temperatureRecord.getPatient_id());
            jsonObject.put("id", temperatureRecord.getId());
            jsonObject.put("time_day", temperatureRecord.getTime_day());
            jsonObject.put("create_time", temperatureRecord.getCreate_time());
            jsonArray.add(jsonObject);
        }
        // reply message
        this.setErrorCodeAndResultByPage("0",jsonArray,sEcho,displayLength);
        return SUCCESS;
    }

}
