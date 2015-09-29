package com.service.impl;

import com.common.exception.ServiceException;
import com.common.log.Logger;
import com.dao.DocOrderRecordDao;
import com.ibatis.common.logging.Log;
import com.model.DocOrderRecord;
import com.model.Page;
import com.service.DocOrderRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by azhl on 2015/9/9.
 */
@Component
public class DocOrderRecordServiceImpl implements DocOrderRecordService{
    @Logger
    private Log log;
    @Autowired
    private DocOrderRecordDao docOrderRecordDao;
    @Override
    public void addDocOrderRecord(DocOrderRecord docOrderRecord) {
        // TODO Auto-generated method stub
        try{
            docOrderRecordDao.addDocOrderRecord(docOrderRecord);
        }catch(DataAccessException e){
            log.error(e.getMessage());
            throw new ServiceException("1031",e);
        }
    }

    @Override
    public void deleteDocOrderRecord(DocOrderRecord docOrderRecord) {
        // TODO Auto-generated method stub
        try{
            docOrderRecordDao.deleteDocOrderRecord(docOrderRecord);
        }catch(DataAccessException e){
            log.error(e.getMessage());
            throw new  ServiceException("1032",e);
        }
    }

    @Override
    public void updateDocOrderRecord(DocOrderRecord docOrderRecord) {
        // TODO Auto-generated method stub
        try{
            docOrderRecordDao.updateDocOrderRecord(docOrderRecord);
        }catch(DataAccessException e){
            log.error(e.getMessage());
            throw new  ServiceException("1033",e);
        }
    }

    @Override
    public List<DocOrderRecord> getDocOrderRecordList(Page page) {
        // TODO Auto-generated method stub
        try{
            return docOrderRecordDao.getDocOrderRecordList(page);
        }catch(DataAccessException e){
            log.error(e.getMessage());
            throw new  ServiceException("1034",e);
        }
    }

    @Override
    public DocOrderRecord getDocOrderRecord(DocOrderRecord docOrderRecord) {
        // TODO Auto-generated method stub
        try{
            return docOrderRecordDao.getDocOrderRecord(docOrderRecord);
        }catch(DataAccessException e){
            log.error(e.getMessage());
            throw new  ServiceException("1035",e);
        }
    }
}
