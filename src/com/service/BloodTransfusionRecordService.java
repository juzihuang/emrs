package com.service;

import com.model.BloodTransfusionRecord;
import com.model.Page;

import java.util.List;

public interface BloodTransfusionRecordService {
    public void addBloodTransfusionRecord(BloodTransfusionRecord bloodTransfusionRecord);
    public void deleteBloodTransfusionRecord(BloodTransfusionRecord bloodTransfusionRecord);
    public void updateBloodTransfusionRecord(BloodTransfusionRecord bloodTransfusionRecord);
    public List<BloodTransfusionRecord> getBloodTransfusionRecordList(Page page,String patient_record_number);
    public BloodTransfusionRecord getBloodTransfusionRecord(BloodTransfusionRecord bloodTransfusionRecord);
}
