package baekjoon;

import java.util.Scanner;

public class beakjoon11382 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

    //int, nextInt()로 받았는데 오류나서 찾아보니 A,B,C의 범위가 int를 벗어났음.



            long A;
            long B;
            long C;

            A = sc.nextLong();
            B = sc.nextLong();
            C = sc.nextLong();

            System.out.println(A + B + C);

            sc.close();

        }
    }


