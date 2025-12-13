package com.kanha.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kanha.service.IPoliticianMgmtService;

@Component
public class CrudRepositoryTestRunner implements CommandLineRunner {
	@Autowired
	private  IPoliticianMgmtService  politicianService;

	@Override
	public void run(String... args) throws Exception {
		
		/*try {
			//create  the Entity Object
			Politician  politician=new Politician();
			politician.setName("ramesh"); politician.setArea("delhi");
			politician.setParty("AAP"); politician.setIncome(81090.0);
			politician.setCategory("State");politician.setAge(40);
			//invoke the method
			String  msg=politicianService.registerPolitician(politician);
			System.out.println(msg);
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		
		/*try {
			long count=politicianService.getPoliticinsCount();
			System.out.println("Count is::"+count);
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
		/*try {
			String msg=politicianService.checkPoliticianAvaialbility(1052);
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		/*	try {
				Iterable<Politician>  it=politicianService.showAllPoliticians();
			    it.forEach(System.out::println);
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		
		/*	try {
				Politician  pltcn1=new Politician("ramesh","secbad",679000.0,"BJP","state",30);
				Politician  pltcn2=new Politician("nagesh","delhi",619000.0,"INC","state",31);
				List<Politician>  list=List.of(pltcn1,pltcn2);
				//invoke the method
				String msg=politicianService.registerPoliticians(list);
				System.out.println(msg);
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		
		/*try {
			Iterable<Politician>  list=politicianService.showAllPoliticiansById(Arrays.asList(4,5,6,null,35));
			long count=StreamSupport.stream(list.spliterator(), false).count();
			System.out.println("Available records count::"+count);
			list.forEach(System.out::println);
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		/*try {
			Optional<Politician>  opt=politicianService.showPoliticianById(45);
			if(opt.isEmpty())
				System.out.println("Policitian Not Found");
			else {
				Politician  politician=opt.get();
				System.out.println("Politician details are ::"+politician);
			}
				
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
		/*	try {
				String msg=politicianService.fetchPoliticianById(1);
				System.out.println(msg);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		*/
		
		/*try {
			Politician politician=politicianService.getPoliticianById(133);
			System.out.println("Politician Info ::"+politician);
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
		/*	try {
				Politician  politician=politicianService.displayPoliticianById(1);
				System.out.println(politician);
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		/*try {
			String msg=politicianService.updatePoliticianIncomeById(1, 20.0);
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		/*try {
			Politician  politician=new Politician(1, "rajesh", "navi-mumbai",545555.0, "BJP","state",55);
			String  msg=politicianService.saveOrUpdatePoliticianData(politician);
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		/*try {
			String msg=politicianService.removePoliticianById(10);
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
		/*	try {
				String msg=politicianService.removePoliticinsByIds(List.of(4,8,9,10,11));
				System.out.println(msg);
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		try {
			String msg=politicianService.removeAllPoliticians();
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
	}
}