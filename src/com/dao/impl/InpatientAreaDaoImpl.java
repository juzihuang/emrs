package com.dao.impl;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.common.dao.BaseDao;
import com.dao.InpatientAreaDao;
import com.model.InpatientArea;
import com.model.Page;

@Component
public class InpatientAreaDaoImpl extends BaseDao implements InpatientAreaDao {

	@SuppressWarnings("deprecation")
	@Override
	public void addInpatientArea(InpatientArea inpatientArea)
			throws DataAccessException {
		// TODO Auto-generated method stub
		this.getSqlMapClientTemplate().insert("insertInpatientArea", inpatientArea);
	}

	@Override
	public int deleteInpatientArea(InpatientArea inpatientArea)
			throws DataAccessException {
		// TODO Auto-generated method stub
		return this.getSqlMapClientTemplate().delete("deleteInpatientArea", inpatientArea);
	}

	@Override
	public int updateInpatientArea(InpatientArea inpatientArea)
			throws DataAccessException {
		// TODO Auto-generated method stub
		return this.getSqlMapClientTemplate().update("updateInpatientArea", inpatientArea);
	}

	@Override
	public List<InpatientArea> getInpatientAreaList(Page page)
			throws DataAccessException {
		// TODO Auto-generated method stub
		return this.getSqlMapClientTemplate().queryForList("selectInpatientAreaByPage", page);
	}

	@Override
	public InpatientArea getInpatientArea(InpatientArea inpatientArea)
			throws DataAccessException {
		// TODO Auto-generated method stub
		List<InpatientArea> list = this.getSqlMapClientTemplate().queryForList("selectInpatientArea", inpatientArea);
	    return list.get(0);
	}

}
