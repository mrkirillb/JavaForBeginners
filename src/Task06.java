import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        //Выбираем конвертацию
        Scanner scanner = new Scanner(System.in);
        System.out.println("Варианты конвертации: 1 - Расстояние, 2 - Масса");
        int x = scanner.nextInt();
        //Количество единиц конвертации
        double z;
        switch (x){
            case 1:
                System.out.println("Выберите единицу измерения: 1 - Метр, 2 - Миля, 3 - Ярд, 4 - Фут");
                int distance = scanner.nextInt();
                System.out.println("Введите число: ");
                z = scanner.nextDouble();
                switch (distance){
                    case 1:
                        System.out.println("Метры - " + z);
                        System.out.println("Мили - " + z*0.0006);
                        System.out.println("Ярды - " + z*1.094);
                        System.out.println("Фут - " + z*3.281);
                        break;
                    case 2:
                        System.out.println("Метры - " + z/0.0006);
                        System.out.println("Мили - " + z);
                        System.out.println("Ярды - " + z*1760);
                        System.out.println("Фут - " + z*5280);
                        break;
                    case 3:
                        System.out.println("Метры - " + z/1.094);
                        System.out.println("Мили - " + z/1760);
                        System.out.println("Ярды - " + z);
                        System.out.println("Фут - " + z*3);
                        break;
                    case 4:
                        System.out.println("Метры - " + z/3.281);
                        System.out.println("Мили - " + z/5280);
                        System.out.println("Ярды - " + z/3);
                        System.out.println("Фут - " + z);
                        break;
                }
                break;
            case 2:
                System.out.println("Выберите единицу измерения: 1 - Килограмм, 2 - Фунт");
                int weight = scanner.nextInt();
                System.out.println("Введите число: ");
                z = scanner.nextDouble();
                switch (weight) {
                    case 1:
                        System.out.println("Килограммы - " + z);
                        System.out.println("Фунты - " + z*2.205);
                        break;
                    case 2:
                        System.out.println("Килограммы - " + z/2.205);
                        System.out.println("Фунты - " + z);
                        break;
                }
                break;
            default:
                System.out.println("Выберите одно из предложенных значений");
                break;
        }
    }
}