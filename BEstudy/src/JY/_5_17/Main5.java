package JY._5_17;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        // 백준 9086번 문자열
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        // 개행문자 처리
        sc.nextLine();

        String[] arr = new String[t];
//        for (int i = 0; i < t; i++) {
//            arr[i] = sc.nextLine();
//            // charAt() : index 값에 위치한 글자를 리턴
//            System.out.print(arr[i].charAt(0));
//            System.out.print(arr[i].charAt(arr[i].length()-1));
//        }
        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextLine();
        }
        for (int i = 0; i < t; i++) {
            // charAt() : index 값에 위치한 글자를 리턴
            System.out.print(arr[i].charAt(0));
            System.out.println(arr[i].charAt(arr[i].length()-1));
        }
    }
}
