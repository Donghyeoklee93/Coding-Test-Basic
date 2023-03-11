import java.util.Scanner;

public class BasicTest39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 문자를 아스키코드 내 숫자로 변환
        char word = sc.next().charAt(0);

        // 해당 숫자 내에서 플러스 1 후 문자로 변환
        int number = (int) word + 1;

        char newWord = (char)number;

        // 다시 해당 숫자를 문자로 변환 후 출력
        System.out.println(newWord);

    }
}


