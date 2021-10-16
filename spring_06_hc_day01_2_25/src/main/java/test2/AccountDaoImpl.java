package test2;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
	/**
	 * 转出的方法
	 * @param from	:转出的人
	 * @param money	:要转账金额
	 */
	public void out(String from, Double money) {
		String sql = "update account set money = money - ? where name  = ?";//转出，money会减少
		this.getJdbcTemplate().update(sql, money,from);
	}
	/**
	 * 转入的方法
	 * @param to	:转入的人
	 * @param money	:要转账金额
	 */
	public void in(String to, Double money) {
		String sql = "update account set money = money + ? where name  = ?";//转入，money会增加
		this.getJdbcTemplate().update(sql, money , to);
	}

}
