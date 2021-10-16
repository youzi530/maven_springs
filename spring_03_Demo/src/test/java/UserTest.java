import com.hc.controller.UserController;
import com.hc.controller.UserController1;
import com.hc.controller.UserController2;
import com.hc.controller.UserController3;
import com.hc.springConfig.SpringConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    @Test
    public void springTest(){

        //这里测试的是：当前的test去调用contorller里面的UserController的loginController方法，
        //在UserController里面需要加上@Component("user")注解，使UserController加入到bean工厂里面，然后传一个参数user.
        //
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        //UserController userController = (UserController) applicationContext.getBean("user");
        //userController.loginController();

        //这里测试的是：当前的test去调用contorller里面的UserController1的loginController1方法，
        //
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        //UserController1 userController1 = (UserController1) applicationContext.getBean("userController1");
        //userController1.loginController();


        //纯注解来实现：指定当前类是一个spring配置类，当创建容器时会从该类上加载注解
        //去掉bean.xml,然后新建一个SpringConfig类去扫描@ComponentScan("com.hc")
        //通过反射的形式生成容器管理的话，可省了@Configuration
        //ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        //UserController1 userController1 = (UserController1) applicationContext.getBean("userController1");
        //userController1.loginController();

        //测试：@Resource(name = "myconn")   Connection connection;
        //ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        //UserController2 userController2 = (UserController2) applicationContext.getBean("userController2");
        //userController2.loginController();

        //配置文件和注解混合使用
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springConfig.xml");
        UserController3 userController3 = (UserController3) applicationContext.getBean("userController3");
        userController3.loginController();
    }
}
