package com.kanha.service;

import java.util.List;

import com.kanha.entity.Politician;

public interface IPoliticianMgmtService {
	public String registerPolitiician(Politician politician);

	public List<Politician> showAllPoliticians();
}
