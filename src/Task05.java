import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        //ввести 2 числа и символ с клавиатуры
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число x: ");
        double x = scanner.nextDouble();
        System.out.print("Введите число y: ");
        double y = scanner.nextDouble();
        System.out.print("Введите желаемое арифметическое действие: ");
        String z = scanner.next();
        //калькулятор
        switch(z){
            case "+":
                System.out.print(x+y);
                break;
            case "-":
                System.out.print(x-y);
                break;
            case "*":
                System.out.print(x*y);
                break;
            case "/":
                System.out.print(x/y);
                break;
            default:
                System.out.print("Запрос невозможен, введите одну из доступных операций: +, -, *, /");
                break;
        }
    }
}