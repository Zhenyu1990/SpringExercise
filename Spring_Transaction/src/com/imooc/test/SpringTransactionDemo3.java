package com.imooc.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.imooc.service.AccountService;

/**
 * ����ʽ���������� ��ʽ��
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext3.xml")
public class SpringTransactionDemo3 {

	// ����ҵ�����
	// ע�������
	@Resource(name="accountService")
	private AccountService accountService;
	
	@Test
	public void demo1() {
		accountService.transfer("aaa", "bbb", 200d);
	}
	
}
