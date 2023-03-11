import java.util.Scanner;

public class BasicTest76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 1;
        int sum = 0;

        for (int i = 0; i < number; i++) {
            if (count % 2 == 0) {
                sum = sum + count;
            }
            count++;
        }
        System.out.println(sum);
    }
}