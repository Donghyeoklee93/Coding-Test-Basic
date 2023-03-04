import java.util.Scanner;

public class BasicTest33 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String number = sc.next();

        int intHexa = Integer.parseInt(number, 16); // number를 16진수로 변환
        System.out.printf("%o", intHexa); // 16진수 값을 8진수로 표현

    }
}

