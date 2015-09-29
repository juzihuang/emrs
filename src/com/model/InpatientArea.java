package com.model;

public class InpatientArea {
	private  long id;
	private  String name;
	private  long area_direct_id;
	private  long big_nurse_id;
	private  String create_time;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getArea_direct_id() {
		return area_direct_id;
	}
	public void setArea_direct_id(long area_direct_id) {
		this.area_direct_id = area_direct_id;
	}
	public long getBig_nurse_id() {
		return big_nurse_id;
	}
	public void setBig_nurse_id(long big_nurse_id) {
		this.big_nurse_id = big_nurse_id;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	
}
