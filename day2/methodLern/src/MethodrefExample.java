import java.util.ArrayList;
import java.util.List;

public class MethodrefExample {
    static void main(String[] args) {
        List<String> li=new ArrayList<>();
        li.add("Amit");
        li.add("Shreshtha");
        li.add("Samar");
        li.add("Shristy");
//        li.forEach(s->System.out.println(s));
        li.forEach(new Sum()::display);
    }
}
