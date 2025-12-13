package com.kanha.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kanha.service.IPoliticianMgmtService;

@Component
public class JpaRepositoryTestRunner implements CommandLineRunner {
	@Autowired
	private IPoliticianMgmtService politicianService;

	@Override
	public void run(String... args) throws Exception {
		/*	try {
			List<Politician>  list=politicianService.showPoliticianByParty("BJP");
			list.forEach(System.out::println);
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		/*try {
			Optional<Politician>  opt=politicianService.showPoloticianByName("CBN11");
			if(opt.isEmpty())
				System.out.println("Politician not found");
			else
				System.out.println("Politician  found::"+opt.get());
		}
		catch(Exception  e) {
			e.printStackTrace();
		}*/
		/*	try {
				Iterable<Politician>  list=politicianService.showPoliticianByIncomeRange(5000.0, 20000.0);
				list.forEach(System.out::println);
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		/*try {
			politicianService.showPoloticiansHavingInitChars("C").forEach(System.out::println);
			System.out.println("---------------------------------");
			politicianService.showPoloticiansHavingLastChars("N").forEach(System.out::println);
			System.out.println("---------------------------------");
			politicianService.showPoloticiansHavingChars("A").forEach(System.out::println);
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		/*	try {
				politicianService.showPoliticianByIncomeRange(50000.0, 100000.0).forEach(System.out::println);
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		try {
			politicianService.showPoliticiansByPartiesOrIncomeRange(List.of("BJP","INC"), 5000.0, 20000.0).forEach(System.out::println);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
				
	}// run
}// class
