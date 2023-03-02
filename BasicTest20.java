import java.util.Scanner;

public class BasicTest20 {
    public static void main(String[] args) {

        char[] data = new char[2000];
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        for (int i = 0; i < word.length(); i++) {
            data[i] = word.charAt(i);
            System.out.print(data[i]);
        }
    }
}
