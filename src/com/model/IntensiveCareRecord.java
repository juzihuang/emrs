package com.model;

/**
 * Created by HFF on 2015/9/24.
 */
public class IntensiveCareRecord {
    private String  id ;    
    private String  patient_id;   //病案号
    private String  date ;       //日期、时间
    private String  temperature ;  //体温
    private String  pulse;   //脉搏
    private String  breath;    //呼吸
    private String  blood_pressure;    //血压
    private String  oxygen_saturation;  //血氧饱和
    private String  input_amount_liquid ;   //入量_液量
    private String  input_amount_other ;    //入量_其他
    private String  output_amount_urine ;    //出量_尿量
    private String  output_amount_other ;    //出量_其他
    private String  condition_and_treatment ;   //病情及治疗
    private String  recorder_id ;    //签名

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getPulse() {
        return pulse;
    }

    public void setPulse(String pulse) {
        this.pulse = pulse;
    }

    public String getBlood_pressure() {
        return blood_pressure;
    }

    public void setBlood_pressure(String blood_pressure) {
        this.blood_pressure = blood_pressure;
    }

    public String getBreath() {
        return breath;
    }

    public void setBreath(String breath) {
        this.breath = breath;
    }

    public String getOxygen_saturation() {
        return oxygen_saturation;
    }

    public void setOxygen_saturation(String oxygen_saturation) {
        this.oxygen_saturation = oxygen_saturation;
    }

    public String getInput_amount_liquid() {
        return input_amount_liquid;
    }

    public void setInput_amount_liquid(String input_amount_liquid) {
        this.input_amount_liquid = input_amount_liquid;
    }

    public String getInput_amount_other() {
        return input_amount_other;
    }

    public void setInput_amount_other(String input_amount_other) {
        this.input_amount_other = input_amount_other;
    }

    public String getOutput_amount_urine() {
        return output_amount_urine;
    }

    public void setOutput_amount_urine(String output_amount_urine) {
        this.output_amount_urine = output_amount_urine;
    }

    public String getOutput_amount_other() {
        return output_amount_other;
    }

    public void setOutput_amount_other(String output_amount_other) {
        this.output_amount_other = output_amount_other;
    }

    public String getCondition_and_treatment() {
        return condition_and_treatment;
    }

    public void setCondition_and_treatment(String condition_and_treatment) {
        this.condition_and_treatment = condition_and_treatment;
    }

    public String getRecorder_id() {
        return recorder_id;
    }

    public void setRecorder_id(String recorder_id) {
        this.recorder_id = recorder_id;
    }

}
