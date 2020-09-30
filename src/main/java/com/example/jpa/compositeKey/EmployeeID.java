package com.example.jpa.compositeKey;

import java.io.Serializable;

public class EmployeeID implements Serializable {
	
	private static final long serialVersionUID = -442650859280537797L;
	
	private String branch;
	private int id;
	
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public boolean equals(Object obj) {
		//implement
		return true;
	}

	public int hashCode() {
	    //implement
		return 0;
	}
}
