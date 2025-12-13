package com.kanha.service;

import org.springframework.data.domain.Page;

import com.kanha.entity.Politician;

public interface IPoliticianMgmtService {
	  public  Iterable<Politician> showPoliticiansSorted(boolean ascOrder, String  ... props);
	  public  Page<Politician>  showPoliticiansByPageNo(int pageNo,int pageSize);
	  public  Page<Politician>  showPoliticiansByPageNoAsSorted(int pageNo,int pageSize,boolean ascOrder,String ...props);
	  public   void   showPoliticiansByPagination(int pageSize);
	  
	}