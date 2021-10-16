package test2;


import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class AccountServiceImpl implements AccountService {

	//事务模板对象
	private TransactionTemplate transactionTemplate;
	//set注入一下
	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

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

		//如果用事务模板对象，通过代码方式来操作。对代码的侵入性太强
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus status) {//事务状态接口
				accountDao.out(from, money);//转出
				int i=10/0;//转账业务出现异常
				accountDao.in(to, money);//转入
			}
		});

	}
}
