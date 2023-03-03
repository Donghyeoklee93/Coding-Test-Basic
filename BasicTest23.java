import java.util.Scanner;

public class BasicTest23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();

        int zero = number.length();
        for(int i = 0 ; i< number.length(); i++) {
            System.out.print("[");
            System.out.print(number.charAt(i));

            for (int j = 0; j<zero-1; j++){
                System.out.print("0");
            }
            zero = zero - 1;

            System.out.println("]");
        }
    }
}