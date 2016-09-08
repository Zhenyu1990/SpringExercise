package com.imooc.service;

import com.imooc.dao.AccountDao;

/**
 * 转账案例的业务层实现类
 * 声明式的事务管理 方式二
 * @author Zhenyu
 */
public class AccountServiceImpl3 implements AccountService {
	
	// 注入转账的DAO的类
	private AccountDao accountDao;

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	@Override
	public void transfer(String out, String in, Double money) {
		accountDao.outMoney(out, money);
		// 测试异常发生, 事务失败
		int i = 1 / 0;
		accountDao.inMoney(in, money);
	}

	
}
