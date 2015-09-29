package com.service.impl;

import com.common.exception.ServiceException;
import com.common.log.Logger;
import com.dao.TemperatureRecordDao;
import com.ibatis.common.logging.Log;
import com.model.TemperatureRecord;
import com.model.Page;
import com.service.TemperatureRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by azhl on 2015/9/15.
 */
@Component
public class TemperatureRecordServiceImpl implements TemperatureRecordService {
    @Logger
    private Log log;
    @Autowired
    private TemperatureRecordDao temperatureRecordDao;
    @Override
    public void addTemperatureRecord(TemperatureRecord temperatureRecord) {
        try{
            temperatureRecordDao.addTemperatureRecord(temperatureRecord);
        }catch(DataAccessException e){
            log.error(e.getMessage());
            throw new ServiceException("1021",e);
        }
    }

    @Override
    public void deleteTemperatureRecord(TemperatureRecord temperatureRecord) {
        try{
            temperatureRecordDao.deleteTemperatureRecord(temperatureRecord);
        }catch(DataAccessException e){
            log.error(e.getMessage());
            throw new ServiceException("1022",e);
        }
    }

    @Override
    public void updateTemperatureRecord(TemperatureRecord temperatureRecord) {
        try{
            temperatureRecordDao.updateTemperatureRecord(temperatureRecord);
        }catch(DataAccessException e){
            log.error(e.getMessage());
            throw new ServiceException("1023",e);
        }
    }

    @Override
    public List<TemperatureRecord> getTemperatureRecordList(Page page) {
        try{
            return temperatureRecordDao.getTemperatureRecordList(page);
        }catch(DataAccessException e){
            log.error(e.getMessage());
            throw new  ServiceException("1024",e);
        }
    }

    @Override
    public TemperatureRecord getTemperatureRecord(TemperatureRecord temperatureRecord) {
        try{
            return temperatureRecordDao.getTemperatureRecord(temperatureRecord);
        }catch(DataAccessException e){
            log.error(e.getMessage());
            throw new  ServiceException("1025",e);
        }
    }
}
