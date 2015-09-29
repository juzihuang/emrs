package com.dao.impl;

import com.common.dao.BaseDao;
import com.dao.CareRecordDao;
import com.model.CareRecord;
import com.model.Page;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

/**
 * Created by azhl on 2015/9/9.
 */
@Component
public class CareRecordDaoImpl extends BaseDao implements CareRecordDao{
    @Override
    public void addCareRecord(CareRecord careRecord) throws DataAccessException {
        this.getSqlMapClientTemplate().insert("insertCareRecord", careRecord);
    }

    @Override
    public int deleteCareRecord(CareRecord careRecord) throws DataAccessException {
        return this.getSqlMapClientTemplate().delete("deleteCareRecord", careRecord);
    }

    @Override
    public int updateCareRecord(CareRecord careRecord) throws DataAccessException {
        return this.getSqlMapClientTemplate().update("updateCareRecord", careRecord);
    }

    @Override
    public List<CareRecord> getCareRecordList(Page page,String patient_record_number) throws DataAccessException {
        HashMap<String,Object> parameters=new HashMap<String,Object>();
        parameters.put("patient_record_number",patient_record_number);
        parameters.put("rowNumberStart",page.getRowNumStart());
        parameters.put("rowLength",page.getRowLength());
        parameters.put("rowNumEnd",page.getRowNumEnd());
        return this.getSqlMapClientTemplate().queryForList("selectCareRecordByPage", parameters);
    }

    @Override
    public CareRecord getCareRecord(CareRecord careRecord) throws DataAccessException {
        List<CareRecord> list = this.getSqlMapClientTemplate().queryForList("selectCareRecord", careRecord);
        return list.get(0);
    }
}
