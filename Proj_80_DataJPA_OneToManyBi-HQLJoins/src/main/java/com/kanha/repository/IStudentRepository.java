package com.kanha.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kanha.entity.Student;

public interface IStudentRepository extends JpaRepository<Student, Integer> {

	
	//@Query("select  s.sid,s.sname,s.saddrs,c.cid,c.cname,c.caddrs  from Student s inner join  s.collegeInfo c")
	//@Query("select  s.sid,s.sname,s.saddrs,c.cid,c.cname,c.caddrs  from Student s left join  s.collegeInfo c")
	@Query("select  s.sid,s.sname,s.saddrs,c.cid,c.cname,c.caddrs  from Student s right join  s.collegeInfo c")
	public  List<Object[]>  showStudentsAndThierCollegesUsingJoins();
	 
}
