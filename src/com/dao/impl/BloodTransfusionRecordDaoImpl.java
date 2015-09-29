package com.dao.impl;
import com.common.dao.BaseDao;
import com.dao.BloodTransfusionRecordDao;
import com.model.BloodTransfusionRecord;
import com.model.Page;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Component
public class BloodTransfusionRecordDaoImpl extends BaseDao implements BloodTransfusionRecordDao{
	 @Override
	    public void addBloodTransfusionRecord(BloodTransfusionRecord bloodTransfusionRecord) throws DataAccessException {
	        this.getSqlMapClientTemplate().insert("insertBloodTransfusionRecord", bloodTransfusionRecord);
	       // System.out.print(BloodTransfusionRecord.getMark());
	    }

	    @Override
	    public int deleteBloodTransfusionRecord(BloodTransfusionRecord bloodTransfusionRecord) throws DataAccessException {
	        return this.getSqlMapClientTemplate().delete("deleteBloodTransfusionRecord", bloodTransfusionRecord);
	    }

	    @Override
	    public int updateBloodTransfusionRecord(BloodTransfusionRecord bloodTransfusionRecord) throws DataAccessException {
	        return this.getSqlMapClientTemplate().update("updateBloodTransfusionRecord", bloodTransfusionRecord);
	    }

	    @Override
	    public List<BloodTransfusionRecord> getBloodTransfusionRecordList(Page page,String patient_id) throws DataAccessException {
	        HashMap<String,Object> parameters=new HashMap<String,Object>();
	        parameters.put("patient_id",patient_id);
	        parameters.put("rowNumStart",page.getRowNumStart());
	        parameters.put("rowLength",page.getRowLength());
	        parameters.put("rowNumEnd",page.getRowNumEnd());
	        System.out.print(parameters);
	     //   System.out.print(this.getSqlMapClientTemplate().queryForList("selectBloodTransfusionRecordByPage", parameters));
	        return this.getSqlMapClientTemplate().queryForList("selectBloodTransfusionRecordByPage", parameters);
	    }

	    @Override
	    public BloodTransfusionRecord getBloodTransfusionRecord(BloodTransfusionRecord bloodTransfusionRecord) throws DataAccessException {
	        List<BloodTransfusionRecord> list = this.getSqlMapClientTemplate().queryForList("selectBloodTransfusionRecord", bloodTransfusionRecord);
	        return list.get(0);
	    }
}
