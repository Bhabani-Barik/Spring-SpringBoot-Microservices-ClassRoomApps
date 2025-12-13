package com.kanha.serviceImpl;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kanha.entity.College;
import com.kanha.entity.Student;
import com.kanha.repository.ICollegeRepository;
import com.kanha.repository.IStudentRepository;
import com.kanha.service.ICollegeMgmtService;

@Service
public class CollegeMgmtServiceImpl implements ICollegeMgmtService {
	@Autowired
	private  ICollegeRepository clgRepo;
	@Autowired
	private  IStudentRepository  studRepo;

	@Override
	public String saveCollegeAndItsStudents(College clg) {
		//use repo
		int idVal=clgRepo.save(clg).getCid();
		return "College and Its Students are saved with the id value :"+idVal;
	}

	@Override
	public String saveStudentsAndThierCollege(List<Student> list) {
		//use  repo
		List<Student>  savedList=studRepo.saveAll(list);
		//collect only id values
		List<Integer> ids=savedList.stream().map(Student::getSid).collect(Collectors.toList());
		return  "Student objs and their college are saved with id values :"+ids; 
	}
	
	@Override
	public List<College> showCollegeAndItsStudetns() {
		List<College>  list=clgRepo.findAll();
		return list;
	}
	
	@Override
	public List<Student> showStudentsAndTheirCollege() {
		List<Student>  list=studRepo.findAll();
		return list;
	}

	@Override
	public String deleteCollegeAndItsStudentsById(int cno) {
		//Load  Parent object
		College college=clgRepo.findById(cno).orElseThrow(()->new IllegalArgumentException("Invalid College Id"));
		clgRepo.delete(college);
		return cno+"  College and its Students are deleted";
	}
	
	@Override
	public String deleteAllStudentsOfACollegeById(int cno) {
		//Load parent object
		College college=clgRepo.findById(cno).orElseThrow(()->new IllegalArgumentException("Invalid College Id"));
		//get  associated child objs
		Set<Student>  childs=college.getStudentsInfo();
		//remove  College from Students
		childs.forEach(st->{
			st.setCollegeInfo(null);
		});
		//delete   all childs
		studRepo.deleteAllInBatch(childs);
		return  cno+" college students are deleted";
		}
	
	@Override
	public String deleteOnlyOneStudentOfACollege(int sno) {
		//Load the Student
		Student  stud=studRepo.findById(sno).orElseThrow(()->new IllegalArgumentException("Invalid Student Id"));
		// remove  link with parent
		stud.setCollegeInfo(null);
		// update the child  object to empty the FK column
		studRepo.save(stud);
		//delete the child object
		studRepo.delete(stud);
		return sno+" Student  is  deleted";
				
	}
	
	@Override
	public String deleteAllStudentsAndTheirCollege(List<Integer> sids) {
		//Load the childs
		List<Student>  listStud=studRepo.findAllById(sids);
		if(listStud.size()!=0) {
	    	//delete the childs
		     studRepo.deleteAll(listStud);
		}
		return listStud.size()+" no.of Students and their College are deleted";
	}
	
	@Override
	public String addNewStudentToCollege(int cid, Student st) {
		//Load parent object
		College college=clgRepo.findById(cid).orElseThrow(()->new IllegalArgumentException("Invalid College Id"));
		//get all childs of  a parent
		Set<Student>  childs=college.getStudentsInfo();
		//set parent to  new  Student(child)
		st.setCollegeInfo(college);
		// add new child to existing childs
		childs.add(st);
		//update the  parent
		   clgRepo.save(college);
		   return cid+" College is added with new  Student";
	}
	
	@Override
	public String transferStudentToNewCollege(int sid, int cid) {
		//Load Student object (child obj)
		Student  st=studRepo.findById(sid).orElseThrow(()->new IllegalArgumentException("Invalid student id"));
		//load  College object  (parent obj)
		College  clg=clgRepo.findById(cid).orElseThrow(()->new IllegalArgumentException("Invalid  college id"));
		//  replace existing College object with new  College obj for the student
		st.setCollegeInfo(clg);
		//update the student object
		studRepo.save(st);
		return sid+" student is added to "+cid+" College";
		}

}
