package com.org.Department_MS.entity.request;

public class DepartmentRequest 
{
	private String deptName;
    private String deptAddress;
    private String deptCode;
    
	public DepartmentRequest() {
		super();
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptAddress() {
		return deptAddress;
	}
	public void setDeptAddress(String deptAddress) {
		this.deptAddress = deptAddress;
	}
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

    
}
