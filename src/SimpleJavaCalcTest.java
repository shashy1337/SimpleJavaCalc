import java.util.Scanner;

public class SimpleJavaCalcTest {
    public static void main(String[] args) {
        boolean cantStop = false;
        Scanner scan = new Scanner(System.in);
        int iterCounter = 0;

        while (!cantStop) {
            int firstOperand = Integer.parseInt(String.valueOf(scan.nextInt()));
            char operation = scan.next().charAt(0);
            int secondOperand = Integer.parseInt(String.valueOf(scan.nextInt()));

            System.out.println(iterCounter);
            switch (operation) {
                case '*' -> System.out.println(SimpleJavaCalc.multiple(firstOperand, secondOperand));
                case '/' -> System.out.println(SimpleJavaCalc.division(firstOperand, secondOperand));
                case '-' -> System.out.println(SimpleJavaCalc.subtraction(firstOperand, secondOperand));
                case '+' -> System.out.println(SimpleJavaCalc.addition(firstOperand, secondOperand));
            }

            iterCounter++;


            if (iterCounter > 6) {
                System.out.print("Хотите ли вы звкрыть калькулятор? y/n: ");
                String scanString = scan.nextLine();
                if (scanString == "Y") {
                    cantStop = false;
                }
            } else {
                continue;
            }


        }

    }
}
