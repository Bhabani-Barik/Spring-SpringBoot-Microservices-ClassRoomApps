package com.kanha.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kanha.entity.Politician;
import com.kanha.repository.IPoliticianRepository;
import com.kanha.service.IPoliticianMgmtService;

@Service
public class PoliticianMgmtServiceImpl implements IPoliticianMgmtService {
	@Autowired
	private IPoliticianRepository  politicianRepo;

	@Override
	public String registerPolitiician(Politician politician) {
		int idVal=politicianRepo.save(politician).getId();
		return "Politician is saved with Id value::"+idVal;
	}

	@Override
	public List<Politician> showAllPoliticians() {
		return politicianRepo.findAll();
	}

}