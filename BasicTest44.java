import java.util.Scanner;

public class BasicTest44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number1 = sc.nextLong();
        long number2 = sc.nextLong();
        long number3 = sc.nextLong();

        System.out.printf("%d\n%.1f", number1 + number2 + number3, (float)(number1 + number2 + number3)/3);
    }
}


