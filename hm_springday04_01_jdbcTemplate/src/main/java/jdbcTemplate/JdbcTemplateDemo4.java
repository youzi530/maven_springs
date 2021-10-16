package jdbcTemplate;

import dao.IAccountDao;
import domain.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * JdbcTemplate的最基本用法---- 版本二：使用bean.xml和本类
 */
public class JdbcTemplateDemo4 {

    public static void main(String[] args) {

        //1、获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2、获取对象
        IAccountDao accountDao = ac.getBean("accountDao", IAccountDao.class);
        //3、执行操作
        Account accountById = accountDao.findAccountById(1);
        System.out.println(accountById);


    }
}
