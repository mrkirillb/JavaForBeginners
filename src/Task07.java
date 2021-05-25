import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Задаем длину массива
        System.out.print("Введите кол-во элементов массива: ");
        int length = scanner.nextInt();
        String[] myArray = new String[length];

        //Задаем три значения константы x,y,z
        String[] constArray = new String[]{"3","4","5"};

        //Пользователь задает элементы массивов
        for (int i=0;i<length;i++){
            System.out.print("Введите "+ i +"-й элемент массива: ");
            myArray[i] = scanner.next();
        }

        //Флаг для вывода из цикла при первом совпадении значений массивов
        boolean flag = false;

        for (int j=0;j<constArray.length;j++) {
            for(int k=0;k<myArray.length;k++){
                if (constArray[j].equals(myArray[k])) {
                    flag=true;
                }
            }
            if (flag) {
                System.out.println("Данное значение имеется в константах");
                break;
            }
        }
    }
}