package com.dao;

import com.model.DocOrderRecord;
import com.model.Page;
import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * Created by azhl on 2015/9/9.
 */
public interface DocOrderRecordDao {
    public void addDocOrderRecord(DocOrderRecord docOrderRecord) throws DataAccessException;
    public int deleteDocOrderRecord(DocOrderRecord docOrderRecord) throws DataAccessException;
    public int updateDocOrderRecord(DocOrderRecord docOrderRecord) throws DataAccessException;
    public List<DocOrderRecord> getDocOrderRecordList(Page page) throws DataAccessException;
    public DocOrderRecord getDocOrderRecord(DocOrderRecord docOrderRecord) throws DataAccessException;
}
