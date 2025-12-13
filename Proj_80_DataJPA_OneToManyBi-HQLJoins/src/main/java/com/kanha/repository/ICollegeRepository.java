package com.kanha.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kanha.entity.College;

public interface ICollegeRepository extends JpaRepository<College, Integer> {

	//@Query("select  c.cid,c.cname,c.caddrs,s.sid,s.sname,s.saddrs from  College c inner join c.studentsInfo  s ")
	//@Query("select  c.cid,c.cname,c.caddrs,s.sid,s.sname,s.saddrs from  College c left join c.studentsInfo  s ")
	//@Query("select  c.cid,c.cname,c.caddrs,s.sid,s.sname,s.saddrs from  College c right join c.studentsInfo  s ")
	@Query("select  c.cid,c.cname,c.caddrs,s.sid,s.sname,s.saddrs from  College c full join c.studentsInfo  s ")
	public  List<Object[]> showCollegesAndStudentsUsingJoins();
}
