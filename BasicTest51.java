import java.util.Scanner;

public class BasicTest51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}