package excer;

public class Q3 {
    static void main(String[] args) {
        factorial fact = new factorials()::facter;
        int result = fact.fact(2);
        System.out.println(result);
    }
}
