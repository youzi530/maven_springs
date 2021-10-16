package test2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//测试二：配置事务
public class SpringTest1 {

	public static void main(String[] args) {
		//1.获取容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		//2.获取对象
		AccountService accountService = ac.getBean("accountService", AccountService.class);
		accountService.transfer("aaa", "bbb", 100d);
		System.out.println("转账完毕");
	}


}
