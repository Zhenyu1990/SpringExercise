package com.imooc.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * ת�˰�����DAO��ʵ����
 * ����ʽ��������� ��ʽһ
 * @author Zhenyu
 */
public class AccountDaoImpl2 extends JdbcDaoSupport implements AccountDao {

	@Override
	public void outMoney(String out, Double money) {
		String sql = "update account set money = money - ? where name = ?";
		this.getJdbcTemplate().update(sql, money, out);
	}

	@Override
	public void inMoney(String in, Double money) {
		String sql = "update account set money = money + ? where name = ?";
		this.getJdbcTemplate().update(sql, money, in);
	}

}
