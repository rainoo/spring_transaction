package com.gittoy.spring.demo2;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Spring的声明式事务管理的方式一：基于TransactionProxyFactoryBean的方式。
 * 需要为每个进行事务管理的类，配置一个TransactionProxyFactory进行增强。
 * @author GaoYu
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext2.xml")
public class StringDemo2{

	/**
	 * 注入代理类：因为代理类进行了增强的操作。
	 */
	@Resource(name="accountServiceProxy")
	private AccountService accountService;

	@Test
	public void demo1() {
		accountService.transfer("aaa", "bbb", 200d);
	}
}
