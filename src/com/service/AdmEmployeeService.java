package com.service;

import java.util.List;

import com.model.AdmEmployee;
import com.model.Page;
/*
 *  AE = AdmEmployee
 */
public interface AdmEmployeeService {
	public void addAdmEmployee(AdmEmployee admEmployee);
	public void deleteAdmEmployee(AdmEmployee admEmployee);
	public void updateAdmEmployee(AdmEmployee admEmployee);
	public List<AdmEmployee> getAdmEmployeeList(Page page);
	public AdmEmployee getAdmEmployee(AdmEmployee admEmployee);
}
