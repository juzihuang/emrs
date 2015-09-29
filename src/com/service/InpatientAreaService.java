package com.service;

import java.util.List;

import com.model.InpatientArea;
import com.model.Page;

public interface InpatientAreaService {
	public void addInpatientArea(InpatientArea inpatientArea);
	public void deleteInpatientArea(InpatientArea inpatientArea);
	public void updateInpatientArea(InpatientArea inpatientArea);
	public List<InpatientArea> getInpatientAreaList(Page page);
	public InpatientArea getInpatientArea(InpatientArea inpatientArea);
}
