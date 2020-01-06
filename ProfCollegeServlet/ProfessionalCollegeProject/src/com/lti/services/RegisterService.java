package com.lti.services;

import java.sql.SQLException;

public interface RegisterService {

	

	public int registerCollege(int collegeId, String collegeName, String courseType, String city, double fees, int pincode)
			throws SQLException;
}
