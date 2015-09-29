package com.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;
import com.model.InpatientArea;
import com.model.Page;

public interface InpatientAreaDao {
	public void addInpatientArea(InpatientArea inpatientArea) throws DataAccessException;
	public int deleteInpatientArea(InpatientArea inpatientArea) throws DataAccessException;
	public int updateInpatientArea(InpatientArea inpatientArea) throws DataAccessException;
	public List<InpatientArea> getInpatientAreaList(Page page) throws DataAccessException;
	public InpatientArea getInpatientArea(InpatientArea inpatientArea) throws DataAccessException;
}
