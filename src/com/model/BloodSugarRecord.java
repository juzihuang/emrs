package com.model;

public class BloodSugarRecord {
	private String  id;
	private String  patient_id;   //病案号
	private String  date;    //日期
	private float  before_breakfast;    //早餐前
	private float  after_breakfast;   //早餐后
	private float  before_lunch;   //午餐前
	private float  after_lunch;    //午餐后
	private float  before_supper;   //晚餐前
	private float  after_supper;   //晚餐后
	private String  mark;   //备注
	private long  doctor_id;    //医生签名
	private long  nurse_id;   //护士签名

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
    
    public float getBefore_breakfast() {
        return before_breakfast;
    }

    public void setBefore_breakfast(float before_breakfast) {
        this.before_breakfast = before_breakfast;
    }
    
    public float getAfter_breakfast() {
        return after_breakfast;
    }

    public void setAfter_breakfast(float after_breakfast) {
        this.after_breakfast = after_breakfast;
    }
    
    public float getBefore_lunch() {
        return before_lunch;
    }

    public void setBefore_lunch(float before_lunch) {
        this.before_lunch = before_lunch;
    }
    
    public float getAfter_lunch() {
        return after_lunch;
    }

    public void setAfter_lunch(float after_lunch) {
        this.after_lunch = after_lunch;
    }
    
    public float getBefore_supper() {
        return before_supper;
    }

    public void setBefore_supper(float before_supper) {
        this.before_supper = before_supper;
    }
    
    public float getAfter_supper() {
        return after_supper;
    }

    public void setAfter_supper(float after_supper) {
        this.after_supper = after_supper;
    }
  
    public String getMark() {
        return mark;
    }
    
    public void setMark(String mark) {
        this.mark = mark;
    }
    
    public long getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(long doctor_id) {
        this.doctor_id = doctor_id;
    }
    
    public long getNurse_id() {
        return nurse_id;
    }

    public void setNurse_id(long nurse_id) {
        this.nurse_id = nurse_id;
    }

}
