package test0_Agent;

public class ProxyHuman implements Company {
    Company company;

    public ProxyHuman(Company company) {
        this.company = company;
    }

    public void start() {
        System.out.println("准备家伙");
    }

    public void getMoney() {
        start();
        company.getMoney();//目标类方法
    }
}
