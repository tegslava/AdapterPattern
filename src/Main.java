import structural.*;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 15;
        System.out.printf("Аргумент a = %d\n", a);
        System.out.printf("Аргумент b = %d\n", b);

        System.out.println("Демонстрация операции умножения класса Calulator:");
        Calculator calc = new Calculator();
        System.out.println(calc
                .newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.MULT)
                .result());
        System.out.println("Демонстрация операции возведения в степень класса Calulator:");
        System.out.println(calc
                .newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result());

        Ints intsCalc = new IntsCalculator();
        System.out.println("Демонстрация операция умножения IntsCalculator:");
        System.out.println(intsCalc.mult(a, b));
        System.out.println("Демонстрация операция суммирования IntsCalculator:");
        System.out.println(intsCalc.sum(a, b));
        System.out.println("Демонстрация операции возведения в степень IntsCalculator:");
        try {
            System.out.println(intsCalc.pow(a, b));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
