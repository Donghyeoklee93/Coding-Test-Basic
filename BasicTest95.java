import java.util.Scanner;

public class BasicTest95 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] intArray = new int[19][19];

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                intArray[i][j] = sc.nextInt();
            }
        }

        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int j = 0; j < 19; j++) {
                if (intArray[x - 1][j] == 1) {
                    intArray[x - 1][j] = 0;
                } else {
                    intArray[x - 1][j] = 1;
                }

                if (intArray[j][y - 1] == 0) {
                    intArray[j][y - 1] = 1;
                } else {
                    intArray[j][y - 1] = 0;
                }
            }
        }

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.printf("%d ", intArray[i][j]);
            }
            System.out.println();
        }


    }
}
