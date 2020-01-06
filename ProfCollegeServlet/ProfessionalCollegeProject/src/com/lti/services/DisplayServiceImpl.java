package com.lti.services;

import java.sql.SQLException;
import java.util.List;

import com.lti.dao.ProfCollegeDao;
import com.lti.dao.ProfCollegeDaoImpl;
import com.lti.model.ProfessionalCollege;

public class DisplayServiceImpl implements DisplayService {

	

	ProfCollegeDao dao;

	public DisplayServiceImpl() throws SQLException 
	{
		dao=  new ProfCollegeDaoImpl() ;


	}

	@Override
	public List<ProfessionalCollege> viewCollege(String city, String courseType) throws SQLException {
		
		List<ProfessionalCollege> collegeList = dao.viewCollege(city, courseType);
		
		
		return collegeList;
	}

}
