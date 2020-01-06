package com.lti.services;

import java.sql.SQLException;
import java.util.List;

import com.lti.dao.ProfCollegeDao;
import com.lti.dao.ProfCollegeDaoImpl;
import com.lti.model.ProfessionalCollege;

public class RegisterServiceImpl implements RegisterService{

	ProfCollegeDao dao;

	public RegisterServiceImpl() throws SQLException 
	{
		dao=  new ProfCollegeDaoImpl() ;


	}



	@Override
	public int registerCollege( int collegeId,
			String collegeName,
			String courseType,
			String city,
			double fees,
			int pincode) throws SQLException {
		int i = dao.registerCollege(collegeId,collegeName,courseType,city,fees,pincode);
		System.out.println(i);
		return i;
	}

}

