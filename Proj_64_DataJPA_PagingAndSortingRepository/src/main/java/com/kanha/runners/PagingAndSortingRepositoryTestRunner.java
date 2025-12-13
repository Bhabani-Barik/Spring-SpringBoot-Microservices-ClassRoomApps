package com.kanha.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kanha.service.IPoliticianMgmtService;


@Component
public class PagingAndSortingRepositoryTestRunner implements CommandLineRunner {
	@Autowired
	private  IPoliticianMgmtService  politicianService;

	@Override
	public void run(String... args) throws Exception {
		
		/*try {
		  politicianService.showPoliticiansSorted(false, "name","party").forEach(pltcn->{
			  System.out.println(pltcn);
		  });
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
		/*	try {
				Page<Politician> page=politicianService.showPoliticiansByPageNo(4, 7);
				System.out.println("Records of  "+(page.getNumber()+1)+"/"+page.getTotalPages());
				System.out.println("The Records are ::");
				List<Politician> list=page.getContent();
				list.forEach(System.out::println);
				System.out.println("------------------------");
				page.forEach(System.out::println);
				System.out.println("--------------------------");
				System.out.println(" Is  current page is first Page::"+page.isFirst());
				System.out.println(" Is  current  page is last Page::"+page.isLast());
				System.out.println(" Is current  page is having next Page::"+page.hasNext());
				System.out.println(" Is current  page is having previous Page::"+page.hasPrevious());
				System.out.println(" Is current  page  is Empty Page::"+page.isEmpty());
				System.out.println(" No.of records  in table ::"+page.getTotalElements());
				System.out.println(" No.of records  in current page ::"+page.getNumberOfElements());
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		*/
		/*	try {
					Page<Politician> page=politicianService.showPoliticiansByPageNoAsSorted(0, 5,true,"name");
					System.out.println("Records of  "+(page.getNumber()+1)+"/"+page.getTotalPages());
					System.out.println("The Records are ::");
					List<Politician> list=page.getContent();
					list.forEach(System.out::println);
					System.out.println("------------------------");
					page.forEach(System.out::println);
					System.out.println("--------------------------");
					System.out.println(" Is  current page is first Page::"+page.isFirst());
					System.out.println(" Is  current  page is last Page::"+page.isLast());
					System.out.println(" Is current  page is having next Page::"+page.hasNext());
					System.out.println(" Is current  page is having previous Page::"+page.hasPrevious());
					System.out.println(" Is current  page  is Empty Page::"+page.isEmpty());
					System.out.println(" No.of records  in table ::"+page.getTotalElements());
					System.out.println(" No.of records  in current page ::"+page.getNumberOfElements());
		 	}
			catch(Exception e) {
		     e.printStackTrace();		
			}
		*/	
	try {
		politicianService.showPoliticiansByPagination(6);
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
		
	}//run
}// class
