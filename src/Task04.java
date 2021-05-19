import java.util.Scanner;

public class Task04 {
public static void main(String[] args) {
        //ввести 3 числа с клавиатуры
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число x: ");
        double x = scanner.nextDouble();
        System.out.print("Введите число y: ");
        double y = scanner.nextDouble();
        System.out.print("Введите число z: ");
        double z = scanner.nextDouble();
        //среднее арифметическое трех чисел x,y,z
        double avg = (x+y+z)/3;
        System.out.println(avg);
        //деление среднего арифметического на 2 и округление в меньшую сторону
        double div = Math.floor(avg/2);
        //условие "если div>3"
        String answer = (div>3)?"Программа выполнена корректно":" ";
        System.out.println(answer);
        }
}