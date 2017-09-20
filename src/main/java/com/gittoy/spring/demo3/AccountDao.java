package com.gittoy.spring.demo3;

public interface AccountDao {
	void outMoney(String out, double money);
	void inMoney(String in, double money);
}
