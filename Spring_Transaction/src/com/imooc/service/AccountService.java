package com.imooc.service;

/**
 * 转账案例的业务层接口
 * @author Zhenyu
 */
public interface AccountService {

	/**
	 * @param 转出账号
	 * @param 转入账号
	 * @param 转账金额
	 */
	public void transfer(String out, String in, Double money);
	
}
