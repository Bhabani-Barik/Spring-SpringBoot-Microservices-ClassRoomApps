package com.kanha.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kanha.entity.JobSeeker;
import com.kanha.repository.IJobSeekerRepository;
import com.kanha.service.IJobSeekerMgmtService;

@Service
public class JobSeekerMgmtServiceImpl implements IJobSeekerMgmtService {
	@Autowired
	private  IJobSeekerRepository  jsRepo;

	@Override
	public String registerJobSeeker(JobSeeker js) {
		//save the object
		int idVal=jsRepo.save(js).getJsid();
		return "JobSeeker is saved with id value ::"+idVal;
	}
	
	@Override
	public JobSeeker findJobSeekerById(int id) {
		return jsRepo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid JsId"));
	}

}