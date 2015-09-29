package com.model;

/**
 * Created by azhl on 2015/9/14.
 */
public class TemperatureRecord {
    private String id;
    private String patient_id;
    private String time_day;
    private float time_hour_2;
    private float time_hour_6;
    private float time_hour_10;
    private float time_hour_14;
    private float time_hour_18;
    private float time_hour_22;
    private int days_after_operation;
    private int pulse;
    private int breath;
    private String blood_pressure;
    private int stool_frequency;
    private float fluid_in;
    private float fluid_out;
    private float fluid_sum;
    private float weight;
    private float height;
    private String allergen;
    private float urinary_volume;
    private String create_time;

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

    public String getTime_day() {
        return time_day;
    }

    public void setTime_day(String time_day) {
        this.time_day = time_day;
    }

    public float getTime_hour_2() {
        return time_hour_2;
    }

    public void setTime_hour_2(float time_hour_2) {
        this.time_hour_2 = time_hour_2;
    }

    public float getTime_hour_6() {
        return time_hour_6;
    }

    public void setTime_hour_6(float time_hour_6) {
        this.time_hour_6 = time_hour_6;
    }

    public float getTime_hour_10() {
        return time_hour_10;
    }

    public void setTime_hour_10(float time_hour_10) {
        this.time_hour_10 = time_hour_10;
    }

    public float getTime_hour_14() {
        return time_hour_14;
    }

    public void setTime_hour_14(float time_hour_14) {
        this.time_hour_14 = time_hour_14;
    }

    public float getTime_hour_18() {
        return time_hour_18;
    }

    public void setTime_hour_18(float time_hour_18) {
        this.time_hour_18 = time_hour_18;
    }

    public float getTime_hour_22() {
        return time_hour_22;
    }

    public void setTime_hour_22(float time_hour_22) {
        this.time_hour_22 = time_hour_22;
    }

    public int getDays_after_operation() {
        return days_after_operation;
    }

    public void setDays_after_operation(int days_after_operation) {
        this.days_after_operation = days_after_operation;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public int getBreath() {
        return breath;
    }

    public void setBreath(int breath) {
        this.breath = breath;
    }

    public String getBlood_pressure() {
        return blood_pressure;
    }

    public void setBlood_pressure(String blood_pressure) {
        this.blood_pressure = blood_pressure;
    }

    public int getStool_frequency() {
        return stool_frequency;
    }

    public void setStool_frequency(int stool_frequency) {
        this.stool_frequency = stool_frequency;
    }

    public float getFluid_in() {
        return fluid_in;
    }

    public void setFluid_in(float fluid_in) {
        this.fluid_in = fluid_in;
    }

    public float getFluid_out() {
        return fluid_out;
    }

    public void setFluid_out(float fluid_out) {
        this.fluid_out = fluid_out;
    }

    public float getFluid_sum() {
        return fluid_sum;
    }

    public void setFluid_sum(float fluid_sum) {
        this.fluid_sum = fluid_sum;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getAllergen() {
        return allergen;
    }

    public void setAllergen(String allergen) {
        this.allergen = allergen;
    }

    public float getUrinary_volume() {
        return urinary_volume;
    }

    public void setUrinary_volume(float urinary_volume) {
        this.urinary_volume = urinary_volume;
    }

    public String  getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }
}
