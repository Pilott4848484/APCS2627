public class BankTest {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Peyton Manning", 10);
        BankAccount acc2 = new BankAccount("Jose Canseco", 21, 300.0);
        System.out.println(acc1.getAccountNum());
        System.out.println(acc1.getBalance());
        System.out.println(acc2.getAccountNum());
        System.out.println(acc2.getBalance());

        acc1.deposit(20);
        System.out.println(acc1.getBalance());
        acc1.deposit(30);
        System.out.println(acc1.getBalance());
        acc1.deposit(10);
        System.out.println(acc1.getBalance());

        acc1.withdraw(20);
        System.out.println(acc1.getBalance());
        acc1.withdraw(20);
        System.out.println(acc1.getBalance());
        acc1.withdraw(10);
        System.out.println(acc1.getBalance());

        acc2.deposit(20);
        System.out.println(acc2.getBalance());
        acc2.deposit(30);
        System.out.println(acc2.getBalance());
        acc2.deposit(10);
        System.out.println(acc2.getBalance());

        acc2.withdraw(20);
        System.out.println(acc2.getBalance());
        acc2.withdraw(20);
        System.out.println(acc2.getBalance());
        acc2.withdraw(10);
        System.out.println(acc2.getBalance());

        System.out.println(acc1.toString());
        System.out.println(acc2);
    }
}
