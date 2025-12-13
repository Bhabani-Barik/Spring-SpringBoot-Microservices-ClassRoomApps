package com.kanha.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kanha.entity.Politician;

public interface IPoliticianRepository extends JpaRepository<Politician, Integer> {
	public List<Politician> findByPartyEquals(String party);

	public List<Politician> readByPartyIs(String party);

	public List<Politician> getByParty(String party);

	public Optional<Politician> findByName(String name);

	public List<Politician> findByIncomeBetween(double start, double end);

	public List<Politician> findByNameStartingWith(String initChars);

	public List<Politician> findByNameEndingWith(String lastChars);

	public List<Politician> findByNameContaining(String chars);

	public List<Politician> findByIncomeGreaterThanEqualAndIncomeLessThanEqual(double start, double end);

	public List<Politician> findByPartyInOrIncomeBetween(List<String> parties, double start, double end);

}