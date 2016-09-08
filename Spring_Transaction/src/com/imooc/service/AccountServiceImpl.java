package com.imooc.service;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.imooc.dao.AccountDao;

/**
 * ת�˰�����ҵ���ʵ����
 * ���ʽ���������
 * @author Zhenyu
 */
public class AccountServiceImpl implements AccountService {
	
	// ע��ת�˵�DAO����
	private AccountDao accountDao;

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	// ע����������ģ��
	private TransactionTemplate transactionTemplate;
	
	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

	@Override
	// ע��, ����ʹ�������ڲ�������ⲿ����, ��Ҫ��������Ϊfinal����
	public void transfer(final String out, final String in, final Double money) {
		// ͨ���������������������
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
				accountDao.outMoney(out, money);
				// �����쳣����, ����ʧ��
				int i = 1 / 0;
				accountDao.inMoney(in, money);
			}
		});
	}

	
}
