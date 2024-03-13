public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        try {
            int a = calc.plus.apply(1, 2);
            int b = calc.minus.apply(1, 1); //в переменной будет число 0
            int c = calc.devide.apply(a, b); //на ноль делить нельзя

            calc.println.accept(c);
        } catch (ArithmeticException ae) {
            System.out.println("devide by zero, try again");
        }

        //в способе выше я просто поймал исключение
        //можно проверять знаменатель на положительное число перед каждой операцией деления

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        if (calc.isPositive.test(b)) {
            int c = calc.devide.apply(a, b);
        } else {
            System.out.println("b is no positive, try again");
        }
    }
}
