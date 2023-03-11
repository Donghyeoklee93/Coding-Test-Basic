import java.util.Scanner;

public class BasicTest85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int i = 1;
        int sum = 0;
        while (true) {
            sum = sum + i;
            i = i + 1;
            if (sum >= number) {
                System.out.println(sum);
                break;
            }
        }

    }
}