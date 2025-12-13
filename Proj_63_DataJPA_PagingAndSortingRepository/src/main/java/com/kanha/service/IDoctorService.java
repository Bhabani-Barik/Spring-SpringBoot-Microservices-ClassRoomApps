package com.kanha.service;

import org.springframework.data.domain.Page;

import com.kanha.entity.DoctorEntity;

public interface IDoctorService {

	public  Iterable<DoctorEntity> showDoctorsBySorting(boolean asc, String ...props);
	
	public Page<DoctorEntity> showDoctorsInfoByPageNo(int pageNo, int pageSize, boolean ascOrder, String props);
}
