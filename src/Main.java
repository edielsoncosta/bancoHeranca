public class Main {
    public static void main(String[] a) {

        Acoount acc = new Acoount(1001, "edielson", 1000.0);
        acc.withdraw(200.0);
        System.out.println(acc.getBalance());

        Acoount acc1 = new SavingsAccount(1002, "maria", 1000.0, 0.01);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        Acoount acc2 = new BusinessAccount(1003, "edi", 1000.0, 500.0);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());
    }
}
