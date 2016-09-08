package com.imooc.service;

import org.springframework.transaction.annotation.Transactional;

import com.imooc.dao.AccountDao;

/**
 * ת�˰�����ҵ���ʵ����
 * ����ʽ��������� ��ʽ�� ����ע��
 * @author Zhenyu
 */

/**
 *  ����Ҫʹ�����������������ע��
 *	@Transactionalע�������������:
 *		propagation - ����Ĵ�����Ϊ
 *		isolation	- ����ĸ��뼶��
 *		readOnly	- ֻ��
 *		rollbackFor	- ������Щ�쳣�ع�
 *		noRollbackFor - ������Щ�쳣���ع�
 */
@Transactional
public class AccountServiceImpl4 implements AccountService {
	
	// ע��ת�˵�DAO����
	private AccountDao accountDao;

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	@Override
	public void transfer(String out, String in, Double money) {
		accountDao.outMoney(out, money);
		// �����쳣����, ����ʧ��
//		int i = 1 / 0;
		accountDao.inMoney(in, money);
	}

	
}
