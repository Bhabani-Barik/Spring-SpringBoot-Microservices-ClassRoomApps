package com.kanha.service;

import java.util.List;

public interface ICollegeMgmtService {
    public  List<Object[]>  fetchCollegeAndStudentsData();
    public  List<Object[]>  fetchStudentsAndCollegesData();
}
