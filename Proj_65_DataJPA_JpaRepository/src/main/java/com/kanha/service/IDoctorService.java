package com.kanha.service;

import java.util.List;

import com.kanha.entity.DoctorEntity;

public interface IDoctorService {
	public String deleteDoctorsByIdsInBatch(List<Integer> ids);

	public List<DoctorEntity> showDoctorsByExampleData(DoctorEntity exDoctor, boolean ascOrder, String properties);

	public DoctorEntity findDoctorById(Integer id);
}
