package com.kanha.service;

import java.util.List;
import java.util.Optional;

import com.kanha.entity.Politician;

public interface IPoliticianMgmtService {
	public String removePoliticiansByIdsInBatch(List<Integer> ids);

	public List<Politician> showPoliticiansByExampleData(Politician politician, boolean ascOrder, String... props);

	public Optional<Politician> findPoloticianById(int id);

	public Politician showPoliticianById(int id);
}
