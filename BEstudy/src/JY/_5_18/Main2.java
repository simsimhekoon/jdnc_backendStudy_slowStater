package JY._5_18;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // 백준 2525번 오븐 시계
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt();

        m = m+t;
        if (m >= 60) {
            h += m/60;
            m %= 60;
        }
        if (h >= 24) {
            h -= 24;
        }
        System.out.println(h+" "+m);
    }
}
