import java.util.Scanner;

public class BasicTest25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time[] = sc.next().split("\\.");
        int year = Integer.parseInt(time[0]);
        int month = Integer.parseInt(time[1]);
        int day = Integer.parseInt(time[2]);

        System.out.printf("%02d-%02d-%04d", day, month, year);
    }
}
