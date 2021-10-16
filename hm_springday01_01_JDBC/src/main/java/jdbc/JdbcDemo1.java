package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * 分析程序的耦合
 */
public class JdbcDemo1 {

    public static void main(String[] args) throws Exception {

        //1注册驱动
        //DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Class.forName("com.mysql.jdbc.Driver");
        //2获取连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/itcasthiema","root","123456");
        //3获得操作数据库的预处理对象
        PreparedStatement pstm = connection.prepareStatement("select * from account");
        //4执行sql，得到结果集
        ResultSet resultSet = pstm.executeQuery();
        //5遍历结果集
        while (resultSet.next()){
            System.out.println(resultSet.getString("name"));
        }
        //6释放资源
        resultSet.close();
        pstm.close();
        connection.close();
    }




}


