package com.dao;
import com.model.BloodTransfusionRecord;
import com.model.Page;
import org.springframework.dao.DataAccessException;

import java.util.List;


public interface BloodTransfusionRecordDao {
    public void addBloodTransfusionRecord(BloodTransfusionRecord bloodTransfusionRecord) throws DataAccessException;
    public int deleteBloodTransfusionRecord(BloodTransfusionRecord bloodTransfusionRecord) throws DataAccessException;
    public int updateBloodTransfusionRecord(BloodTransfusionRecord bloodTransfusionRecord) throws DataAccessException;
    public List<BloodTransfusionRecord> getBloodTransfusionRecordList(Page page,String patient_record_number) throws DataAccessException;
    public BloodTransfusionRecord getBloodTransfusionRecord(BloodTransfusionRecord bloodTransfusionRecord) throws DataAccessException;
}
