package com.lti.dao;

import java.sql.SQLException;
import java.util.List;

import com.lti.model.ProfessionalCollege;

public interface ProfCollegeDao {
	
	
	
public int registerCollege(int collegeId,
String collegeName,
String courseType,
String city, double fees,
int pincode) throws SQLException;
public List<ProfessionalCollege> viewCollege(String city, String courseType) throws SQLException;
public int deleteCollege(int collegeId) throws SQLException;
}
