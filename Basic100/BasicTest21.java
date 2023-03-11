import java.util.Scanner;

public class BasicTest21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number[] = sc.next().split("\\.");
        int number2 = Integer.parseInt(number[0]);
        int number3 = Integer.parseInt(number[1]);

        System.out.printf("%d\n%d", number2, number3);
    }
}