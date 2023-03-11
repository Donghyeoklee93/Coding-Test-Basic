import java.util.Scanner;

public class BasicTest16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String time[] = sc.next().split(":"); // 리스트 time을 생성해서 입력값을 추가해주는 과정
        System.out.println(time[0] + ":" + time[1]);
    }
}

//
//        Scanner sc = new Scanner(System.in);
//
//        String time = sc.nextLine();
//
//        char hour = time.charAt(0);
//        char colon = time.charAt(1);
//        char min = time.charAt(2);
//
//        System.out.print(hour);
//        System.out.print(colon);
//        System.out.print(min);


//        System.out.println(hour);  // 1
//        System.out.println(colon); // :
//        System.out.println(min);   // 2
//
//        System.out.println((int)hour);  // 49
//        System.out.println((int)colon); // 58
//        System.out.println((int)min);   // 50
//
//        System.out.println(hour + colon + min); // 49 + 58 + 50 = 157
//
//        System.out.println((int)('a')); //97
//        System.out.println((int)('b')); //98
//        System.out.println((int)(':')); //58
//        System.out.println('a' + 'b'); //97 + 98 = 195
//        System.out.println(('a' + 'b')); //97 + 98 = 195
//
//    }
//}

