package com.lti.services;

import java.sql.SQLException;
import java.util.List;

import com.lti.model.ProfessionalCollege;

public interface DisplayService {

	public List<ProfessionalCollege> viewCollege(String city, String courseType) throws SQLException;
}
