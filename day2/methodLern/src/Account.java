public class Account implements Runnable{
    private double accBalance=20000;
    public void Withdraw(String name,double amt) {
        synchronized (this) {
            if (amt <= accBalance) {
                System.out.println(name + "is going to Withdrow:");
                accBalance -= amt;
                System.out.println(name + " has Withdrow the money " + accBalance);
            } else {
                System.out.println(name + " has Balance of " + accBalance);
                System.out.println(name + " has not enough");
            }
        }
    }

    @Override
    public void run() {
        Withdraw(Thread.currentThread().getName(),10000);
    }
}
