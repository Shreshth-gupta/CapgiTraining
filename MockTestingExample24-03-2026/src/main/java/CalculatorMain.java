import com.cg.CalculatorService;
import com.cg.ICalculate;

public class CalculatorMain {
    static void main(String[] args) {
        ICalculate c=(i,j)->i+j;
        CalculatorService cService= new CalculatorService(c);
        System.out.println(cService.addService(10,5));
    }
}
