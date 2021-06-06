import java.util.Scanner;

public class FinalTask01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Курс доллара: ");
        double rate = scanner.nextDouble();
        System.out.print("Количество рублей: ");
        double roubles = scanner.nextDouble();
        System.out.print("Итого: ");
        double dollars = roubles/rate;
        System.out.printf("%.2f",dollars);
        System.out.println(" долларов");
    }
}