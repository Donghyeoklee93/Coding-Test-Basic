import java.io.*;
import java.util.Scanner;

public class BasicTest82 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = bf.readLine().split(" ");

        int count = 0;
        for (int i = 0; i < Integer.valueOf(s[0]); i++) {
            for (int j = 0; j < Integer.valueOf(s[1]); j++) {
                for (int k = 0; k < Integer.valueOf(s[2]); k++) {
                    bw.write(i + " " + j + " " + k + " "+ "\n");
                    count++;
                }
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
    }
}