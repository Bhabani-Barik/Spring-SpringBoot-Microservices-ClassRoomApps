package com.kanha.serviceImpl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kanha.entity.Politician;
import com.kanha.repository.IPoliticianRepository;
import com.kanha.service.IPoliticianMgmtService;

@Service("pltnService")
public class PoliticianMgmtServiceImpl implements IPoliticianMgmtService {
	@Autowired
	private  IPoliticianRepository  politicianRepo;

	@Override
	public List<Politician> showPoliticiansByIncomeRange(double start, double end) {
		//use repo
		List<Politician> list=politicianRepo.fetchPoliticiansByIncomeRange(start, end);
		return list;
	}
	

	@Override
	public List<Politician> fetchPoliticiansByParties(String party1, String party2, String party3) {
		List<Politician> list=politicianRepo.showPoliticiansByParties(party1, party2, party3);
		return list;
	}

	@Override
	public List<Object[]> fetchPoliticiansDataByParties(String party1, String party2, String party3) {
		return politicianRepo.showPoliticianDataByParties(party1, party2, party3);
	}

	@Override
	public List<String> fetchPoliticiansNameByParties(String party1, String party2, String party3) {
		return politicianRepo.showPoliticianNameByParties(party1, party2, party3);
	}


	@Override
	public Optional<Politician> fetchPoliticianByName(String name) {
		   return politicianRepo.showPoliciticianByName(name);
		}


	@Override
	public Optional<Object> fetchPoliticianDataByName(String name) {
		return politicianRepo.showPoliciticianDataByName(name);
	}


	@Override
	public Optional<String> fetchPoliticianPartyByName(String name) {
		return   politicianRepo.showPoliciticianPartyByName(name);
	}
	
	@Override
	public Long fetchUniquePartyCount() {
	  return politicianRepo.showUniquePartyCount();
	}
	
	@Override
	public Object[] fetchAggragateResults() {
		 Object data[]=(Object[]) politicianRepo.showMutipleAggragateData();
		 return data;
		
	}
	
	@Override
	public String hikePoliticianIncomeByParty(String party, double percent) {
		//use  repo
		int count=politicianRepo.updatePoliticianIncomeByPartyName(party, percent);
		return count==0?" No Politician found for updation":count+" no.of  Politicians are updated";
	}
	
	@Override
	public String removePoliticiansByArea(String area) {
		//use repo
		int count=politicianRepo.removePoliticiansByArea(area);
		return count==0?"Polotician not found": count+" no.of  Politicians are deleted";
	}


	@Override
	public LocalDateTime fetchSystemDateTime() {
		LocalDateTime  ldt=politicianRepo.showSysDate();
		return  ldt;
	}

	

}
