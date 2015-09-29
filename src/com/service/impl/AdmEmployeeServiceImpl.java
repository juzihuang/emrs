package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.common.exception.ServiceException;
import com.common.log.Logger;
import com.ibatis.common.logging.Log;
import com.model.AdmEmployee;
import com.model.Page;

import com.dao.AdmEmloyeeDao;

import com.service.AdmEmployeeService;

@Component
public class AdmEmployeeServiceImpl implements AdmEmployeeService {
	@Logger
	private Log log;
	@Autowired
	private AdmEmloyeeDao admEmloyeeDao;
	@Override
	public void addAdmEmployee(AdmEmployee admEmployee) {
		try{
			admEmloyeeDao.addAdmEmployee(admEmployee);
		}catch(DataAccessException e){
			log.error(e.getMessage());
			throw new  ServiceException("1001",e);
		}
	}
	@Override
	public void deleteAdmEmployee(AdmEmployee admEmployee) {
		// TODO Auto-generated method stub
		try{
			admEmloyeeDao.deleteAdmEmployee(admEmployee);
		}catch(DataAccessException e){
			log.error(e.getMessage());
			throw new  ServiceException("1002",e);
		}
	}
	@Override
	public void updateAdmEmployee(AdmEmployee admEmployee) {
		// TODO Auto-generated method stub
		try{
			admEmloyeeDao.updateAdmEmployee(admEmployee);
		}catch(DataAccessException e){
			log.error(e.getMessage());
			throw new  ServiceException("1002",e);
		}
	}

	@Override
	public List<AdmEmployee> getAdmEmployeeList(Page page) {
		// TODO Auto-generated method stub
		try{
			return admEmloyeeDao.getAdmEmployeeList(page);
		}catch(DataAccessException e){
			log.error(e.getMessage());
			throw new  ServiceException("1003",e);
		}
	}

	@Override
	public AdmEmployee getAdmEmployee(AdmEmployee admEmployee) {
		// TODO Auto-generated method stub
		try{
			return (AdmEmployee)admEmloyeeDao.getAdmEmployee(admEmployee);
		}catch(DataAccessException e){
			log.error(e.getMessage());
			throw new  ServiceException("1004",e);
		}
	}

}
