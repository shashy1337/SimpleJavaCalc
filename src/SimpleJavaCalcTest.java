import java.util.Scanner;

public class SimpleJavaCalcTest {
    public static void main(String[] args) {
        boolean cantStop = false;
        Scanner scan = new Scanner(System.in);
        while (!cantStop){
            int firstOperand = Integer.parseInt(String.valueOf(scan.nextInt()));
            char operation = scan.next().charAt(0);
            int secondOperand = Integer.parseInt(String.valueOf(scan.nextInt()));
            int iterCounter = 0;

            switch (operation){
                case '*':
                    System.out.println(SimpleJavaCalc.multiple(firstOperand, secondOperand));
                    iterCounter += 1;
                    break;
                case '/':
                    System.out.println(SimpleJavaCalc.division(firstOperand, secondOperand));
                    iterCounter += 1;
                    break;
                case '-':
                    System.out.println(SimpleJavaCalc.subtraction(firstOperand, secondOperand));
                    iterCounter += 1;
                    break;
                case '+':
                    System.out.println(SimpleJavaCalc.addition(firstOperand, secondOperand));
                    iterCounter += 1;
                    break;
            }

            if (iterCounter > 6){
                System.out.println("Хотите ли вы звкрыть калькулятор? y/n: ");
                String scanString = scan.nextLine();
                if (scanString == "Y"){
                    cantStop = false;
                }
            } else {
                continue;
            }


        }

    }
}
