import java.util.Scanner;

public class BasicTest71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int number = sc.nextInt();
            if (number != 0) {
                System.out.println(number);
            } else{
                break;
            }
        }
    }
}