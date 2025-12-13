package com.kanha.repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kanha.entity.Politician;

import jakarta.transaction.Transactional;

@Repository
public interface IPoliticianRepository extends JpaRepository<Politician, Integer> {

	@Query("from  Politician where income>=?2  and   income<=?1")
	// @Query("from Politician where income>=? and income<=?")
	// @Query("from Politician where income>=:min and income<=:max")
	public List<Politician> fetchPoliticiansByIncomeRange(double min, double max);

	// public List<Politician> fetchPoliticiansByIncomeRange(@Param("min") double
	// start,@Param("max") double end);

	// Bulk select operation Entity Query
	@Query("from Politician  where party in(:party1,:party2,:party3) order by party")
	public List<Politician> showPoliticiansByParties(String party1, String party2, String party3);

	// Bulk select operation Scalar/Projection Query selecting specific multiple
	// col/property values
	@Query("select id,name,party  from Politician where party in(:party1,:party2,:party3)  order  by  party")
	public List<Object[]> showPoliticianDataByParties(String party1, String party2, String party3);

	// Bulk select operation Scalar/Projection Query selecting specific single
	// col/property values
	@Query("select name  from Politician where party in(:party1,:party2,:party3)  order  by  party")
	public List<String> showPoliticianNameByParties(String party1, String party2, String party3);

	// Single row select operation Entity Query
	@Query("  from Politician where name=:nam")
	public Optional<Politician> showPoliciticianByName(String nam);

	// Single row select operation Scalar Query selecting specific multiple col
	// values
	@Query(" select id,name,party from Politician where name=:nam")
	public Optional<Object> showPoliciticianDataByName(String nam);

	// Single row select operation Scalar Query selecting specific single col values
	@Query(" select party from Politician where name=:nam")
	public Optional<String> showPoliciticianPartyByName(String nam);

	// single aggregate function
	@Query(" select count(distinct party) from Politician")
	public Long showUniquePartyCount();

	// multiple aggregate functions
	@Query(" select count(*), max(income),min(income),avg(income),sum(income) from Politician")
	public Object showMutipleAggragateData();

	@Query(" update Politician set income=income+(income*:percent/100.0) where party=:party")
	@Modifying
	@Transactional
	public int updatePoliticianIncomeByPartyName(String party, double percent);

	@Query(" delete from Politician  where area=:area")
	@Modifying
	@Transactional
	public int removePoliticiansByArea(String area);

	// @Query(value="SELECT now() FROM DUAL", nativeQuery = true)
	@Query(value = "SELECT sysdate FROM DUAL", nativeQuery = true)
	public LocalDateTime showSysDate();

}
