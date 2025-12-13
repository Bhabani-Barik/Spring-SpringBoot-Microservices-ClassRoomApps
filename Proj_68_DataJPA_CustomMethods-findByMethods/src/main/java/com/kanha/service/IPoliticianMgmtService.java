package com.kanha.service;

import java.util.List;
import java.util.Optional;

import com.kanha.entity.Politician;

public interface IPoliticianMgmtService {
	public List<Politician> showPoliticianByParty(String party);

	public Optional<Politician> showPoloticianByName(String name);

	public Iterable<Politician> showPoliticianByIncomeRange(double start, double end);

	public List<Politician> showPoloticiansHavingInitChars(String initChars);

	public List<Politician> showPoloticiansHavingLastChars(String lastChars);

	public List<Politician> showPoloticiansHavingChars(String chars);

	public List<Politician> showPoliticiansByIncomeRange(double start, double end);

	public List<Politician> showPoliticiansByPartiesOrIncomeRange(List<String> parties, double start, double end);
}
