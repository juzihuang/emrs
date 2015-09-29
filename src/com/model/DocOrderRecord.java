package com.model;

/**
 * Created by azhl on 2015/9/9.
 */
public class DocOrderRecord {
    public final static int DEFAULT_INT_INVALID=-1;
    public final static int TYPE_LONG_ORDER=1;
    public final static int TYPE_SHORT_ORDER=0;
    private  long id;//
    private  long patient_record_id;//  病案号
    private  String content;//
    private  long  doctor_id;//
    private  String create_time;//
    private  String update_time;//
    private  int type;//

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }


    public long getPatient_record_id() {
        return patient_record_id;
    }

    public void setPatient_record_id(long patient_record_id) {
        this.patient_record_id = patient_record_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(long doctor_id) {
        this.doctor_id = doctor_id;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }
}
