public class Calculator {
    private Operation operation;
    private double leftValue, rightValue, result;

    Calculator() {}

    Calculator(Operation o, double left, double right) {
        operation = o;
        leftValue = left;
        rightValue = right;
    }

    public void Calculate(Calculator[] calculators) {
        for (Calculator calc: calculators) {
            result = execute(calc);
            PrintOut(calc, result);
        }
    }

    private double execute(Calculator c) {
        switch (c.operation){
            case ADD -> {
                result = c.leftValue + c.rightValue;
            }
            case SUBTRACT -> {
                result = c.leftValue - c.rightValue;
            }
            case MULTIPLY -> {
                result = c.leftValue * c.rightValue;
            }
            case DIVIDE -> {
                result = c.leftValue / c.rightValue;
            }
            default -> {
                System.out.println("Invalid operator");
                result = 0d;
            }
        }
        return result;
    }

    public void PrintOut(Calculator c, double res) {
        System.out.println(c.leftValue + " " + c.operation + " " + c.rightValue + " = " + res);
    }
}
