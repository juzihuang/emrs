package com.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.model.AdmEmployee;
import com.model.Page;

public interface AdmEmloyeeDao{
	//添加员工
	public void  addAdmEmployee(AdmEmployee admEmployee) throws DataAccessException;
	//更新员工信息
	public int  updateAdmEmployee(AdmEmployee admEmployee) throws DataAccessException;
	//删除员工
	public int  deleteAdmEmployee(AdmEmployee admEmployee) throws DataAccessException;
	//获取员工列表(按页)
	public List<AdmEmployee>  getAdmEmployeeList(Page page) throws DataAccessException;
	//通过精确查找
	public AdmEmployee getAdmEmployee(AdmEmployee admEmployee)throws DataAccessException ;
}
