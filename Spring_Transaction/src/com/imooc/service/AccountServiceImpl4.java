package com.imooc.service;

import org.springframework.transaction.annotation.Transactional;

import com.imooc.dao.AccountDao;

/**
 * 转账案例的业务层实现类
 * 声明式的事务管理 方式三 基于注解
 * @author Zhenyu
 */

/**
 *  在需要使用事务管理的类上添加注解
 *	@Transactional注解可以设置属性:
 *		propagation - 事务的传播行为
 *		isolation	- 事务的隔离级别
 *		readOnly	- 只读
 *		rollbackFor	- 发生哪些异常回滚
 *		noRollbackFor - 发生哪些异常不回滚
 */
@Transactional
public class AccountServiceImpl4 implements AccountService {
	
	// 注入转账的DAO的类
	private AccountDao accountDao;

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	@Override
	public void transfer(String out, String in, Double money) {
		accountDao.outMoney(out, money);
		// 测试异常发生, 事务失败
//		int i = 1 / 0;
		accountDao.inMoney(in, money);
	}

	
}
