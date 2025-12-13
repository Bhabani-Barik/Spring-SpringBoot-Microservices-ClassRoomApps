package com.kanha.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.kanha.model.Employee;

@Repository("mySQLEmpDAO")
@Profile({"dev","test"})
public class MySQLEmployeeDAOImpl implements IEmployeeDAO {
	
	private static final String GET_EMPS_QUERY="SELECT EMPNO, ENAME, JOB, SAL, DEPTNO FROM EMPLOYEE WHERE JOB IN (?, ?, ?) ORDER BY JOB";	

	@Autowired
	private DataSource datasource; // The IOC container injects HikariDataSource object that comes through AutoConfiguration
	
	
	@Override
	public List<Employee> getEmployeeByDesignations(String designationOne, String designationTwo,
			String designationThree) throws Exception {
		
		List<Employee> list = null;
		
		
		// outer try with resource
		try ( Connection con = datasource.getConnection(); // gives Pooled JDBC con object // get pooled connection
				
				// create PreparedStatement by making the querypre-compiled SQL query
			  PreparedStatement ps = con.prepareStatement(GET_EMPS_QUERY); ) {
			
			// set values to query parameters
			ps.setString(1, designationOne);
			ps.setString(2, designationTwo);
			ps.setString(3, designationThree);
			
			
			// Nested try with resource
			try ( 	// Execute the SQL Query
					ResultSet rs = ps.executeQuery()) {
				
				list = new ArrayList();
				
				// copy each record of the ResultSet object to Model class object
				while( rs.next()) {
					
					// Copy each record values to Java Bean Class Object [i.e- Employee Class Object]
					Employee emp = new Employee();
					emp.setEno(rs.getInt(1));
					emp.setEname(rs.getString(2));
					emp.setJob(rs.getString(3));
					emp.setDeptno(rs.getInt(5));
					emp.setSalary(rs.getDouble(4));

					// add each Model Class object to rs
					list.add(emp);				
				}
			} // try 2		
		} // try1
		
		catch (SQLException se) {
			se.printStackTrace();
			throw se; // Exception rethrowing for exception propagation	
		}
		
		catch (Exception e) {
			e.printStackTrace();
			throw e; // Exception rethrowing for exception propagation
		}
		
		return list;
	} // method
} // class
