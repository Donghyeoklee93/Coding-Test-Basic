import java.util.Scanner;

public class BasicTest64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numberArray = new int[3];
        numberArray[0] = sc.nextInt();
        numberArray[1] = sc.nextInt();
        numberArray[2] = sc.nextInt();
        String result = "";

        for (int i = 0; i <= 2; i++) {
            if (numberArray[i] % 2 == 0) {
                result = "even";
                System.out.println(result);
            } else {
                result = "odd";
                System.out.println(result);
            }
        }
    }
}