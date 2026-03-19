package ThreadExcer;

public class TimerRunner implements Runnable{
    int second=0;
    @Override

    public void run() {
        while(true){
            try{
                int sec=0;
                int min=0;
                int hour=0;
                while(true){
                    Thread.sleep(10000);
                    sec+=10;
                    min+=sec/60;
                    hour+=min/60;
                    min=min%60;
                    hour=hour%60;
                    System.out.println("Timer"+ hour+":"+min+":"+sec);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        TimerRunner obj = new TimerRunner();
        Thread t = new Thread(obj);
        t.start();
    }
}
