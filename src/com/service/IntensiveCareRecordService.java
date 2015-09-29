package com.service;

import com.model.IntensiveCareRecord;
import com.model.Page;

import java.util.List;

public interface IntensiveCareRecordService {
    public void addIntensiveCareRecord(IntensiveCareRecord intensiveCareRecord);
    public void deleteIntensiveCareRecord(IntensiveCareRecord intensiveCareRecord);
    public void updateIntensiveCareRecord(IntensiveCareRecord intensiveCareRecord);
    public List<IntensiveCareRecord> getIntensiveCareRecordList(Page page,String patient_record_number);
    public IntensiveCareRecord getIntensiveCareRecord(IntensiveCareRecord intensiveCareRecord);
}
