package com.dao.impl;
import com.common.dao.BaseDao;
import com.dao.BloodSugarRecordDao;
import com.model.BloodSugarRecord;
import com.model.Page;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Component
public class BloodSugarRecordDaoImpl extends BaseDao implements BloodSugarRecordDao{
	 @Override
	    public void addBloodSugarRecord(BloodSugarRecord bloodSugarRecord) throws DataAccessException {
	        this.getSqlMapClientTemplate().insert("insertBloodSugarRecord", bloodSugarRecord);
	       // System.out.print(bloodSugarRecord.getMark());
	    }

	    @Override
	    public int deleteBloodSugarRecord(BloodSugarRecord bloodSugarRecord) throws DataAccessException {
	        return this.getSqlMapClientTemplate().delete("deleteBloodSugarRecord", bloodSugarRecord);
	    }

	    @Override
	    public int updateBloodSugarRecord(BloodSugarRecord bloodSugarRecord) throws DataAccessException {
	        return this.getSqlMapClientTemplate().update("updateBloodSugarRecord", bloodSugarRecord);
	    }

	    @Override
	    public List<BloodSugarRecord> getBloodSugarRecordList(Page page,String patient_id) throws DataAccessException {
	        HashMap<String,Object> parameters=new HashMap<String,Object>();
	        parameters.put("patient_id",patient_id);
	        parameters.put("rowNumStart",page.getRowNumStart());
	        parameters.put("rowLength",page.getRowLength());
	        parameters.put("rowNumEnd",page.getRowNumEnd());
	        System.out.print(parameters);
	     //   System.out.print(this.getSqlMapClientTemplate().queryForList("selectBloodSugarRecordByPage", parameters));
	        return this.getSqlMapClientTemplate().queryForList("selectBloodSugarRecordByPage", parameters);
	    }

	    @Override
	    public BloodSugarRecord getBloodSugarRecord(BloodSugarRecord bloodSugarRecord) throws DataAccessException {
	        List<BloodSugarRecord> list = this.getSqlMapClientTemplate().queryForList("selectBloodSugarRecord", bloodSugarRecord);
	        return list.get(0);
	    }
}
