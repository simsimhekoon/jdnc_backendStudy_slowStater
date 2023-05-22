package JY._5_18;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        // 백준 2480번 주사위 세개
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int prize;
        int max = Math.max(a, b);
        if (a == b && b == c) {
            prize = 10000+a*1000;
        } else if (a == b ||a == c) {
            prize = 1000+a*100;
        } else if (b == c) {
            prize = 1000+b*100;
        } else {
            prize = (Math.max(max, c))*100;
        }
        System.out.println(prize);
    }
}
