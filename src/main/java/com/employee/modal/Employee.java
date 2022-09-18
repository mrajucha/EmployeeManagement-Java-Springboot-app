package com.employee.modal;

//Entity class
public class Employee {
	
	public long empNO;
    public String empName;
    public String role;
    public String email;
    public String password;
    public int phoneNo;
    
       
    public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Employee(long empNO, String empName, String role, String email, String password, int phoneNo) {
		super();
		this.empNO = empNO;
		this.empName = empName;
		this.role = role;
		this.email = email;
		this.password = password;
		this.phoneNo = phoneNo;
	}

    
    
    public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public long getEmpNO() {
		return empNO;
	}

	public void setEmpNO(long empNO) {
		this.empNO = empNO;
	}



	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


    public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public int getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Employee [empNO=" + empNO + ", empName=" + empName + ", role=" + role + ", email=" + email
				+ ", password=" + password + ", phoneNo=" + phoneNo + "]";
	}

	

}
