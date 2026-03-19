public class MyThread {
    public void run(){
        for (int i = 0; i <5 ; i++) {
            System.out.println(Thread.currentThread().getName()+" is running");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Thread Intrrupted");
            }
        }
    }

    static void main(String[] args) {
        MyThread obj=new MyThread();

    }
}
