package com.org.Student_MS.response;

public class StudentDto
{
	private Long stdId;
    private String firstName;
    private String lastName;
    private String email;
//    private String deptId;
    
    public StudentDto() {
		super();
	}
	public Long getStdId() {
		return stdId;
	}
	public void setStdId(Long stdId) {
		this.stdId = stdId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
//	public String getDeptId() {
//		return deptId;
//	}
//	public void setDeptId(String deptId) {
//		this.deptId = deptId;
//	}
    
    
}
