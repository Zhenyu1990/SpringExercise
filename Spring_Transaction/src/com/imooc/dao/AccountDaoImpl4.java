package com.imooc.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * 转账案例的DAO层实现类
 * 声明式的事务管理 方式三 基于注解
 * @author Zhenyu
 */
public class AccountDaoImpl4 extends JdbcDaoSupport implements AccountDao {

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
