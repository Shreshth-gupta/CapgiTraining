public  class main {
    public static void main(String[] args) {
        ICalculate cal=new Sum()::Add;
//        method reference only work with functional interface
        int result=cal.Calculate(10,20);
        System.out.println(result);
    }
}