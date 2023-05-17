package JY._5_17;

import java.math.BigInteger;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        // 백준 11382번 꼬마 정민
        Scanner sc = new Scanner(System.in);

        // int : -2,147,483,648 ~ 2,147,483,647 / 메모리 크기 : 4Byte
        // long : -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 / 메모리 크기 : 8Byte
        // BigInteger : 무한대 / 메모리 크기 : 최소 70Byte

        // 방법1
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger c = sc.nextBigInteger();

        BigInteger sum = a.add(b).add(c);
        System.out.println(sum);

        //방법2
        long d = sc.nextLong();
        long e = sc.nextLong();
        long f = sc.nextLong();

        long sum2 = d+e+f;
        System.out.println(sum2);
    }
}
