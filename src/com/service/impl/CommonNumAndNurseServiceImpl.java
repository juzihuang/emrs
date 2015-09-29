package com.service.impl;

import com.common.exception.ServiceException;
import com.common.log.Logger;
import com.dao.CommonNumAndNurseDao;
import com.ibatis.common.logging.Log;
import com.model.AdmEmployee;
import com.model.CommonNumAndNurse;
import com.model.Page;
import com.service.CommonNumAndNurseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by azhl on 2015/9/10.
 */
@Component
public class CommonNumAndNurseServiceImpl implements CommonNumAndNurseService {
    @Logger
    private Log log;
    @Autowired
    private CommonNumAndNurseDao commonNumAndNurseDao;
    @Override
    public void addCommonNumAndNurse(CommonNumAndNurse commonNumAndNurse) {
        // TODO Auto-generated method stub
        try{
            commonNumAndNurseDao.addCommonNumAndNurse(commonNumAndNurse);
        }catch(DataAccessException e){
            log.error(e.getMessage());
            throw new ServiceException("1101",e);
        }
    }

    @Override
    public void deleteCommonNumAndNurse(CommonNumAndNurse commonNumAndNurse) {
        // TODO Auto-generated method stub
        try{
            commonNumAndNurseDao.deleteCommonNumAndNurse(commonNumAndNurse);
        }catch(DataAccessException e){
            log.error(e.getMessage());
            throw new  ServiceException("1102",e);
        }
    }

    @Override
    public List<AdmEmployee> getCommonNumList(String bigNurseNum, Page page) {
        try{
            return commonNumAndNurseDao.getCommonNumList(bigNurseNum,page);
        }catch(DataAccessException e){
            log.error(e.getMessage());
            throw new  ServiceException("1106",e);
        }
    }

    @Override
    public List<AdmEmployee> getNurseList(String commonNumber, Page page) {
        try{
            return commonNumAndNurseDao.getNurseList(commonNumber,page);
        }catch(DataAccessException e){
            log.error(e.getMessage());
            throw new  ServiceException("1107",e);
        }
    }
}
