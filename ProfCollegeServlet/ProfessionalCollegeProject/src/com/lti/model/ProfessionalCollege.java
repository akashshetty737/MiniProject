package com.lti.model;

public class ProfessionalCollege {
	
	private int collegeId;
	private String collegeName;
	private String courseType;
	private String city;
	private double fees;
	private int pincode;
	
	
	
	public ProfessionalCollege() {
	
	}



	public ProfessionalCollege(int collegeId, String collegeName, String courseType, String city, double fees,
			int pincode) {
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.courseType = courseType;
		this.city = city;
		this.fees = fees;
		this.pincode = pincode;
	}



	public int getCollegeId() {
		return collegeId;
	}



	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}



	public String getCollegeName() {
		return collegeName;
	}



	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}



	public String getCourseType() {
		return courseType;
	}



	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public double getFees() {
		return fees;
	}



	public void setFees(double fees) {
		this.fees = fees;
	}



	public int getPincode() {
		return pincode;
	}



	public void setPincode(int pincode) {
		this.pincode = pincode;
	}



	@Override
	public String toString() {
		return "ProfessionalCollege [collegeId=" + collegeId + ", collegeName=" + collegeName + ", courseType="
				+ courseType + ", city=" + city + ", fees=" + fees + ", pincode=" + pincode + "]";
	}
	
	
	
	
	

}
