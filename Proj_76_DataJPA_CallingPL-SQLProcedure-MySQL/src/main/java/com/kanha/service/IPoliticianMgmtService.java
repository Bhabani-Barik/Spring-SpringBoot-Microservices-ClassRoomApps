package com.kanha.service;

import java.util.List;

import com.kanha.entity.Politician;

public interface IPoliticianMgmtService {
	   public  List<Politician>  showPolicitiansByIncomeRange(double start,double end);
	}
