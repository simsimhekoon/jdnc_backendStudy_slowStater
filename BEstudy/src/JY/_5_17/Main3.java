package JY._5_17;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        // 백준 2439번 별찍기-2
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            int x = a-i;
            // .repeat : 문자열을 지정 횟수만큼 반하여 출력
            System.out.println(" ".repeat(x) + "*".repeat(i));

        }
    }
}
