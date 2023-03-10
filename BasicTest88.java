import java.util.Scanner;

public class BasicTest88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        for (int i = 1; i < number3; i++) {
            number1 = number1 * number2;
        }
        System.out.println(number1);
    }
}