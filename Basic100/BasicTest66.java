import java.util.Scanner;

public class BasicTest66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number >= 90) {
            System.out.println("A");
        } else if (number >= 70) {
            System.out.println("B");
        } else if (number >= 40) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}
