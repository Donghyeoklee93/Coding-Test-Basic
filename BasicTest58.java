import java.util.Scanner;

public class BasicTest58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        System.out.printf("%d", number1 & number2);
    }
}