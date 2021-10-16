import com.hc.controller.UserController;
import com.hc.springConfig.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)  //注解替换原有运行器  //即使用Junit提供的一个注解把原有的main方法替换了，替换成spring提供的
@ContextConfiguration(classes = SpringConfig.class)
//使用@ContextConfiguration告知spring的运行器，spring的ioc创建是基于xml还是注解的，并且说明位置
public class UserTest {

    @Autowired
    UserController userController;

    @Test
    public void springTest(){
        userController.loginController();
    }
}
