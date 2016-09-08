package com.imooc.service;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.imooc.dao.AccountDao;

/**
 * 转账案例的业务层实现类
 * 编程式的事务管理
 * @author Zhenyu
 */
public class AccountServiceImpl implements AccountService {
	
	// 注入转账的DAO的类
	private AccountDao accountDao;

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	// 注入事务管理的模板
	private TransactionTemplate transactionTemplate;
	
	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

	@Override
	// 注意, 这里使用匿名内部类调用外部参数, 需要将参数改为final类型
	public void transfer(final String out, final String in, final Double money) {
		// 通过编程是事务管理操作数据
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
				accountDao.outMoney(out, money);
				// 测试异常发生, 事务失败
				int i = 1 / 0;
				accountDao.inMoney(in, money);
			}
		});
	}

	
}
