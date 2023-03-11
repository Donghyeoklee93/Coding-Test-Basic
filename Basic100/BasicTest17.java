import java.util.Scanner;

public class BasicTest17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String time[] = sc.next().split("\\.");
        int year = Integer.parseInt(time[0]);
        int month = Integer.parseInt(time[1]);
        int day = Integer.parseInt(time[2]);

        System.out.printf("%04d.%02d.%02d", year, month, day);

        System.out.println();
        System.out.printf("%04d.%02d.%02d", Integer.parseInt(time[0]), Integer.parseInt(time[1]), Integer.parseInt(time[2]));

        System.out.println();
        System.out.println(String.format("%04d", year) + '.' + String.format("%02d", month) + '.' + String.format("%02d", day));
    }
}
