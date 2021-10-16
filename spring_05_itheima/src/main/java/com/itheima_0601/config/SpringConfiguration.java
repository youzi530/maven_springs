package com.itheima_0601.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import javafx.scene.chart.PieChart;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * 该类是一个配置类，他的作用和bean.xml一样的
 *
 * 一、@Configuration
 *     作用：指定当前类是一个配置类
 *     细节：当配置类作为AnnotationConfigApplicationContext对象创建的参数时，该注解可以不写。
 *
 * 二、@ComponentScan
 *     作用：用于通过注解指定spring在创建容器时要扫描的包
 *     属性：
 *          value:它和basePackages的作用是一样的，都是用于指定创建容器时要扫描的包
 *              我们使用此注解就等同于xml中配置了
 *                      <context:component-scan base-package="com.itheima_0504"></context:component-scan>
 *
 * 三、@Bean
 *     作用：用于把当前的方法的返回值作为bean对象存入spring的ioc容器中
 *     属性：
 *          name：用于指定bean的id，默认值是当不写value时，是当前方法的名称
 *     细节：
 *          当我们使用注解配置方法时，如果方法有参数，spring框架会去容器中查找有没有可用的bean对象
 *          查找的方法和Autowired注解的作用是一样的
 *
 * 四、@import
 *     作用：用于导入其他的配置类
 *     属性：
 *          value:用于指定其他配置类的字节码
 *                当我们使用Import的注解后，有Import注解的类就是父配置类，而导入的都是子配置类
 * 五、@PropertySource
 *     作用：用于指定properties文件的位置
 *     属性：
 *          value：指定文件的名称和路径
 *                 关键字：classpath，表示类路径下
 *
 */

@Configuration
@ComponentScan(basePackages = "com.itheima_0601")
@Import(JdbcConfig.class)
@PropertySource("classpath:jdbc_0601.properties")
public class SpringConfiguration {

//    /**
//     * 用于创建一个QueryRunner对象
//     * @param dataSource
//     * @return
//     */
//    @Bean(name = "runner")
//    @Scope("prototype")
//    public QueryRunner createQueryRunner(DataSource dataSource){
//        return new QueryRunner(dataSource);
//    }
//
//    /**
//     * 创建数据源对象
//     * @return
//     */
//    @Bean(name = "dataSource")
//    public DataSource createDataSource(){
//        ComboPooledDataSource ds = new ComboPooledDataSource();
//        try {
//            ds.setDriverClass("com.mysql.jdbc.Driver");
//            ds.setJdbcUrl("jdbc:mysql://localhost:3306/test");
//            ds.setUser("root");
//            ds.setPassword("123456");
//            return ds;
//        }catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }

}
