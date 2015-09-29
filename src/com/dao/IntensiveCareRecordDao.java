package com.dao;
import com.model.IntensiveCareRecord;
import com.model.Page;
import org.springframework.dao.DataAccessException;

import java.util.List;


public interface IntensiveCareRecordDao {
    public void addIntensiveCareRecord(IntensiveCareRecord intensiveCareRecord) throws DataAccessException;
    public int deleteIntensiveCareRecord(IntensiveCareRecord intensiveCareRecord) throws DataAccessException;
    public int updateIntensiveCareRecord(IntensiveCareRecord intensiveCareRecord) throws DataAccessException;
    public List<IntensiveCareRecord> getIntensiveCareRecordList(Page page,String patient_record_number) throws DataAccessException;
    public IntensiveCareRecord getIntensiveCareRecord(IntensiveCareRecord intensiveCareRecord) throws DataAccessException;
}
