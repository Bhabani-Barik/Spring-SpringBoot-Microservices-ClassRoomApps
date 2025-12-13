package com.kanha.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kanha.repository.ICollegeRepository;
import com.kanha.repository.IStudentRepository;
import com.kanha.service.ICollegeMgmtService;

@Service
public class CollegeMgmtServiceImpl implements ICollegeMgmtService {
	@Autowired
	private ICollegeRepository clgRepo;
	@Autowired
	private IStudentRepository studRepo;

	@Override
	public List<Object[]> fetchCollegeAndStudentsData() {
		return clgRepo.showCollegesAndStudentsUsingJoins();
	}

	@Override
	public List<Object[]> fetchStudentsAndCollegesData() {
		return studRepo.showStudentsAndThierCollegesUsingJoins();
	}

}
