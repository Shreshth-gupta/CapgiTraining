package ThreadExcer;

import java.io.*;

public class CopyDataThread extends Thread{
    FileInputStream fin;
    FileOutputStream fout;

    CopyDataThread(FileInputStream fin, FileOutputStream fout){
        this.fin=fin;
        this.fout=fout;
    }
    public void run(){
        try{
            int ch;
            int count=0;
            while ((ch=fin.read())!=-1){
                fout.write(ch);
                count++;
                if(count%10==0){
                    System.out.println("10 Char are copied");
                    Thread.sleep(5000);
                }
            }
            fin.close();
            fout.close();
            System.out.println("file copied successfully");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
