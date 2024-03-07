package com.org.Student_MS.response;

public class StudentResponse
{
	private Long stdId;
    private String firstName;
    private String lastName;
    private String email;
	private DepartmentResponse deptResponse;

	public StudentResponse() {
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

	public DepartmentResponse getDeptResponse() {
		return deptResponse;
	}

	public void setDeptResponse(DepartmentResponse deptResponse) {
		this.deptResponse = deptResponse;
	}

	@Override
	public String toString() {
		return "StudentResponse [stdId=" + stdId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", deptResponse=" + deptResponse + "]";
	}
	
}