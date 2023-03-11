import java.util.Scanner;

public class BasicTest96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] intArray = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                intArray[i][j] = sc.nextInt();
            }
        }

        int x = 1;
        int y = 1;
        while (intArray[x][y] == 0) {
            intArray[x][y] = 9;
            if (intArray[x][y + 1] != 1) {
                y++;
            } else if (intArray[x + 1][y] != 1) {
                x++;
            }
        }

        intArray[x][y] = 9;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%d ", intArray[i][j]);
            }
            System.out.println();
        }

    }
}
