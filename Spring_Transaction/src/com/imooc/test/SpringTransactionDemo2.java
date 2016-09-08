package com.imooc.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.imooc.service.AccountService;

/**
 * 声明式事务管理测试 方式一
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext2.xml")
public class SpringTransactionDemo2 {

	// 测试业务层类
	// 注入代理类
	@Resource(name="accountServiceProxy")
	private AccountService accountService;
	
	@Test
	public void demo1() {
		accountService.transfer("aaa", "bbb", 200d);
	}
	
}
