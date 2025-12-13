package com.kanha.service;

import java.util.List;
import java.util.Optional;

import com.kanha.entity.Politician;

public interface IPoliticianMgmtService {
	public String registerPolitician(Politician politician);

	public long getPoliticinsCount();

	public String checkPoliticianAvaialbility(int id);

	public Iterable<Politician> showAllPoliticians();

	public String registerPoliticians(Iterable<Politician> politicians);

	public Iterable<Politician> showAllPoliticiansById(Iterable<Integer> ids);

	public Optional<Politician> showPoliticianById(int id);

	public String fetchPoliticianById(int id);

	public Politician getPoliticianById(int id);

	public Politician displayPoliticianById(int id);

	public String updatePoliticianIncomeById(int id, double hikePercent);

	public String saveOrUpdatePoliticianData(Politician politician);

	public String removePoliticianById(int id);

	public String removePoliticinsByIds(List<Integer> ids);

	public String removeAllPoliticians();
}
