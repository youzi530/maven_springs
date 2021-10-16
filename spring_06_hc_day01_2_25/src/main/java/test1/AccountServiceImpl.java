package test1;


public class AccountServiceImpl implements AccountService {
	private AccountDao accountDao;
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}


	/**
	 * 转账的方法
	 * @param from:从哪转出
	 * @param to:转入的人
	 * @param money:转账金额
	 */
	//转账的事务
	public void transfer(final String from, final String to, final Double money) {
		accountDao.out(from, money);//转出
//		int i=10/0;
		accountDao.in(to, money);//转入
	}
}
