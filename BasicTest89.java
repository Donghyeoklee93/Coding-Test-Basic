import java.util.Scanner;

public class BasicTest89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        int number4 = sc.nextInt();

        for (int i = 1; i < number4; i++) {
            number1 = number1 * number2 + number3;
        }
        System.out.println(number1);
    }
}