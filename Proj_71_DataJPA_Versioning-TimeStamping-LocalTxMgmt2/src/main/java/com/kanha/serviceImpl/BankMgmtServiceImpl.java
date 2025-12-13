package com.kanha.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.kanha.entity.BankAccount;
import com.kanha.repository.IBankAccountRepoistory;
import com.kanha.service.IBankMgmtService;

@Service
public class BankMgmtServiceImpl implements IBankMgmtService {
	@Autowired
	private IBankAccountRepoistory accountRepo;

	@Override
	public String withdraw(long acno, double amt) {
		BankAccount account = accountRepo.findById(acno)
				.orElseThrow(() -> new IllegalArgumentException("Invalid Account  Number "));
		// withdraw amount
		account.setBalance(account.getBalance() - amt);
		account.setUpdatedDBy(System.getProperty("user.name"));
		// update the object
		accountRepo.save(account);

		return amt + " Amount is  withdrwan  from account number ::" + acno;
	}

	@Override
	public String deposite(long acno, double amt) {
		BankAccount account = accountRepo.findById(acno)
				.orElseThrow(() -> new IllegalArgumentException("Invalid Account  Number "));
		// withdraw amount
		account.setBalance(account.getBalance() + amt);
		account.setUpdatedDBy(System.getProperty("user.name"));

		// update the object
		accountRepo.save(account);

		return amt + " Amount is  deposited  to account number ::" + acno;

	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	// @Transactional(propagation = Propagation.NOT_SUPPORTED)
	// @Transactional(propagation = Propagation.REQUIRES_NEW)
	// @Transactional(propagation = Propagation.MANDATORY)
	// @Transactional(propagation = Propagation.NEVER)
	// @Transactional(propagation = Propagation.SUPPORTS)
	public String transferMoney(long srcAcno, long destAcno, double amt) {
		withdraw(srcAcno, amt);
		deposite(destAcno, amt);
		return amt + " amount is transfered from srcAcno::" + srcAcno + " to  destAcno::" + destAcno;
	}

	@Override
	public String openAccount(BankAccount account) {
		account.setCreatedBy(System.getProperty("user.name"));
		long idVal = accountRepo.save(account).getAcno();
		return "Bank Account is opened with account nunber ::" + idVal;
	}

	@Override
	public BankAccount showAccountDetails(long acno) {
		BankAccount account = accountRepo.findById(acno)
				.orElseThrow(() -> new IllegalArgumentException("Invalid Acno"));
		return account;
	}

}
