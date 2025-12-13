package com.kanha.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
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
	public String removePoliticiansByIdsInBatch(List<Integer> ids) {
		//Load the records
		List<Politician> list=politicianRepo.findAllById(ids);
		int count=list.size();
		if(count!=0) {
			politicianRepo.deleteAllByIdInBatch(ids);
			return  count+" no.of records are deleted";
		}
		return "No records found for deletion";
	}

	@Override
	public List<Politician> showPoliticiansByExampleData(Politician politician,boolean ascOrder,String ...props) {
		//prepare Example object
		Example<Politician> example=Example.of(politician);
		//create Sort object
		Sort sort=Sort.by(ascOrder?Sort.Direction.ASC:Sort.Direction.DESC,props);
		//execute the query
		List<Politician>  list=politicianRepo.findAll(example,sort);
		return list;
	}
	
	@Override
	public Optional<Politician> findPoloticianById(int id) {
		Optional<Politician> opt=politicianRepo.findById(id);
		return opt;
	}
	
	@Override
	public Politician showPoliticianById(int id) {
		Politician proxy=politicianRepo.getReferenceById(id);
		return proxy;
	}

		
	

}
