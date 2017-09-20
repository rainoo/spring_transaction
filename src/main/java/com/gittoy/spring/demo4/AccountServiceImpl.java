package com.gittoy.spring.demo4;

import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * 转账案例的业务层实现类
 * 
 * @Transactional注解中的属性
 * 
 * propagation	：事务的传播行为
 * isolation	：事务的隔离级别
 * readOnly		：只读
 * rollbackFor	：发生哪些异常回滚
 * noRollbackFor：发生哪些异常不回滚
 * 
 * @author GaoYu
 */
@Transactional
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
