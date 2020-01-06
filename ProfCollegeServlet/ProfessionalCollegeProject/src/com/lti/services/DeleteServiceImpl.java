package com.lti.services;

import java.sql.SQLException;

import com.lti.dao.ProfCollegeDao;
import com.lti.dao.ProfCollegeDaoImpl;

public class DeleteServiceImpl implements DeleteService {

	ProfCollegeDao dao;

	public DeleteServiceImpl() throws SQLException 
	{
		dao=  new ProfCollegeDaoImpl() ;


	}
	@Override
	public int deleteCollege(int collegeId) throws SQLException {
		int i = dao.deleteCollege(collegeId);
		System.out.println(i);
		return i;
	}

}
