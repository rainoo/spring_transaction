package com.gittoy.spring.demo1;

public interface AccountDao {
	void outMoney(String out, double money);
	void inMoney(String in, double money);
}
