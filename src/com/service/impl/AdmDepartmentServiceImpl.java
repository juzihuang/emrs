package com.service.impl;

import com.common.exception.ServiceException;
import com.common.log.Logger;
import com.dao.AdmDepartmentDao;
import com.ibatis.common.logging.Log;
import com.model.AdmDepartment;
import com.model.Page;
import com.service.AdmDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by azhl on 2015/9/9.
 */
@Component
public class AdmDepartmentServiceImpl implements AdmDepartmentService {
    @Logger
    private Log log;
    @Autowired
    private AdmDepartmentDao admDepartmentDao;
    @Override
    public void addAdmDepartment(AdmDepartment admDepartment) {
        try{
            admDepartmentDao.addAdmDepartment(admDepartment);
        }catch(DataAccessException e){
            log.error(e.getMessage());
            throw new ServiceException("1021",e);
        }
    }

    @Override
    public void deleteAdmDepartment(AdmDepartment admDepartment) {
        try{
            admDepartmentDao.deleteAdmDepartment(admDepartment);
        }catch(DataAccessException e){
            log.error(e.getMessage());
            throw new ServiceException("1022",e);
        }
    }

    @Override
    public void updateAdmDepartment(AdmDepartment admDepartment) {
        try{
            admDepartmentDao.updateAdmDepartment(admDepartment);
        }catch(DataAccessException e){
            log.error(e.getMessage());
            throw new ServiceException("1023",e);
        }
    }

    @Override
    public List<AdmDepartment> getAdmDepartmentList(Page page) {
        try{
            return admDepartmentDao.getAdmDepartmentList(page);
        }catch(DataAccessException e){
            log.error(e.getMessage());
            throw new  ServiceException("1024",e);
        }
    }

    @Override
    public AdmDepartment getAdmDepartment(AdmDepartment admDepartment) {
        try{
            return admDepartmentDao.getAdmDepartment(admDepartment);
        }catch(DataAccessException e){
            log.error(e.getMessage());
            throw new  ServiceException("1025",e);
        }
    }
}
