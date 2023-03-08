import java.util.Scanner;

public class BasicTest63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        if(number1 % 2 == 0){
            System.out.println(number1);
        }
        if(number2 % 2 == 0){
            System.out.println(number2);
        }
        if(number3 % 2 == 0){
            System.out.println(number3);
        }

    }
}