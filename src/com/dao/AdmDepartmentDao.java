package com.dao;

import com.model.AdmDepartment;
import com.model.Page;
import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * Created by azhl on 2015/9/9.
 */
public interface AdmDepartmentDao {
    public void addAdmDepartment(AdmDepartment admDepartment) throws DataAccessException;
    public int deleteAdmDepartment(AdmDepartment admDepartment) throws DataAccessException;
    public int updateAdmDepartment(AdmDepartment admDepartment) throws DataAccessException;
    public List<AdmDepartment> getAdmDepartmentList(Page page) throws DataAccessException;
    public AdmDepartment getAdmDepartment(AdmDepartment admDepartment) throws DataAccessException;
}
