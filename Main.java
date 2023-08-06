public class Main {
    public static void main(String[] args){
        Calculator[] calcEngine = new Calculator[3];
        calcEngine[0] = new Calculator(Operation.ADD, 43.2d, 554.432d);
        calcEngine[1] = new Calculator(Operation.MULTIPLY, 13.2d, 5.432d);
        calcEngine[2] = new Calculator(Operation.DIVIDE, 55502.2d, 62.54d);

        Calculator calculator = new Calculator();
        calculator.Calculate(calcEngine);
    }
}
