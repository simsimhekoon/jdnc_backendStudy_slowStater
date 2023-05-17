package JY._5_17;

import java.util.Arrays;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        // 백준 2908번 상수
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

//        int max = (a > b) ? a : b;
//        int max;
//        if (a > b) {
//            max = a;
//        } else {
//            max = b;
//        }

//        String result = Integer.toString(max);
//        for (int i = result.length(); i >= 1; i--) {
//            System.out.print(result.charAt(i-1));
//        }

        String a1 = Integer.toString(a);
        String b1 = Integer.toString(b);
        char[] result1 = new char[a1.length()];
        char[] result2 = new char[b1.length()];

        for (int i = a1.length(); i >= 1; i--) {
            result1[i] = a1.charAt(i-1);
        }
        for (int i = b1.length(); i >= 1; i--) {
            result2[i] = b1.charAt(i-1);
        }


    }
}
