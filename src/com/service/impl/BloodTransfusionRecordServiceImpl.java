package com.service.impl;
import com.common.exception.ServiceException;
import com.common.log.Logger;
import com.dao.BloodTransfusionRecordDao;
import com.ibatis.common.logging.Log;
import com.model.BloodTransfusionRecord;
import com.model.Page;
import com.service.BloodTransfusionRecordService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class BloodTransfusionRecordServiceImpl implements BloodTransfusionRecordService{
	    @Logger
	    private Log log;
	    @Autowired
	    private BloodTransfusionRecordDao bloodTransfusionRecordDao;
	    @Override
	    public void addBloodTransfusionRecord(BloodTransfusionRecord bloodTransfusionRecord) {
	        try{
	
	            bloodTransfusionRecordDao.addBloodTransfusionRecord(bloodTransfusionRecord);
	           // System.out.print(BloodTransfusionRecord.getMark());
	        }catch(DataAccessException e){
	            log.error(e.getMessage());
	            throw new ServiceException("1021",e);
	        }
	    }

	    @Override
	    public void deleteBloodTransfusionRecord(BloodTransfusionRecord bloodTransfusionRecord) {
	        try{
	            bloodTransfusionRecordDao.deleteBloodTransfusionRecord(bloodTransfusionRecord);
	        }catch(DataAccessException e){
	            log.error(e.getMessage());
	            throw new ServiceException("1022",e);
	        }
	    }

	    @Override
	    public void updateBloodTransfusionRecord(BloodTransfusionRecord bloodTransfusionRecord) {
	        try{
	            bloodTransfusionRecordDao.updateBloodTransfusionRecord(bloodTransfusionRecord);
	        }catch(DataAccessException e){
	            log.error(e.getMessage());
	            throw new ServiceException("1023",e);
	        }
	    }

	    @Override
	    public List<BloodTransfusionRecord> getBloodTransfusionRecordList(Page page,String patient_id) {
	        try{
	            return bloodTransfusionRecordDao.getBloodTransfusionRecordList(page,patient_id);
	        }catch(DataAccessException e){
	            log.error(e.getMessage());
	            throw new  ServiceException("1024",e);
	        }
	    }

	    @Override
	    public BloodTransfusionRecord getBloodTransfusionRecord(BloodTransfusionRecord bloodTransfusionRecord) {
	        try{
	            return bloodTransfusionRecordDao.getBloodTransfusionRecord(bloodTransfusionRecord);
	        }catch(DataAccessException e){
	            log.error(e.getMessage());
	            throw new  ServiceException("1025",e);
	        }
	    }

}
