import java.util.Scanner;

public class BasicTest86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int i = 1;
        while (i <= number) {
            if (i % 3 == 0) {
                i = i + 1;
                continue;
            }
            System.out.printf("%d ", i);
            i = i + 1;
        }
    }
}