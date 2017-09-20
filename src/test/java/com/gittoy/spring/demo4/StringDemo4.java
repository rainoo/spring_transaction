package com.gittoy.spring.demo4;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Spring的声明式事务管理的方式三：基于注解的事务管理方式
 * @author GaoYu
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext4.xml")
public class StringDemo4{

	@Resource
	private AccountService accountService;

	@Test
	public void demo1() {
		accountService.transfer("aaa", "bbb", 200d);
	}
}
