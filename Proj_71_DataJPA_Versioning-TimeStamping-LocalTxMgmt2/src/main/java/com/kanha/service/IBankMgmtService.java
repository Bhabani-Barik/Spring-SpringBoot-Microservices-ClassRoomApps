package com.kanha.service;

import com.kanha.entity.BankAccount;

public interface IBankMgmtService {
	
	public String withdraw(long acno, double amt);

	public String deposite(long acno, double amt);

	public String transferMoney(long srcAcno, long destAcno, double amt);

	public String openAccount(BankAccount account);

	public BankAccount showAccountDetails(long acno);
}
