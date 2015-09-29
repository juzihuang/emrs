package com.service;

import com.model.CareRecord;
import com.model.Page;

import java.util.List;

/**
 * Created by azhl on 2015/9/9.
 */
public interface CareRecordService {
    public void addCareRecord(CareRecord careRecord);
    public void deleteCareRecord(CareRecord careRecord);
    public void updateCareRecord(CareRecord careRecord);
    public List<CareRecord> getCareRecordList(Page page,String patient_record_number);
    public CareRecord getCareRecord(CareRecord careRecord);
}
