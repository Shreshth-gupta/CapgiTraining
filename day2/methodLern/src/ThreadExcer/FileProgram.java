package ThreadExcer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileProgram {
    static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("D:\\personal\\capgemin\\day2\\methodLern\\src\\ThreadExcer\\Source.txt");
            FileOutputStream fout = new FileOutputStream("D:\\personal\\capgemin\\day2\\methodLern\\src\\ThreadExcer\\destination.txt");
            CopyDataThread cp=new CopyDataThread(fin,fout);
            cp.start();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
