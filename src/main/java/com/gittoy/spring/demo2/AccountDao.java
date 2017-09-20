package com.gittoy.spring.demo2;

public interface AccountDao {
	void outMoney(String out, double money);
	void inMoney(String in, double money);
}
