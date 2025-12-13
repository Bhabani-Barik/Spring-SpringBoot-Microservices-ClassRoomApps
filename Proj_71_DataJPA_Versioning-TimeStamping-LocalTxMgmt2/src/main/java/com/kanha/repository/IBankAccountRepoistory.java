package com.kanha.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kanha.entity.BankAccount;

public interface IBankAccountRepoistory extends JpaRepository<BankAccount, Long> {

}
