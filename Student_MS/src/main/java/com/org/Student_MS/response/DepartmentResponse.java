package com.org.Student_MS.response;

public class DepartmentResponse 
{
	private Long deptId;
    private String deptName;
    private String deptAddress;
    private String deptCode;
 
	public DepartmentResponse() {
		super();
	}
	public Long getDeptId() {
		return deptId;
	}
	public void setDeptId(Long deptId) {
		this.deptId = deptId;
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
	@Override
	public String toString() {
		return "DepartmentResponse [deptId=" + deptId + ", deptName=" + deptName + ", deptAddress=" + deptAddress
				+ ", deptCode=" + deptCode + "]";
	}
}
