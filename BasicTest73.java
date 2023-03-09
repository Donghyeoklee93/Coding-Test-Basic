import java.util.Scanner;

public class BasicTest73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        while (number != 0) {
            number = number - 1;
            System.out.println(number);
        }
    }
}
