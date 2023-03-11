import java.util.Scanner;

public class BasicTest62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        int smallNumber = number1 > number2 ? number2 : number1;

        System.out.printf("%d", smallNumber > number3 ? number3 : smallNumber);
    }
}