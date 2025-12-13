package com.kanha.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kanha.entity.Politician;
import com.kanha.service.IPoliticianMgmtService;

@Component
public class JpaRepositoryTestRunner implements CommandLineRunner {
	@Autowired
	private IPoliticianMgmtService politicianService;

	@Override
	public void run(String... args) throws Exception {
		// invoke the method
		/*try {
			String msg=politicianService.removePoliticiansByIdsInBatch(List.of(143,144,156,0,9,10));
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		/*	try {
				Politician politician=new Politician();
				politician.setParty("BJP"); politician.setName("Yogi");
				List<Politician>  list=politicianService.showPoliticiansByExampleData(politician, true, "name");
				list.forEach(System.out::println);
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/

		/*try {
				Optional<Politician>  opt=politicianService.findPoloticianById(141);
					if(opt.isPresent())
					    System.out.println("Politician data:"+opt.get());
					else
						System.out.println("Politician not found");
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/

			try {
				Politician  proxy=politicianService.showPoliticianById(140);
				//System.out.println("Proxy object class name::"+proxy.getClass()+"......"+proxy.getClass().getSuperclass());
				System.out.println("name ::"+proxy.getName());
				//System.out.println("name ::"+proxy.getParty());
			}
			catch(Exception  e) {
				e.printStackTrace();
			}

	}// run
}// class
