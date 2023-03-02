import java.util.Scanner;

public class BasicTest18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String IDNumber[] = sc.next().split("-");

        System.out.println(IDNumber[0]+IDNumber[1]);
    }
}
