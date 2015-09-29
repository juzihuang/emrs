package com.model;

/**
 * modified by hff on 2015/9/29.
 */
public class TemperatureRecord {
    private String id;
    private String patient_id;
    private String time_day;
    private float time_hour_2_temperature;
    private float time_hour_6_temperature;
    private float time_hour_10_temperature;
    private float time_hour_14_temperature;
    private float time_hour_18_temperature;
    private float time_hour_22_temperature;
    private float time_hour_2_breath;
    private float time_hour_6_breath;
    private float time_hour_10_breath;
    private float time_hour_14_breath;
    private float time_hour_18_breath;
    private float time_hour_22_breath;
    private int days_after_operation;
    private int pulse;
  //  private int breath;
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

    public float getTime_hour_2_temperature() {
        return time_hour_2_temperature;
    }

    public void setTime_hour_2_temperature(float time_hour_2_temperature) {
        this.time_hour_2_temperature = time_hour_2_temperature;
    }

    public float getTime_hour_6_temperature() {
        return time_hour_6_temperature;
    }

    public void setTime_hour_6_temperature(float time_hour_6_temperature) {
        this.time_hour_6_temperature = time_hour_6_temperature;
    }

    public float getTime_hour_10_temperature() {
        return time_hour_10_temperature;
    }

    public void setTime_hour_10_temperature(float time_hour_10_temperature) {
        this.time_hour_10_temperature = time_hour_10_temperature;
    }

    public float getTime_hour_14_temperature() {
        return time_hour_14_temperature;
    }

    public void setTime_hour_14_temperature(float time_hour_14_temperature) {
        this.time_hour_14_temperature = time_hour_14_temperature;
    }

    public float getTime_hour_18_temperature() {
        return time_hour_18_temperature;
    }

    public void setTime_hour_18_temperature(float time_hour_18_temperature) {
        this.time_hour_18_temperature = time_hour_18_temperature;
    }

    public float getTime_hour_22_temperature() {
        return time_hour_22_temperature;
    }

    public void setTime_hour_22_temperature(float time_hour_22_temperature) {
        this.time_hour_22_temperature = time_hour_22_temperature;
    }
    public float getTime_hour_2_breath() {
        return time_hour_2_breath;
    }

    public void setTime_hour_2_breath(float time_hour_2_breath) {
        this.time_hour_2_breath = time_hour_2_breath;
    }

    public float getTime_hour_6_breath() {
        return time_hour_6_breath;
    }

    public void setTime_hour_6_breath(float time_hour_6_breath) {
        this.time_hour_6_breath = time_hour_6_breath;
    }

    public float getTime_hour_10_breath() {
        return time_hour_10_breath;
    }

    public void setTime_hour_10_breath(float time_hour_10_breath) {
        this.time_hour_10_breath = time_hour_10_breath;
    }

    public float getTime_hour_14_breath() {
        return time_hour_14_breath;
    }

    public void setTime_hour_14_breath(float time_hour_14_breath) {
        this.time_hour_14_breath = time_hour_14_breath;
    }

    public float getTime_hour_18_breath() {
        return time_hour_18_breath;
    }

    public void setTime_hour_18_breath(float time_hour_18_breath) {
        this.time_hour_18_breath = time_hour_18_breath;
    }

    public float getTime_hour_22_breath() {
        return time_hour_22_breath;
    }

    public void setTime_hour_22_breath(float time_hour_22_breath) {
        this.time_hour_22_breath = time_hour_22_breath;
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

 /*   public int getBreath() {
        return breath;
    }

    public void setBreath(int breath) {
        this.breath = breath;
    }*/

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
