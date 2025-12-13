package com.nt.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.nt.vo.ActorVO;

public interface IActorMgmtService {
   public  List<ActorVO>  showAllActorDetails();
   public  String   saveActor(ActorVO actorVO);
   public   ActorVO   showActorById(int id);
   public   String   editActor(ActorVO  actorVO);
   public  String    deleteActorById(int aid);
   
   public  Page<ActorVO>  showActorsByPagination(Pageable  pageable);
}
