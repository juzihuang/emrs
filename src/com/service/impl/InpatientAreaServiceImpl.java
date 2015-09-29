package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.common.exception.ServiceException;
import com.common.log.Logger;
import com.dao.InpatientAreaDao;
import com.dao.impl.InpatientAreaDaoImpl;
import com.ibatis.common.logging.Log;
import com.model.InpatientArea;
import com.model.Page;
import com.service.InpatientAreaService;

@Component
public class InpatientAreaServiceImpl implements InpatientAreaService {
	@Logger
	private Log log;
	@Autowired
	private InpatientAreaDao inpatientAreaDao;
	@Override
	public void addInpatientArea(InpatientArea inpatientArea) {
		// TODO Auto-generated method stub
		try{
			inpatientAreaDao.addInpatientArea(inpatientArea);
		}catch(DataAccessException e){
			log.error(e.getMessage());
			throw new  ServiceException("1011",e);
		}
	}

	@Override
	public void deleteInpatientArea(InpatientArea inpatientArea) {
		// TODO Auto-generated method stub
		try{
			inpatientAreaDao.deleteInpatientArea(inpatientArea);
		}catch(DataAccessException e){
			log.error(e.getMessage());
			throw new  ServiceException("1012",e);
		}
	}

	@Override
	public void updateInpatientArea(InpatientArea inpatientArea) {
		// TODO Auto-generated method stub
		try{
			inpatientAreaDao.updateInpatientArea(inpatientArea);
		}catch(DataAccessException e){
			log.error(e.getMessage());
			throw new  ServiceException("1013",e);
		}
	}

	@Override
	public List<InpatientArea> getInpatientAreaList(Page page) {
		// TODO Auto-generated method stub
		try{
			return inpatientAreaDao.getInpatientAreaList(page);
		}catch(DataAccessException e){
			log.error(e.getMessage());
			throw new  ServiceException("1014",e);
		}
	}

	@Override
	public InpatientArea getInpatientArea(InpatientArea inpatientArea) {
		// TODO Auto-generated method stub
		try{
			return inpatientAreaDao.getInpatientArea(inpatientArea);
		}catch(DataAccessException e){
			log.error(e.getMessage());
			throw new  ServiceException("1015",e);
		}
	}

}
