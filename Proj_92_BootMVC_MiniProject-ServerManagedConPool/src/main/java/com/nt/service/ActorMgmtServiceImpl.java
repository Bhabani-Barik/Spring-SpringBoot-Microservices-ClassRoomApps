package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.ActorEntity;
import com.nt.error.ActorNotFoundException;
import com.nt.repository.IActorRepository;
import com.nt.vo.ActorVO;

@Service
public class ActorMgmtServiceImpl implements IActorMgmtService {
	@Autowired
	private  IActorRepository  actorRepo;

	@Override
	public List<ActorVO> showAllActorDetails() {
		//use repo
		List<ActorEntity>  listEntity=actorRepo.findAll();
		//convert  List<ACtorEntity> to List<ActorVO> 
		List<ActorVO>  listVO=new ArrayList();
		listEntity.forEach(entity->{
			ActorVO vo=new ActorVO();
			BeanUtils.copyProperties(entity, vo);
			listVO.add(vo);
		});
		return listVO;
	}
	
	@Override
	public String saveActor(ActorVO actorVO) {
		 //covert  VO to Entity 
		ActorEntity entity=new ActorEntity();
		BeanUtils.copyProperties(actorVO, entity);
		entity.setCreatedBy(System.getProperty("user.name"));
		//use repo
		int idVal=actorRepo.save(entity).getAid();
		return "Actor object is saved with the id Value ::"+idVal;
	}
	
	@Override
	public ActorVO showActorById(int id) {
		//Load the object
		ActorEntity actorEntity=actorRepo.findById(id).orElseThrow(()->new ActorNotFoundException("Invalid actor id"));
		// Convert  entity object to  vo object
		 ActorVO  actorVO=new ActorVO();
		 BeanUtils.copyProperties(actorEntity, actorVO);
		 return  actorVO;
		
	}
	
	@Override
	public String editActor(ActorVO actorVO) {
		//Load the object
		ActorEntity  actorEntity=actorRepo.findById(actorVO.getAid()).orElseThrow(()->new IllegalArgumentException("Invalid Id"));
	 //convert VO to  Entity
		BeanUtils.copyProperties(actorVO, actorEntity);
		actorEntity.setUpdatedBy(System.getProperty("user.name"));
	  //use repo
		int idVal=actorRepo.save(actorEntity).getAid();
		return idVal+" id  Actor is updated ";
	}
	
	@Override
	public String deleteActorById(int aid) {
		//Load object
		  actorRepo.findById(aid).orElseThrow(()->new IllegalArgumentException("Invalid Id"));
		//use repo
		actorRepo.deleteById(aid);
		//redirect the request
		return  aid+" id  actor is deleted";
	}
	
	

}
