import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Вводим числа с клавиатуры
        System.out.print("Введите число: ");
        String x = scanner.nextLine();
        System.out.print("Введите число: ");
        int y = scanner.nextInt();

        //Приводим числа к одному типу
        double x1 = Double.parseDouble(x);

        //Выводим в консоль большее число
        System.out.print("Максимальное число: ");
        System.out.println(Math.max(x1,y));

        //Выводим в консоль меньшее число
        System.out.print("Минимальное число: ");
        System.out.println(Math.min(x1,y));
    }
}