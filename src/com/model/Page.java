package com.model;

import org.springframework.stereotype.Component;

@Component
public class Page {
	//[rowNumStart,rowNumEnd)
	private String rowNumStart;
	private String rowNumEnd;
	private String rowLength;
	public String getRowLength() {
		return rowLength;
	}
	public void setRowLength(String rowLength) {
		this.rowLength = rowLength;
	}
	public String getRowNumStart() {
		return rowNumStart;
	}
	public void setRowNumStart(String rowNumStart) {
		this.rowNumStart = rowNumStart;
	}
	public String getRowNumEnd() {
		return rowNumEnd;
	}
	public void setRowNumEnd(String rowNumEnd) {
		this.rowNumEnd = rowNumEnd;
	}
}
