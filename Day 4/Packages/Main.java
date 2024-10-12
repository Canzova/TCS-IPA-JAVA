import bank.Accounts;

public class Main {
    public static void main(String[] args) {
        Accounts a1 = new Accounts();
        a1.setName("Nihal3210");
        String name = a1.getName();
        System.out.println(name);


        SubClass.greet();
    }

    
}
