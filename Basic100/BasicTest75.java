import java.util.Scanner;

public class BasicTest75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;

        for(int i=0; i <= number; i++){
            System.out.println(count);
            count++;
        }

    }
}