import java.util.Scanner;

public class BasicTest43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number1 = sc.nextLong();
        long number2 = sc.nextLong();

        System.out.printf("%d\n%d\n%d\n%d\n%d\n%.2f", number1 + number2, number1 - number2, number1 * number2, number1 / number2,
                number1 % number2, (float)number1 / number2);
    }
}


