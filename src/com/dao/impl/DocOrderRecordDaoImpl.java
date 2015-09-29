package com.dao.impl;

import com.common.dao.BaseDao;
import com.dao.DocOrderRecordDao;
import com.model.DocOrderRecord;
import com.model.DocOrderRecord;
import com.model.Page;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by azhl on 2015/9/9.
 */
@Component
public class DocOrderRecordDaoImpl extends BaseDao implements DocOrderRecordDao {
    @SuppressWarnings("deprecation")
    @Override
    public void addDocOrderRecord(DocOrderRecord docOrderRecord)
            throws DataAccessException {
        // TODO Auto-generated method stub
        this.getSqlMapClientTemplate().insert("insertDocOrderRecord", docOrderRecord);
    }

    @Override
    public int deleteDocOrderRecord(DocOrderRecord docOrderRecord)
            throws DataAccessException {
        // TODO Auto-generated method stub
        return this.getSqlMapClientTemplate().delete("deleteDocOrderRecord", docOrderRecord);
    }

    @Override
    public int updateDocOrderRecord(DocOrderRecord docOrderRecord)
            throws DataAccessException {
        // TODO Auto-generated method stub
        return this.getSqlMapClientTemplate().update("updateDocOrderRecord", docOrderRecord);
    }

    @Override
    public List<DocOrderRecord> getDocOrderRecordList(Page page)
            throws DataAccessException {
        // TODO Auto-generated method stub
        return this.getSqlMapClientTemplate().queryForList("selectDocOrderRecordByPage", page);
    }

    @Override
    public DocOrderRecord getDocOrderRecord(DocOrderRecord docOrderRecord)
            throws DataAccessException {
        // TODO Auto-generated method stub
        List<DocOrderRecord> list = this.getSqlMapClientTemplate().queryForList("selectDocOrderRecord", docOrderRecord);
        return list.get(0);
    }
}
