import java.util.Scanner;

public class BasicTest93 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int[] intArray = new int[count];

        for (int i = 0; i < count; i++) {
            intArray[i] = sc.nextInt();
        }

        int small = intArray[0];
        for (int i = 1; i < count; i++) {
            if (small > intArray[i]) {
                small = intArray[i];
            }
        }
        System.out.println(small);

    }
}
