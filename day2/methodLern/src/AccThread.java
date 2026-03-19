public class AccThread {
    static void main(String[] args) {
        Account acc=new Account();
        Thread t1=new Thread(acc,"fred");
        Thread t2=new Thread(acc,"John");
        Thread t3=new Thread(acc,"Mele");
        t1.start();
        t2.start();
        t3.start();
    }
}
