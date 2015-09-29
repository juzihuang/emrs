package com.dao.impl;
import com.common.dao.BaseDao;
import com.dao.IntensiveCareRecordDao;
import com.model.IntensiveCareRecord;
import com.model.Page;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Component
public class IntensiveCareRecordDaoImpl extends BaseDao implements IntensiveCareRecordDao{
	 @Override
	    public void addIntensiveCareRecord(IntensiveCareRecord intensiveCareRecord) throws DataAccessException {
	        this.getSqlMapClientTemplate().insert("insertIntensiveCareRecord", intensiveCareRecord);
	       // System.out.print(IntensiveCareRecord.getMark());
	    }

	    @Override
	    public int deleteIntensiveCareRecord(IntensiveCareRecord intensiveCareRecord) throws DataAccessException {
	        return this.getSqlMapClientTemplate().delete("deleteIntensiveCareRecord", intensiveCareRecord);
	    }

	    @Override
	    public int updateIntensiveCareRecord(IntensiveCareRecord intensiveCareRecord) throws DataAccessException {
	        return this.getSqlMapClientTemplate().update("updateIntensiveCareRecord", intensiveCareRecord);
	    }

	    @Override
	    public List<IntensiveCareRecord> getIntensiveCareRecordList(Page page,String patient_id) throws DataAccessException {
	        HashMap<String,Object> parameters=new HashMap<String,Object>();
	        parameters.put("patient_id",patient_id);
	        parameters.put("rowNumStart",page.getRowNumStart());
	        parameters.put("rowLength",page.getRowLength());
	        parameters.put("rowNumEnd",page.getRowNumEnd());
	        System.out.print(parameters);
	     //   System.out.print(this.getSqlMapClientTemplate().queryForList("selectIntensiveCareRecordByPage", parameters));
	        return this.getSqlMapClientTemplate().queryForList("selectIntensiveCareRecordByPage", parameters);
	    }

	    @Override
	    public IntensiveCareRecord getIntensiveCareRecord(IntensiveCareRecord intensiveCareRecord) throws DataAccessException {
	        List<IntensiveCareRecord> list = this.getSqlMapClientTemplate().queryForList("selectIntensiveCareRecord", intensiveCareRecord);
	        return list.get(0);
	    }
}
