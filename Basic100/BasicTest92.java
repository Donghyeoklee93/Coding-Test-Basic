import java.util.Scanner;

public class BasicTest92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int[] intArray = new int[count];

        for (int i = 0; i < count; i++) {
            intArray[i] = sc.nextInt();

        }
        for (int i = count - 1; i >= 0; i--) {
            System.out.printf("%d ", intArray[i]);
        }

    }
}
