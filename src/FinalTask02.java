import java.util.Scanner;

public class FinalTask02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ввод: ");
        String line = scanner.nextLine();

        char[] equation = line.toCharArray();
        int x = line.indexOf('x');

        int result=0;
        int a = Character.getNumericValue(equation[0]);
        int b = Character.getNumericValue(equation[2]);
        int c = Character.getNumericValue(equation[4]);

        if (equation.length<6){

            if (equation[1]=='+'){
                switch (x) {
                    case (0):
                        result = c-b;
                        break;
                    case (2):
                        result = c-a;
                        break;
                    case (4):
                        result = a+b;
                        break;
                }
                System.out.println("Вывод: "+result);
            }
            else if (equation[1]=='-') {
                switch (x) {
                    case (0):
                        result = c+b;
                        break;
                    case (2):
                        result = a-c;
                        break;
                    case (4):
                        result = a-b;
                        break;
                }
                System.out.println("Вывод: "+result);
            }
            else {
                System.out.println("Введенный математический знак некорректен");
            }
        }
        else {
            System.out.println("Количество символов в уравнении не должно превышать 5");
        }
    }
}