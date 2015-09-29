package com.service;

import com.model.BloodSugarRecord;
import com.model.Page;

import java.util.List;

public interface BloodSugarRecordService {
    public void addBloodSugarRecord(BloodSugarRecord bloodSugarRecord);
    public void deleteBloodSugarRecord(BloodSugarRecord bloodSugarRecord);
    public void updateBloodSugarRecord(BloodSugarRecord bloodSugarRecord);
    public List<BloodSugarRecord> getBloodSugarRecordList(Page page,String patient_record_number);
    public BloodSugarRecord getBloodSugarRecord(BloodSugarRecord bloodSugarRecord);
}
