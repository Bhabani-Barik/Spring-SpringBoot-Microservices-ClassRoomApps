package com.kanha.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import com.kanha.entity.Politician;

public interface IPoliticianMgmtService {

	public List<Politician> showPoliticiansByIncomeRange(double start, double end);

	public List<Politician> fetchPoliticiansByParties(String party1, String party2, String party3);

	public List<Object[]> fetchPoliticiansDataByParties(String party1, String party2, String party3);

	public List<String> fetchPoliticiansNameByParties(String party1, String party2, String party3);

	public Optional<Politician> fetchPoliticianByName(String name);

	public Optional<Object> fetchPoliticianDataByName(String name);

	public Optional<String> fetchPoliticianPartyByName(String name);

	public Long fetchUniquePartyCount();

	public Object[] fetchAggragateResults();

	public String hikePoliticianIncomeByParty(String party, double percent);

	public String removePoliticiansByArea(String area);

	public LocalDateTime fetchSystemDateTime();

}
