import java.util.Scanner;

public class BasicTest74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        char word2 = word.charAt(0);
        int number = word2;
        int number2 = (int) ('a');

        while (number2 <= number) {
            System.out.printf("%c ",(char) number2);
            number2++;
        }
    }
}
