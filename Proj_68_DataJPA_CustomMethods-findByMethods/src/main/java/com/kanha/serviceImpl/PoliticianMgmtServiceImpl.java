package com.kanha.serviceImpl;

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
	private IPoliticianRepository politicianRepo;

	@Override
	public List<Politician> showPoliticianByParty(String party) {
		// call the finder method
		// return politicianRepo.findByPartyEquals(party);
		return politicianRepo.readByPartyIs(party);
		// return politicianRepo.existByParty(party);
	}

	@Override
	public Optional<Politician> showPoloticianByName(String name) {
		return politicianRepo.findByName(name);
	}

	@Override
	public Iterable<Politician> showPoliticianByIncomeRange(double start, double end) {
		return politicianRepo.findByIncomeBetween(start, end);
	}

	@Override
	public List<Politician> showPoloticiansHavingChars(String initChars) {
		return politicianRepo.findByNameContaining(initChars);
	}

	@Override
	public List<Politician> showPoloticiansHavingInitChars(String initChars) {
		return politicianRepo.findByNameStartingWith(initChars);
	}

	@Override
	public List<Politician> showPoloticiansHavingLastChars(String lastChars) {
		return politicianRepo.findByNameEndingWith(lastChars);
	}

	@Override
	public List<Politician> showPoliticiansByIncomeRange(double start, double end) {
		return politicianRepo.findByIncomeGreaterThanEqualAndIncomeLessThanEqual(start, end);
	}

	@Override
	public List<Politician> showPoliticiansByPartiesOrIncomeRange(List<String> parties, double start, double end) {
		return politicianRepo.findByPartyInOrIncomeBetween(parties, start, end);
	}

}
