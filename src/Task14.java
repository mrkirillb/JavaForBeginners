import java.util.Arrays;
import java.util.Random;

public class Task14 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mas = new int[15];
        int max = 20;
        int min = -20;
        for (int i =0; i < mas.length; i++){
            mas[i] = (int)(Math.random() * ((max - min) + 1)) + min;
        }
        Arrays.sort(mas);
        System.out.println("Максимальный элемент " + mas[mas.length-1]);
        System.out.println("Минимальный элемент " + mas[0]);
        System.out.println("Максимальный элемент по модулю " + Math.max((Math.abs(mas[mas.length-1])),(Math.abs(mas[0]))));
    }
}