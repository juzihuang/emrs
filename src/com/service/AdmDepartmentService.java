package com.service;

import com.model.AdmDepartment;
import com.model.Page;

import java.util.List;

/**
 * Created by azhl on 2015/9/9.
 */
public interface AdmDepartmentService {
    public void addAdmDepartment(AdmDepartment admDepartment);
    public void deleteAdmDepartment(AdmDepartment admDepartment);
    public void updateAdmDepartment(AdmDepartment admDepartment);
    public List<AdmDepartment> getAdmDepartmentList(Page page);
    public AdmDepartment getAdmDepartment(AdmDepartment admDepartment);
}
