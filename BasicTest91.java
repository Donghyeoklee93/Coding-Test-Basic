import java.util.Scanner;

public class BasicTest91 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] intArray = new int[23];

        for (int i = 0; i < count; i++) {
            int number = sc.nextInt();
            intArray[number - 1] = intArray[number - 1] + 1;
        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.printf("%d ", intArray[i]);
        }
    }
}
