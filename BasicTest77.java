import java.util.Scanner;

public class BasicTest77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            char letter = sc.nextLine().charAt(0);
            if (letter == 'q') {
                System.out.println(letter);
                break;
            }
            System.out.println(letter);
        }
    }
}