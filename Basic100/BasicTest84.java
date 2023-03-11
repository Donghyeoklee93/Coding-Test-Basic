import java.util.Scanner;

public class BasicTest84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number1 = sc.nextInt();
        double number2 = sc.nextInt();
        double number3 = sc.nextInt();

        double result = (number1 * number2 * number3) / 8 / 1024 / 1024;

        System.out.printf("%.2f %S", result,"MB");
    }
}