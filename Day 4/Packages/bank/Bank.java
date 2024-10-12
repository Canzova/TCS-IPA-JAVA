package bank;

public class Bank {
    public static void main(String[] args) {
        Accounts a1 = new Accounts();
        a1.setName("Nihal1234");
    
        String name = a1.getName();
        System.out.println(name);
    }
}
