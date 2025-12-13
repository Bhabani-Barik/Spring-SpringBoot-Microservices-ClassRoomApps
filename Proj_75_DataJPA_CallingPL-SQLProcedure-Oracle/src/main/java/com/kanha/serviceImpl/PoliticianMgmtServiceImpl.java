package com.kanha.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kanha.entity.Politician;
import com.kanha.service.IPoliticianMgmtService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;

@Service
public class PoliticianMgmtServiceImpl implements IPoliticianMgmtService {
	@Autowired
	private EntityManager  manager;
	
	
	/*CREATE OR REPLACE PROCEDURE P_GET_POLITICIANS_BY_INCOME 
	(
	  MIN IN NUMBER 
	, MAX IN NUMBER 
	, DETAILS OUT SYS_REFCURSOR 
	) AS 
	BEGIN
	  
	  open details for
	      select *  from jpa_politician where  pincome>=min and pincome<=max;
	  
	  
	END P_GET_POLITICIANS_BY_INCOME;
	*/
	
	@Override
	public List<Politician> showPolicitiansByIncomeRange(double start, double end) {
		//create  StoredProcedureQuery object
		StoredProcedureQuery  query=manager.createStoredProcedureQuery("P_GET_POLITICIANS_BY_INCOME", Politician.class);
		//register the parameters
		query.registerStoredProcedureParameter(1, Double.class,ParameterMode.IN);
		query.registerStoredProcedureParameter(2, Double.class,ParameterMode.IN);
		query.registerStoredProcedureParameter(3, Object.class,ParameterMode.REF_CURSOR);
		
		//set  values to IN parametes
		query.setParameter(1,start);
		query.setParameter(2, end);
		//execute the PL/SQL procedure
		List<Politician> list=query.getResultList();
		return list;
	}

}
