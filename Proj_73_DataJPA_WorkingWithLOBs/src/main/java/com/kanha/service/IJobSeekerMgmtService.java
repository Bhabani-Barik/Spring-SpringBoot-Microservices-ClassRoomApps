package com.kanha.service;

import com.kanha.entity.JobSeeker;

public interface IJobSeekerMgmtService {
    public   String registerJobSeeker(JobSeeker js);
    public  JobSeeker  findJobSeekerById(int id);
}
