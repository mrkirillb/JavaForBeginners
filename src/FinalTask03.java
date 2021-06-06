import java.util.Scanner;

public class FinalTask03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Кол-во строк: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        //Записываем кол-во совпадений для каждой строки
        int[] result = new int[n];

        //Записываем строки полностью
        String [] list = new String[n];

        //Идентификатор совпадения
        boolean flag = false;

        //Счетчик количества повторяющихся символов
        int count = 0;

        //Ищем максимальное количество неповторяющихся символов
        int max = 0;

        //Строка с максимальным количеством неповторяющихся символов
        String maxStr = null;

        for (int i = 0; i < n; i++) {
            System.out.print("Строка "+(i+1)+": ");
            String str = scanner.nextLine();
            list [i] = str;
            char[] charStr = str.toCharArray();

            for (int k = 0; k < charStr.length; k++) {
                flag = !(str.substring(k+1).contains(String.valueOf(charStr[k])));
                if (flag) {count=++count;}
            }
            result[i]=count;
            //System.out.println(result[i]);
            count=0;

            for(int m=0;m<result.length;m++){
                if(max<result[m]){
                    max=result[m];
                    maxStr=list[i];
                }
            }
        }
        System.out.print("Ответ: ");
        System.out.println(maxStr);
    }
}