package com.kanha.factory;

import javax.sql.DataSource;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.kanha.dao.IEmployeeDAO;
import com.kanha.dao.MySQLEmployeeDAOImpl;
import com.kanha.dao.OracleEmployeeDAOImpl;

@Component("daoFactory")
public class DAOFactory implements FactoryBean<IEmployeeDAO> {
	@Autowired
	private  DataSource ds;
	@Value("${choose.dao}")
	private   String daoid;

	@Override
	public IEmployeeDAO getObject() throws Exception {
		switch(daoid) {
		case "empDAO-oracle":
			   return  new  OracleEmployeeDAOImpl(ds);
		case "empDAO-mysql":
			return  new  MySQLEmployeeDAOImpl(ds);
		 default:
			 throw new IllegalArgumentException("Invalid Id");
		}
	}

	@Override
	public Class<?> getObjectType() {
		return IEmployeeDAO.class;
	}

}

