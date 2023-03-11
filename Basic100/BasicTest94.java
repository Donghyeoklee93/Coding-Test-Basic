import java.util.Scanner;

public class BasicTest94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int[][] intArray = new int[19][19];

        for (int i = 0; i < count; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            intArray[x-1][y-1] = 1;
        }

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.printf("%d ", intArray[i][j]);
            }
            System.out.println();
        }
    }
}
