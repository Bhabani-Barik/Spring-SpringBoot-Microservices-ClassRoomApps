package com.kanha.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.kanha.entity.Politician;
import com.kanha.repository.IPoliticianRepository;
import com.kanha.service.IPoliticianMgmtService;

@Service("pltnService")
public class PoliticianMgmtServiceImpl implements IPoliticianMgmtService {
	@Autowired
	private  IPoliticianRepository  politicianRepo;

	@Override
	public Iterable<Politician> showPoliticiansSorted(boolean ascOrder, String... props) {
		//Create the Sort  object
		Sort sort=Sort.by(ascOrder?Sort.Direction.ASC:Sort.Direction.DESC, props);
		//find the records
		Iterable<Politician>  it=politicianRepo.findAll(sort);
		return it;
	}

	@Override
	public Page<Politician> showPoliticiansByPageNo(int pageNo, int pageSize) {
		// Prepare Pageable object
		Pageable  pageable =PageRequest.of(pageNo, pageSize);
		//execute the logics
		Page<Politician>  page=politicianRepo.findAll(pageable);
		return page;
	}
	
	@Override
	public Page<Politician> showPoliticiansByPageNoAsSorted(int pageNo, int pageSize, 
			boolean ascOrder,String... props) {
		//create Sort object
		Sort sort=Sort.by(ascOrder?Sort.Direction.ASC:Sort.Direction.DESC, props);
		//create Pageable Object
		Pageable pageable=PageRequest.of(pageNo, pageSize,sort);
		//execute the logic
		Page<Politician>  page=politicianRepo.findAll(pageable);
		return page;
	}
	
	@Override
	public void showPoliticiansByPagination(int pageSize) {
		// get total records count
		 long count=politicianRepo.count();
		 //get total no.of pages
		 long pagesCount=count/pageSize;
		 if(count%pageSize!=0)
			    pagesCount++;
		 
		 //display records page by page 
		 for(int i=0;i<pagesCount;++i) {
			 Pageable pageable=PageRequest.of(i, pageSize);
			 Page<Politician>  page=politicianRepo.findAll(pageable);
			 System.out.println("Records of "+(page.getNumber()+1)+"/"+page.getTotalPages());
			 page.forEach(System.out::println);
			 System.out.println("==============================");
		 }//for
		
	}//method
	
	
	

	
		
	

}

