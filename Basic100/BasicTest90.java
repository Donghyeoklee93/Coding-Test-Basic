import java.util.Scanner;

public class BasicTest90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        int day = 1;
        while (true) {
            if (day % number1 == 0 && day % number2 == 0 && day % number3 == 0) {
                System.out.println(day);
                break;
            }
            day++;
        }
    }
}
