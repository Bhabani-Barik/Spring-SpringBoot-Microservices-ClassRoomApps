package com.kanha.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kanha.service.IPoliticianMgmtService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;

@Service
public class PoliticianMgmtServiceImpl implements IPoliticianMgmtService {
	@Autowired
	private EntityManager  manager;

	
	
	
	/*CREATE DEFINER=`root`@`localhost` PROCEDURE `p_authentication`(in uname varchar(30),in pwd varchar(30), out result varchar(20))
			BEGIN
			  declare cnt int;
			    select count(*) into cnt from jpa_userslist where username=uname and password=pwd;
			    
			    if(cnt<>0)then
			        set result="Valid Credentials";
			     else 
			         set result="Invalid Credentials";
			    end if;
			END
	*/
	
	@Override
	public String login(String user, String pwd) {
		//create StoredProcedureQuery object
		StoredProcedureQuery  query=manager.createStoredProcedureQuery("p_authentication");
		//register the query params
		query.registerStoredProcedureParameter(1,String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2,String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(3,String.class, ParameterMode.OUT);
		//set values  to IN params
		query.setParameter(1, user);
		query.setParameter(2, pwd);
		//call the PL/SQL procedure
		String result=(String)query.getOutputParameterValue(3);
		return result;
	}
		

}
