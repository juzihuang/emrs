package com.service.impl;
import com.common.exception.ServiceException;
import com.common.log.Logger;
import com.dao.IntensiveCareRecordDao;
import com.ibatis.common.logging.Log;
import com.model.IntensiveCareRecord;
import com.model.Page;
import com.service.IntensiveCareRecordService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class IntensiveCareRecordServiceImpl implements IntensiveCareRecordService{
	    @Logger
	    private Log log;
	    @Autowired
	    private IntensiveCareRecordDao intensiveCareRecordDao;
	    @Override
	    public void addIntensiveCareRecord(IntensiveCareRecord intensiveCareRecord) {
	        try{
	
	            intensiveCareRecordDao.addIntensiveCareRecord(intensiveCareRecord);
	           // System.out.print(IntensiveCareRecord.getMark());
	        }catch(DataAccessException e){
	            log.error(e.getMessage());
	            throw new ServiceException("1021",e);
	        }
	    }

	    @Override
	    public void deleteIntensiveCareRecord(IntensiveCareRecord intensiveCareRecord) {
	        try{
	            intensiveCareRecordDao.deleteIntensiveCareRecord(intensiveCareRecord);
	        }catch(DataAccessException e){
	            log.error(e.getMessage());
	            throw new ServiceException("1022",e);
	        }
	    }

	    @Override
	    public void updateIntensiveCareRecord(IntensiveCareRecord intensiveCareRecord) {
	        try{
	            intensiveCareRecordDao.updateIntensiveCareRecord(intensiveCareRecord);
	        }catch(DataAccessException e){
	            log.error(e.getMessage());
	            throw new ServiceException("1023",e);
	        }
	    }

	    @Override
	    public List<IntensiveCareRecord> getIntensiveCareRecordList(Page page,String patient_id) {
	        try{
	            return intensiveCareRecordDao.getIntensiveCareRecordList(page,patient_id);
	        }catch(DataAccessException e){
	            log.error(e.getMessage());
	            throw new  ServiceException("1024",e);
	        }
	    }

	    @Override
	    public IntensiveCareRecord getIntensiveCareRecord(IntensiveCareRecord intensiveCareRecord) {
	        try{
	            return intensiveCareRecordDao.getIntensiveCareRecord(intensiveCareRecord);
	        }catch(DataAccessException e){
	            log.error(e.getMessage());
	            throw new  ServiceException("1025",e);
	        }
	    }

}
