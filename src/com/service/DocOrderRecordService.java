package com.service;

import com.model.DocOrderRecord;
import com.model.Page;

import java.util.List;

/**
 * Created by azhl on 2015/9/9.
 */
public interface DocOrderRecordService {
    public void addDocOrderRecord(DocOrderRecord docOrderRecord);
    public void deleteDocOrderRecord(DocOrderRecord docOrderRecord);
    public void updateDocOrderRecord(DocOrderRecord docOrderRecord);
    public List<DocOrderRecord> getDocOrderRecordList(Page page);
    public DocOrderRecord getDocOrderRecord(DocOrderRecord docOrderRecord);
}
