package com.kanha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kanha.entity.ActorEntity;

@Repository
public interface IActorRepository extends JpaRepository<ActorEntity, Integer> {

}
