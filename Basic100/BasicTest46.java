import java.util.Scanner;

public class BasicTest46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        if (number2 == 0) {
            System.out.printf("%d", number1);
        } else {
//        System.out.printf("%d", number1);
//        System.out.printf("\n%d", (2 << 0)); //2 * 1
//        System.out.printf("\n%d", (2 << 1)); //2 * 2
//        System.out.printf("\n%d", (2 << 2)); //2 * 2 * 2
            System.out.printf("%d", number1 * (2 << number2 - 1));
        }
    }
}


