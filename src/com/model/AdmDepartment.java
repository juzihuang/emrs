package com.model;

public class AdmDepartment {
    private long id;
    private long inpatient_area_id;
    private String name;
    private long department_direct_id;
    private long common_nurse_id;
    private String create_time;

    public long getInpatient_area_id() {
        return inpatient_area_id;
    }

    public void setInpatient_area_id(long inpatient_area_id) {
        this.inpatient_area_id = inpatient_area_id;
    }

    public long getCommon_nurse_id() {
        return common_nurse_id;
    }

    public void setCommon_nurse_id(long common_nurse_id) {
        this.common_nurse_id = common_nurse_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getDepartment_direct_id() {
        return department_direct_id;
    }

    public void setDepartment_direct_id(long department_direct_id) {
        this.department_direct_id = department_direct_id;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }
}
