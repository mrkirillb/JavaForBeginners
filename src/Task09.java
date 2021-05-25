import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Задаем длину массива
        System.out.print("Введите кол-во элементов массива: ");
        int length = scanner.nextInt();
        double[] myArray = new double[length];

        //Задаем элементы массива
        for (int i=0;i<length;i++){
            System.out.print("Введите "+ i +"-й элемент массива: ");
            myArray[i] = scanner.nextDouble();
        }

        //Вычисляем среднее арифметическое для элементов массива
        double sum = 0;

        for (int j=0;j<length;j++){
            sum=sum+myArray[j];
        }
        double avg=sum/length;

        //Вывод элементов массива, умноженных на среднее арифметическое
        System.out.println("Элементы массива: ");
        for (int k=0;k<length;k++) {
            System.out.println(myArray[k] * avg);
        }
    }
}