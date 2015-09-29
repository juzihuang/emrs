package com.dao.impl;

import com.common.dao.BaseDao;
import com.dao.TemperatureRecordDao;
import com.model.TemperatureRecord;
import com.model.Page;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

/**
 * Created by azhl on 2015/9/14.
 */
@Component
public class TemperatureRecordDaoImpl extends BaseDao implements TemperatureRecordDao {
    @Override
    public void addTemperatureRecord(TemperatureRecord temperatureRecord) throws DataAccessException {
        this.getSqlMapClientTemplate().insert("insertTemperatureRecord", temperatureRecord);
    }

    @Override
    public int deleteTemperatureRecord(TemperatureRecord temperatureRecord) throws DataAccessException {
        return this.getSqlMapClientTemplate().delete("deleteTemperatureRecord", temperatureRecord);
    }

    @Override
    public int updateTemperatureRecord(TemperatureRecord temperatureRecord) throws DataAccessException {
        return this.getSqlMapClientTemplate().update("updateTemperatureRecord", temperatureRecord);
    }

    @Override
    public List<TemperatureRecord> getTemperatureRecordList(Page page) throws DataAccessException {
        return this.getSqlMapClientTemplate().queryForList("selectTemperatureRecordByPage", page);
    }

    @Override
    public TemperatureRecord getTemperatureRecord(TemperatureRecord temperatureRecord) throws DataAccessException {
        List<TemperatureRecord> list = this.getSqlMapClientTemplate().queryForList("selectTemperatureRecord", temperatureRecord);
        return list.get(0);
    }
}

