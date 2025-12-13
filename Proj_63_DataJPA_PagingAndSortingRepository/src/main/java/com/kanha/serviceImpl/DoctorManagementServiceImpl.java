package com.kanha.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.kanha.entity.DoctorEntity;
import com.kanha.repository.IDoctorRepository;
import com.kanha.service.IDoctorService;

@Service
public class DoctorManagementServiceImpl implements IDoctorService{
	
	@Autowired IDoctorRepository doctorRepository;

	@Override
	public Iterable<DoctorEntity> showDoctorsBySorting(boolean asc, String... props) {
		
		// prepare the sort object
		Sort sort = Sort.by(asc ? Direction.ASC : Direction.DESC, props);
		
		// use repo
		Iterable<DoctorEntity> it = doctorRepository.findAll(sort);
		return it;
	}

	@Override
	public Page<DoctorEntity> showDoctorsInfoByPageNo(int pageNo, int pageSize, boolean ascOrder, String props) {

		// Prepare the Sort Object
		Sort sort = Sort.by(ascOrder ? Direction.ASC : Direction.DESC, props);
		
		// Prepare Pageable Object
		Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
		
		// Use the repo
		Page<DoctorEntity> page = doctorRepository.findAll(pageable); 
		return page;
	}

}
