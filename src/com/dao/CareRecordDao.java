package com.dao;

import com.model.CareRecord;
import com.model.Page;
import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * Created by azhl on 2015/9/9.
 */
public interface CareRecordDao {
    public void addCareRecord(CareRecord careRecord) throws DataAccessException;
    public int deleteCareRecord(CareRecord careRecord) throws DataAccessException;
    public int updateCareRecord(CareRecord careRecord) throws DataAccessException;
    public List<CareRecord> getCareRecordList(Page page,String patient_record_number) throws DataAccessException;
    public CareRecord getCareRecord(CareRecord careRecord) throws DataAccessException;
}
