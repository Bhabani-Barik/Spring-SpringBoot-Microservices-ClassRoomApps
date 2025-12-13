package com.kanha.service;

import com.kanha.entity.DoctorEntity;

public interface IDoctorService {
	public String registerDoctor(DoctorEntity doctor);

	public long showDoctorsCount();

	public Iterable<DoctorEntity> showAllDoctor();

	public Iterable<DoctorEntity> showAllDoctorsByIds(Iterable<Integer> ids);

	public DoctorEntity showDoctorById(Integer id);

	public String deleteDoctorById(Integer id);

	public String removeAlldoctors();
}
