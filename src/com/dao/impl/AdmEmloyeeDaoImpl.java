package com.dao.impl;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.common.dao.BaseDao;
import com.model.AdmEmployee;
import com.model.Page;

import com.dao.AdmEmloyeeDao;

@SuppressWarnings("deprecation")
@Component
public class AdmEmloyeeDaoImpl extends BaseDao implements AdmEmloyeeDao {
	@Override
	public void addAdmEmployee(AdmEmployee admEmployee)
			throws DataAccessException {
		// TODO Auto-generated method stub
		this.getSqlMapClientTemplate().insert("insertAdmEmployee", admEmployee);
	}

	@Override
	public int updateAdmEmployee(AdmEmployee admEmployee)
			throws DataAccessException {
		// TODO Auto-generated method stub
		return this.getSqlMapClientTemplate().update("updateAdmEmployee", admEmployee);
	}

	@Override
	public int deleteAdmEmployee(AdmEmployee admEmployee)
			throws DataAccessException {
		// TODO Auto-generated method stub
		return this.getSqlMapClientTemplate().delete("deleteAdmEmployee", admEmployee);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AdmEmployee> getAdmEmployeeList(Page page)
			throws DataAccessException {
		// TODO Auto-generated method stub
		return this.getSqlMapClientTemplate().queryForList("selectAdmEmployeePage", page);
	}

	@Override
	public AdmEmployee getAdmEmployee(AdmEmployee admEmployee)
			throws DataAccessException  {
		// TODO Auto-generated method stub
	    List<AdmEmployee> list = this.getSqlMapClientTemplate().queryForList("selectAdmEmployee", admEmployee);
	    return list.get(0);
	}

}
