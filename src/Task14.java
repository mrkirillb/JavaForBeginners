import java.util.Random;

public class Task14 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] someArray = new int[15];

        //Выводим все элементы массива
        for (int i = 0; i < someArray.length; i++) {
            int result = 20 - random.nextInt(40);
            someArray[i] = result;
            System.out.print(result+"; ");
        }
        System.out.println();

        //Выводим максимальный и минимальный элемент
        int max = someArray[0];
        int min = someArray[0];
        for (int k=0;k<someArray.length;k++){
            max = Math.max(max,someArray[k]);
            min = Math.min(min,someArray[k]);
        }
        System.out.print("Максимальный элемент массива: ");
        System.out.println(max);
        System.out.print("Минимальный элемент массива: ");
        System.out.println(min);
        System.out.print("Наибольший элемент по модулю: ");
        System.out.println(Math.max(Math.abs(max),Math.abs(min)));
    }
}