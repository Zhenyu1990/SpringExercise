package com.imooc.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.imooc.service.AccountService;

/**
 * 编程式事务管理测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringTransactionDemo {

	// 测试业务层类
	@Resource(name="accountService")
	private AccountService accountService;
	
	@Test
	public void demo1() {
		accountService.transfer("aaa", "bbb", 200d);
	}
	
}
