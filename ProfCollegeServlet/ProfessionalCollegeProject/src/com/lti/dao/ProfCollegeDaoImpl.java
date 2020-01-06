package com.lti.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lti.model.ProfessionalCollege;
import com.lti.util.DatabaseConn;

public class ProfCollegeDaoImpl implements ProfCollegeDao {
	
	ProfessionalCollege profCollege = new ProfessionalCollege();
	
	List<ProfessionalCollege> college = new ArrayList<ProfessionalCollege>();
	
	DatabaseConn dbconn = null;
	Connection conn = null;
	
	
	
	public ProfCollegeDaoImpl() {
		dbconn = new DatabaseConn();
		conn = dbconn.getDataSource();
	}

	@Override
	public int registerCollege(int collegeId, String collegeName, String courseType, String city, double fees,
			int pincode) throws SQLException {
		String sql = "insert into ProfCollege(collegeId,collegeName,courseType,city,fees, pincode) values(?,?,?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, collegeId);
		ps.setString(2, collegeName);
		ps.setString(3, courseType);
		ps.setString(4, city);
		ps.setDouble(5, fees);
		ps.setInt(6, pincode);
		System.out.println("error4");
		int i = ps.executeUpdate();
		System.out.println("error5");
		return i;
		
	
	}

	@Override
	public List<ProfessionalCollege> viewCollege(String city, String courseType) throws SQLException{
		String sql = "select * from ProfCollege where city = ? AND courseType = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1,city);
		ps.setString(2, courseType);
		List<ProfessionalCollege> collegeList = new ArrayList<ProfessionalCollege>();
		ResultSet rs =  ps.executeQuery();
		
		while(rs.next()){
			collegeList.add(new ProfessionalCollege( rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5), rs.getInt(6)));
			
		}
		return collegeList;
	}
	@Override
	public int deleteCollege(int collegeId) throws SQLException {
		String sql = "delete  from ProfCollege where collegeId = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1,collegeId);
		int i  =  ps.executeUpdate();
		return i;
	}



}
