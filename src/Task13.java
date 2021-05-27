import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        System.out.print("Введите фразу: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        boolean flag = false;
        int counter = 0;

        String[] sepWords = str.split(" ");
        System.out.println("Слова написанные на латинице: ");
        for (int i = 0; i < sepWords.length; i++) {
            char[] charArray = sepWords[i].toLowerCase().toCharArray();
            for(int j=0;j<charArray.length;j++) {
                flag = ((int) charArray[j] >= 97 & (int) charArray[j] <= 122);
                if (!flag) {break;}
            }
            if (flag == true) {
                System.out.println(sepWords[i]+" ");
                counter = ++counter;
            }
        }
        System.out.println();
        System.out.println("Количество латинских слов: ");
        System.out.println(counter);
    }
}
