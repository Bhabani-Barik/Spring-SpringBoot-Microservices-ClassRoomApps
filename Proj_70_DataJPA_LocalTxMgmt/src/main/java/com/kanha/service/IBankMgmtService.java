package com.kanha.service;

public interface IBankMgmtService {
	public String withdraw(long acno, double amt);

	public String deposite(long acno, double amt);

	public String transferMoney(long srcAcno, long destAcno, double amt);

}
