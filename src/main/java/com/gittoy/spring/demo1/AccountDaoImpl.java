package com.gittoy.spring.demo1;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

	public void outMoney(String out, double money) {
		String sql = "update account set money = money - ? where name = ?";
		this.getJdbcTemplate().update(sql, money, out);
	}

	public void inMoney(String in, double money) {
		String sql = "update account set money = money + ? where name = ?";
		this.getJdbcTemplate().update(sql, money, in);
	}

}
