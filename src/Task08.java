import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое положительное число: ");
        int custom = scanner.nextInt();

        int sum=0;
        int [] myArray = new int[custom+1];
        int i=0;

        do {
            myArray[i]=i;
            if(!(myArray[i] % 2 == 0)){
                sum=sum+i;
            }
            ++i;
        }
        while (i<=custom);
        System.out.println("Сумма нечетных чисел до "+custom+" = "+sum);
    }
}