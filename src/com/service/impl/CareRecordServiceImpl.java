package com.service.impl;

import com.common.exception.ServiceException;
import com.common.log.Logger;
import com.dao.CareRecordDao;
import com.ibatis.common.logging.Log;
import com.model.CareRecord;
import com.model.Page;
import com.service.CareRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by azhl on 2015/9/9.
 */
@Component
public class CareRecordServiceImpl implements CareRecordService {
    @Logger
    private Log log;
    @Autowired
    private CareRecordDao careRecordDao;
    @Override
    public void addCareRecord(CareRecord careRecord) {
        try{
            careRecordDao.addCareRecord(careRecord);
        }catch(DataAccessException e){
            log.error(e.getMessage());
            throw new ServiceException("1021",e);
        }
    }

    @Override
    public void deleteCareRecord(CareRecord careRecord) {
        try{
            careRecordDao.deleteCareRecord(careRecord);
        }catch(DataAccessException e){
            log.error(e.getMessage());
            throw new ServiceException("1022",e);
        }
    }

    @Override
    public void updateCareRecord(CareRecord careRecord) {
        try{
            careRecordDao.updateCareRecord(careRecord);
        }catch(DataAccessException e){
            log.error(e.getMessage());
            throw new ServiceException("1023",e);
        }
    }

    @Override
    public List<CareRecord> getCareRecordList(Page page,String patient_record_number) {
        try{
            return careRecordDao.getCareRecordList(page,patient_record_number);
        }catch(DataAccessException e){
            log.error(e.getMessage());
            throw new  ServiceException("1024",e);
        }
    }

    @Override
    public CareRecord getCareRecord(CareRecord careRecord) {
        try{
            return careRecordDao.getCareRecord(careRecord);
        }catch(DataAccessException e){
            log.error(e.getMessage());
            throw new  ServiceException("1025",e);
        }
    }
}
