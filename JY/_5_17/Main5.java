package JY._5_17;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        // 백준 9086번 문자열
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        String[] arr = new String[t];
        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextLine();
            // charAt() : index 값에 위치한 글자를 리턴
            System.out.print(arr[i].charAt(0));
            if (arr[i].length() == 1) {
                System.out.print(arr[i].charAt(0));
            } else {
                System.out.print(arr[i].charAt(arr[i].length()-1));
            }
        }
    }
}
