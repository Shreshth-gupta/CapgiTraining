import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExecuter {
    static void main(String[] args) {
        Runnable r()->System.out.println(Thread.currentThread().getName());
        ExecutorService ex= Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            Thread t=new Thread(r);
//            ex.execute();
        }
    }
}
