package com.kanha.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kanha.service.ICollegeMgmtService;

@Component
public class AssociationMappingTestRunner implements CommandLineRunner {
	@Autowired
	private  ICollegeMgmtService  clgService;

	@Override
	public void run(String... args) throws Exception {
		  //saving data parent to child
			/*try {
				//parent object
				College clg=new College("CBIET", "hyd");
				Student st1=new Student("raja","hyd");
				Student st2=new Student("jani","delhi");
				//link college with  students
				st1.setCollegeInfo(clg); st2.setCollegeInfo(clg);
				//link Students with College
				clg.setStudentsInfo(Set.of(st1, st2));
				//invoke the service method
				String msg=clgService.saveCollegeAndItsStudents(clg);
				System.out.println(msg);
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		
		 //saving data  child  to parent
	/*	try {
			//parent object
			College clg=new College("JBIET", "hyd");
			Student st1=new Student("suresh","hyd");
			Student st2=new Student("ramesh","delhi");
			Student st3=new Student("nagesh","vizag");
			
			//link college with  students
			st1.setCollegeInfo(clg); st2.setCollegeInfo(clg); st3.setCollegeInfo(clg);
			//link Students with College
			Set<Student>  studs=new HashSet<Student>();
			studs.add(st1);studs.add(st2);studs.add(st3);
			clg.setStudentsInfo(studs);
			//invoke the service method
			String msg=clgService.saveStudentsAndThierCollege(Arrays.asList(st1,st2,st3));
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		} */
		
	/*	//parent to child Loading
		try {
			List<College> list=clgService.showCollegeAndItsStudetns();
			list.forEach(clg->{
				System.out.println("parent ::"+clg);
				Set<Student>  childs=clg.getStudentsInfo();
				childs.forEach(st->{
					System.out.println("Child::"+st);
				});
				System.out.println("--------------------");
			});
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
	/*try {
		List<Student> list=clgService.showStudentsAndTheirCollege();
		list.forEach(st->{
			System.out.println("child ::"+st);
			College  clg=st.getCollegeInfo();
			System.out.println("parent::"+clg);
			System.out.println("--------------------");
		});
	}
	catch(Exception e) {
		e.printStackTrace();
	}*/
		
	/*	try {
			String msg=clgService.deleteCollegeAndItsStudentsById(1004);
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
	/*try {
		String msg=clgService.deleteAllStudentsOfACollegeById(1003);
		System.out.println(msg);
	}
	catch(Exception e) {
		e.printStackTrace();
	}*/
		
	/*try {
		String msg=clgService.deleteOnlyOneStudentOfACollege(7);
		System.out.println(msg);
	}
	catch(Exception e) {
		e.printStackTrace();
	}*/
		
	/*		try {
				String msg=clgService.deleteAllStudentsAndTheirCollege(List.of(5,6));
				System.out.println(msg);
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		
	/*try {
		Student  st=new Student("kiran","hyd");
		String msg=clgService.addNewStudentToCollege(1000, st);
		System.out.println(msg);
	}
	catch(Exception e) {
		e.printStackTrace();
	}*/
		
		try {
			String msg=clgService.transferStudentToNewCollege(17, 1003);
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
