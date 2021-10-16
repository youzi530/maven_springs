package test2;

public class Test2 {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        ProductDao proxy = new CGLibProxy(productDao).getProxy();
        proxy.add();
        proxy.update();
    }
}
