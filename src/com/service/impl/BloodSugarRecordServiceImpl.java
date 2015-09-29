package com.service.impl;
import com.common.exception.ServiceException;
import com.common.log.Logger;
import com.dao.BloodSugarRecordDao;
import com.ibatis.common.logging.Log;
import com.model.BloodSugarRecord;
import com.model.Page;
import com.service.BloodSugarRecordService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class BloodSugarRecordServiceImpl implements BloodSugarRecordService{
	    @Logger
	    private Log log;
	    @Autowired
	    private BloodSugarRecordDao bloodSugarRecordDao;
	    @Override
	    public void addBloodSugarRecord(BloodSugarRecord bloodSugarRecord) {
	        try{
	
	            bloodSugarRecordDao.addBloodSugarRecord(bloodSugarRecord);
	           // System.out.print(bloodSugarRecord.getMark());
	        }catch(DataAccessException e){
	            log.error(e.getMessage());
	            throw new ServiceException("1021",e);
	        }
	    }

	    @Override
	    public void deleteBloodSugarRecord(BloodSugarRecord bloodSugarRecord) {
	        try{
	            bloodSugarRecordDao.deleteBloodSugarRecord(bloodSugarRecord);
	        }catch(DataAccessException e){
	            log.error(e.getMessage());
	            throw new ServiceException("1022",e);
	        }
	    }

	    @Override
	    public void updateBloodSugarRecord(BloodSugarRecord bloodSugarRecord) {
	        try{
	            bloodSugarRecordDao.updateBloodSugarRecord(bloodSugarRecord);
	        }catch(DataAccessException e){
	            log.error(e.getMessage());
	            throw new ServiceException("1023",e);
	        }
	    }

	    @Override
	    public List<BloodSugarRecord> getBloodSugarRecordList(Page page,String patient_id) {
	        try{
	            return bloodSugarRecordDao.getBloodSugarRecordList(page,patient_id);
	        }catch(DataAccessException e){
	            log.error(e.getMessage());
	            throw new  ServiceException("1024",e);
	        }
	    }

	    @Override
	    public BloodSugarRecord getBloodSugarRecord(BloodSugarRecord bloodSugarRecord) {
	        try{
	            return bloodSugarRecordDao.getBloodSugarRecord(bloodSugarRecord);
	        }catch(DataAccessException e){
	            log.error(e.getMessage());
	            throw new  ServiceException("1025",e);
	        }
	    }

}
