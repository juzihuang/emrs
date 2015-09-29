package com.dao;

import com.model.Page;
import com.model.TemperatureRecord;
import org.springframework.dao.DataAccessException;

import java.util.List;
/**
 * Created by azhl on 2015/9/9.
 */
public interface TemperatureRecordDao {
    public void addTemperatureRecord(TemperatureRecord temperatureRecord) throws DataAccessException;
    public int deleteTemperatureRecord(TemperatureRecord temperatureRecord) throws DataAccessException;
    public int updateTemperatureRecord(TemperatureRecord temperatureRecord) throws DataAccessException;
    public List<TemperatureRecord> getTemperatureRecordList(Page page) throws DataAccessException;
    public TemperatureRecord getTemperatureRecord(TemperatureRecord temperatureRecord) throws DataAccessException;
}
