package com.gittoy.spring.demo1;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 转账案例的测试类
 * @author GaoYu
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class StringDemo1 {

	// 测试业务层类
	@Resource(name="accountService")
	private AccountService accountService;

	@Test
	public void demo1() {
		accountService.transfer("aaa", "bbb", 200d);
	}
}
