package com.imooc.service;

import com.imooc.dao.AccountDao;

/**
 * ת�˰�����ҵ���ʵ����
 * ����ʽ��������� ��ʽ��
 * @author Zhenyu
 */
public class AccountServiceImpl3 implements AccountService {
	
	// ע��ת�˵�DAO����
	private AccountDao accountDao;

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	@Override
	public void transfer(String out, String in, Double money) {
		accountDao.outMoney(out, money);
		// �����쳣����, ����ʧ��
		int i = 1 / 0;
		accountDao.inMoney(in, money);
	}

	
}
