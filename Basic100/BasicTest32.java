import java.util.Scanner;

public class BasicTest32 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String number = sc.next();

        int intOctal = Integer.parseInt(number, 8); // number를 8진수로 변환
        System.out.println(intOctal); // 8진수 값을 10진수로 표현

//        System.out.printf("%d",intOctal);
    }
}

