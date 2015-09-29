package com.model;

/**
 * Created by azhl on 2015/9/10.
 */
public class CommonNumAndNurse {
    private  long id;//
    private  long commonNumber;
    private  long nurseNumber;
    private  long bigNurseNumber;
    private  String createTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getNurseNumber() {
        return nurseNumber;
    }

    public long getCommonNumber() {
        return commonNumber;
    }

    public void setCommonNumber(long commonNumber) {
        this.commonNumber = commonNumber;
    }

    public void setNurseNumber(long nurseNumber) {
        this.nurseNumber = nurseNumber;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public long getBigNurseNumber() {
        return bigNurseNumber;
    }

    public void setBigNurseNumber(long bigNurseNumber) {
        this.bigNurseNumber = bigNurseNumber;
    }
}
