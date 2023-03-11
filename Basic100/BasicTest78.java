import java.util.Scanner;

public class BasicTest78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 1;
        int number2 = 0;
        int sum = 1;

        int count = sc.nextInt();

        while(sum < count){
            number2 = number + 1;
            sum = sum + number2;
            number = number + 1;
        }
        System.out.println(number2);

    }
}