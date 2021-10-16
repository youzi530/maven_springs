package test3_AOP;

//目标类
public class UserDaoImpl implements UserDao {
    public void add() {
        System.out.println("userdao 添加用户");
    }


    public String update() {
        System.out.println("userdao 更新用户");
        return "更新hello";
    }

    public void select() {
        System.out.println("userdao 查询用户");
    }

    public void delete() {
        System.out.println("userdao 删除用户");
    }
}
