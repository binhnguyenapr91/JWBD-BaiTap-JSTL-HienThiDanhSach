package models;

public class Employees {
	private String empName;
	private String empDob;
	private String empAddress;
	private String empImage;
	public Employees(String empName, String empDob, String empAddress, String empImage) {
		super();
		this.empName = empName;
		this.empDob = empDob;
		this.empAddress = empAddress;
		this.empImage = empImage;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDob() {
		return empDob;
	}
	public void setEmpDob(String empDob) {
		this.empDob = empDob;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public String getEmpImage() {
		return empImage;
	}
	public void setEmpImage(String empImage) {
		this.empImage = empImage;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.empName;
	}	
	
}
