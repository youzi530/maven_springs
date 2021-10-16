package test0_Agent;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        Company c = new ProxyHuman(person);
        c.getMoney();
    }
}
