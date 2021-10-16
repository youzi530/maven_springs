package test1;

public class Test1 {
    public static void main(String[] args) {
        //原始方式
//        UserDao userDao = new UserDaoImpl();
//        userDao.add();
//        userDao.delete();
//        userDao.select();
//        userDao.update();

        //被代理对象
        UserDao userDao = new UserDaoImpl();
        //创建代理对象的时候，传入被代理对象
        UserDao proxy = new JDKProxy(userDao).getProxy();
        proxy.add();
        proxy.update();
        proxy.select();
        proxy.update();
    }
}
