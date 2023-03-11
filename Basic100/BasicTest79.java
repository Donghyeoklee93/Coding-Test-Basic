import java.util.Scanner;

public class BasicTest79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        for(int i=1; i<=number1; i++){
            for(int j=1; j<=number2; j++){
                System.out.printf("%d %d\n", i, j);
            }
        }
    }
}