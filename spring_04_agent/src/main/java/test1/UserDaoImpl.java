package test1;

//目标类
public class UserDaoImpl implements UserDao {
    public void add() {
        System.out.println("userdao 添加用户");
    }

    public void update() {
        System.out.println("userdao 更新用户");
    }

    public void select() {
        System.out.println("userdao 查询用户");
    }

    public void delete() {
        System.out.println("userdao 删除用户");
    }
}
