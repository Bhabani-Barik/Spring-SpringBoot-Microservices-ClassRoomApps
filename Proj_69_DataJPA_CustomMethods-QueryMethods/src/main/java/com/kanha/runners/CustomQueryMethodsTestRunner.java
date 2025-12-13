package com.kanha.runners;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kanha.service.IPoliticianMgmtService;

@Component
public class CustomQueryMethodsTestRunner implements CommandLineRunner {
	@Autowired
	private IPoliticianMgmtService politicianService;

	@Override
	public void run(String... args) throws Exception {
				
		/*try {
			politicianService.showPoliticiansByIncomeRange(4000.0, 20000.0).forEach(System.out::println);
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
		/*try {
			List<Politician> list=politicianService.fetchPoliticiansByParties("BJP", "INC", "AAP");
			list.forEach(System.out::println);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("=======================================");
		try {
			List<Object[]> list=politicianService.fetchPoliticiansDataByParties("BJP", "INC", "AAP");
			list.forEach(row->System.out.println(Arrays.toString(row)));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("=======================================");
		try {
			List<String> list=politicianService.fetchPoliticiansNameByParties("BJP", "INC", "AAP");
			list.forEach(System.out::println);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		*/
		/*	try {
				Optional<Politician>  opt=politicianService.fetchPoliticianByName("ABN");
				System.out.println(opt.isEmpty()?"Polotician not found":"Politician found ::"+opt.get());
				System.out.println("-------------------------------------------");
				
				Optional<Object>  opt1=politicianService.fetchPoliticianDataByName("ABN");
				System.out.println(opt1.isEmpty()?"Polotician not found":"Politician found ::"+Arrays.toString(((Object[])opt1.get())));
				System.out.println("-------------------------------------------");
				
				Optional<String> opt3=politicianService.fetchPoliticianPartyByName("ABN");
				System.out.println(opt3.isEmpty()?"Politician not found":"Politician found::"+opt3.get());
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		
		/*	 try {
				 long count=politicianService.fetchUniquePartyCount();
				 System.out.println("Count ::"+count);
				 System.out.println("--------------------------------");
				 Object row[]=politicianService.fetchAggragateResults();
				 System.out.println("aggragate results are ::"+Arrays.toString(row));
			 }
			 catch(Exception e) {
				 e.printStackTrace();
			 }*/
		/*try {
		 String msg=politicianService.hikePoliticianIncomeByParty("BJP", 10.0);
		 System.out.println(msg);
		}
		catch(Exception e) {
		 e.printStackTrace();
		}*/
		
		/*	try {
				String msg=politicianService.removePoliticiansByArea("delhi");
				System.out.println(msg);
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		
		try {
		   LocalDateTime  ldt=politicianService.fetchSystemDateTime();
		   System.out.println(ldt);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		 
				
	}// run
}// class
