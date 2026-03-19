public class threadSafetyDemo implements Runnable {
    public static synchronized void printMessage(String name) {
        for (int i = 0; i < 10; i++) {
            System.out.println(name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        printMessage(Thread.currentThread().getName());
    }

    static void main(String[] args) {
        threadSafetyDemo obj1 = new threadSafetyDemo();
        threadSafetyDemo obj2 = new threadSafetyDemo();
        threadSafetyDemo obj3 = new threadSafetyDemo();
        Thread t1 = new Thread(obj1,"A");
        Thread t2 = new Thread(obj2,"B");
        Thread t3 = new Thread(obj3,"C");
        t1.start();
        t2.start();
        t3.start();
    }
}
