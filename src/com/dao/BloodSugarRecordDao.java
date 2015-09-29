package com.dao;
import com.model.BloodSugarRecord;
import com.model.Page;
import org.springframework.dao.DataAccessException;

import java.util.List;


public interface BloodSugarRecordDao {
    public void addBloodSugarRecord(BloodSugarRecord bloodSugarRecord) throws DataAccessException;
    public int deleteBloodSugarRecord(BloodSugarRecord bloodSugarRecord) throws DataAccessException;
    public int updateBloodSugarRecord(BloodSugarRecord bloodSugarRecord) throws DataAccessException;
    public List<BloodSugarRecord> getBloodSugarRecordList(Page page,String patient_record_number) throws DataAccessException;
    public BloodSugarRecord getBloodSugarRecord(BloodSugarRecord bloodSugarRecord) throws DataAccessException;
}
