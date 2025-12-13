package com.kanha.serviceImpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kanha.entity.Politician;
import com.kanha.exception.PoliticianNotFoundException;
import com.kanha.repository.IPoliticianRepository;
import com.kanha.service.IPoliticianMgmtService;

@Service("pltnService")
public class PoliticianMgmtServiceImpl implements IPoliticianMgmtService {
	@Autowired
	private  IPoliticianRepository  politicianRepo;
	

	@Override
	public String registerPolitician(Politician politician) {
		
		//save the object  (insert the record)
		Politician  savedPolitician=politicianRepo.save(politician);
		//get the id value from the saved Object
		int idVal=savedPolitician.getId();
		return  "Politician object saved (record inserted)  using the id value ::"+idVal;
	}


	@Override
	public long getPoliticinsCount() {
		return politicianRepo.count();
	}
	
	@Override
	public String checkPoliticianAvaialbility(int id) {
		boolean  flag=politicianRepo.existsById(id);
		return flag==true?id+" Politician is Available":id+"Politician is not avaiable";
	}
	
	@Override
	public Iterable<Politician> showAllPoliticians() {
		Iterable<Politician>  it=politicianRepo.findAll();
		return it;
	}
	
	
	@Override
	public String registerPoliticians(Iterable<Politician> politicians) {
		// use repo
		Iterable<Politician>  savedPoliticiansList=politicianRepo.saveAll(politicians);
		// get id values from the SavedEntities
		List<Integer> ids=StreamSupport.stream(savedPoliticiansList.spliterator(), false).map(Politician::getId).collect(Collectors.toList());
		/*List<Integer> ids=new ArrayList<>();
		savedPoliticiansList.forEach(pltcn->{
			ids.add(pltcn.getId());
		});*/
		return  ids.size()+" no.of Politicians are saved with ids "+ids;
	}
	
	@Override
	public Iterable<Politician> showAllPoliticiansById(Iterable<Integer> ids) {
		//use  repo
		Iterable<Politician>  list=politicianRepo.findAllById(ids);
		return list;
	}


	@Override
	public Optional<Politician> showPoliticianById(int id) {
		Optional<Politician>  opt=politicianRepo.findById(id);
		return opt;
	}
	
	@Override
	public String fetchPoliticianById(int id) {
		Optional<Politician> opt=politicianRepo.findById(id);
		if(opt.isEmpty())
			return "Politician not found";
		else {
		  Politician politician=opt.get();
		  return  opt.toString();
		}
	}
	
	/*@Override
	public Politician getPoliticianById(int id) {
		Optional<Politician> opt=politicianRepo.findById(id);
		if(opt.isPresent()) {
			return  opt.get();
		}
		else {
		    //throw  new IllegalArgumentException("Invalid  Id");
			throw  new PoliticianNotFoundException("Invalid  Id");
		}
	}*/
	
	@Override
	public Politician getPoliticianById(int id) {
	  return politicianRepo.findById(id).orElseThrow(()->new PoliticianNotFoundException("Invalid Id"));
	}
	
	@Override
	public Politician displayPoliticianById(int id) {
		return politicianRepo.findById(id).orElse(new Politician(1001,"stand By Leader","delhi",5555.0,"BJP","galli",20));
	}
	
	@Override
	public String updatePoliticianIncomeById(int id,double hikePercent) {
		//Load the object
		Politician  politician=politicianRepo.findById(id).orElseThrow(()-> new PoliticianNotFoundException("Invalid Id"));
		//update the object
		politician.setIncome(politician.getIncome()+ (politician.getIncome() * hikePercent/100.0));
		politicianRepo.save(politician);
		return id+" Politician Income is updated to "+politician.getIncome();
	}
	
	@Override
	public String saveOrUpdatePoliticianData(Politician politician) {
		Optional<Politician> opt=politicianRepo.findById(politician.getId());
		if(opt.isEmpty()) {
			//save the object
			politicianRepo.save(politician);
			return "Politician Data is Saved";
		}
		else {
			politicianRepo.save(politician);
			return "Politician data is Updated";
		}
	}
	
	@Override
	public String removePoliticianById(int id) {
		//check wheather record is available or not 
		boolean flag= politicianRepo.existsById(id);
		if(flag) {
			politicianRepo.deleteById(id);
			return id+" Politician is found and Deleted"; 
		}
		return  id+" Politician is not found";
	}
	
	@Override
	public String removePoliticinsByIds(List<Integer> ids) {
		Iterable<Politician>  it=politicianRepo.findAllById(ids);
		long  count=StreamSupport.stream(it.spliterator(),true).count();
		if(count>0) {
			politicianRepo.deleteAllById(ids);
			return  count+" no.of  Politicians are deleted";
		}
		else {
			return  "Politicians are not found for deletion";
		}
	}
	
	@Override
	public String removeAllPoliticians() {
		//get the count of records
		long count=politicianRepo.count();
		if(count>0) {
			politicianRepo.deleteAll();
			return count+" no.of Politicians are deleted";
		}
		else{
		   return "Politicians are not found for deletion";
		}
	}
	
	

}
