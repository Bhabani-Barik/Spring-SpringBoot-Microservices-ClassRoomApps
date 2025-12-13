package com.kanha.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kanha.model.Hospitals;

@Repository("hospitalsDAO")
public class HospitalsDAOImpl implements IHospitalsDAO {

	public static final String GET_HOSPITALS_QUERY = "SELECT ID, NAME, LOCATION FROM  HOSPITALS WHERE LOCATION IN (?, ?, ?) ORDER BY LOCATION";

	@Autowired
	private DataSource datasource; // HAS-A Property & The IOC container injects HikariDataSource object that comes
									// through AutoConfiguration

	@Override
	public List<Hospitals> getHospitalsDetailsByLocation(String locationOne, String locationTwo, String locationThree)
			throws Exception {

		List<Hospitals> list = null;

		// Outer try with resource
		try (Connection con = datasource.getConnection();

				// create PreparedStatement by making the querypre-compiled SQL query
				PreparedStatement ps = con.prepareStatement(GET_HOSPITALS_QUERY);) {

			// set values to query parameters
			ps.setString(1, locationOne);
			ps.setString(2, locationTwo);
			ps.setString(3, locationThree);

			// Nested try with resource
			try ( // Execute the SQL Query
					ResultSet rs = ps.executeQuery()) {

				list = new ArrayList();

				// copy each record of the ResultSet object to Model class object
				while (rs.next()) {

					// Copy each record values to Java Bean Class Object
					Hospitals hospital = new Hospitals();
					hospital.setId(rs.getInt(1));
					hospital.setName(rs.getString(2));
					hospital.setLocation(rs.getString(3));

					// add each Model Class object to rs
					list.add(hospital);
				}

			} // try 2
		} // try 1

		catch (SQLException se) {
			se.printStackTrace();
			throw se; // Exception re-throwing for exception propagation
		}

		catch (Exception e) {
			e.printStackTrace();
			throw e; // Exception re-throwing for exception propagation
		}

		return list;

	}// main

} // class
