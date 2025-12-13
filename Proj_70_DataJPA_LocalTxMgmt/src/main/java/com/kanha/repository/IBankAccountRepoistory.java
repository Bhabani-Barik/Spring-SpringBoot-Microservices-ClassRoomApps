package com.kanha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kanha.entity.BankAccount;

@Repository
public interface IBankAccountRepoistory extends JpaRepository<BankAccount, Long> {

}