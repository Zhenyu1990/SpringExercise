package com.imooc.dao;

/**
 * ת�˰�����DAO��ӿ�
 * @author Zhenyu
 */
public interface AccountDao {

	/**
	 * @param out ת���˺�
	 * @param money ת�˽��
	 */
	public void outMoney(String out, Double money);
	
	/**
	 * @param in ת���˺�
	 * @param money ת�˽��
	 */
	public void inMoney(String in, Double money);
}
