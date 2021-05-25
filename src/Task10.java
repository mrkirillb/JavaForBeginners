import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Задаем размерность матрицы
        System.out.print("Введите число строк: ");
        int x;
        x = scanner.nextInt();

        System.out.print("Введите число столбцов: ");
        int y;
        y = scanner.nextInt();

        double[][] customArray;
        customArray = new double[x][y];

        //Задаем элементы массива
        for (int i=0;i<x;i++){
            for (int j=0;j<y;j++){
                System.out.print("Введите ["+i+"]["+j+"] элемент массива: ");
                customArray[i][j] = scanner.nextDouble();
            }
        }

        //Вывод элементов первой строки матрицы умноженных на 3
        System.out.println("Первая строка матрицы (элементы x3): ");
        System.out.print("[");
        for (int k=0;k<y;k++){
            System.out.print(customArray[0][k]*3);
            if(k!=y-1){
                System.out.print(",  ");
            }
        }
        System.out.print("] ");
    }
}