package com.dao.impl;

import com.common.dao.BaseDao;
import com.dao.AdmDepartmentDao;
import com.model.AdmDepartment;
import com.model.Page;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by azhl on 2015/9/9.
 */
@Component
public class AdmDepartmentDaoImpl extends BaseDao implements AdmDepartmentDao{
    @Override
    public void addAdmDepartment(AdmDepartment admDepartment) throws DataAccessException {
        this.getSqlMapClientTemplate().insert("insertAdmDepartment", admDepartment);
    }

    @Override
    public int deleteAdmDepartment(AdmDepartment admDepartment) throws DataAccessException {
        return this.getSqlMapClientTemplate().delete("deleteAdmDepartment", admDepartment);
    }

    @Override
    public int updateAdmDepartment(AdmDepartment admDepartment) throws DataAccessException {
        return this.getSqlMapClientTemplate().update("updateAdmDepartment", admDepartment);
    }

    @Override
    public List<AdmDepartment> getAdmDepartmentList(Page page) throws DataAccessException {
        return this.getSqlMapClientTemplate().queryForList("selectAdmDepartmentByPage", page);
    }

    @Override
    public AdmDepartment getAdmDepartment(AdmDepartment admDepartment) throws DataAccessException {
        List<AdmDepartment> list = this.getSqlMapClientTemplate().queryForList("selectAdmDepartment", admDepartment);
        return list.get(0);
    }
}
