package com.kanha.service;

import java.util.List;

import com.kanha.entity.College;
import com.kanha.entity.Student;

public interface ICollegeMgmtService {
	   public   String   saveCollegeAndItsStudents(College clg);
	   public  String   saveStudentsAndThierCollege(List<Student> list);
	   
	   public  List<College>  showCollegeAndItsStudetns();
	   public  List<Student>  showStudentsAndTheirCollege();
	   
	   public   String  deleteCollegeAndItsStudentsById(int cno);
	   public  String    deleteAllStudentsOfACollegeById(int cno);
	   public  String  deleteOnlyOneStudentOfACollege( int sno);
	   
	   public  String  deleteAllStudentsAndTheirCollege(List<Integer> sids);
	   public   String   addNewStudentToCollege(int cid,Student st);
	   
	   public  String  transferStudentToNewCollege(int sid, int cid);
	}
