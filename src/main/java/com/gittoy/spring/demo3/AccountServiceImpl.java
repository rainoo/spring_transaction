package com.gittoy.spring.demo3;

public class AccountServiceImpl implements AccountService {

	// 注入转账中的DAO类
	private AccountDao accountDao;

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public void transfer(String out, String in, Double money) {
		accountDao.outMoney(out, money);
		// System.out.println( 1 / 0);
		accountDao.inMoney(in, money);
	}

}
