package baekjoon.beakjoon5_22;
import java.util.Scanner;
public class beakjoon2884 {
    public static void main(String[] args) {
        // M의 입력값이 45보다 작으면 H--, M + 60 - 45(입력값)
        // 아닐시 M - 45
        // H가 0보다 작으면 23으로 표시한다.

        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        if(M < 45) {
            H--;
            M = M + 60 - 45;
        }else M = M - 45;

        if(H < 0)H = 23;

        System.out.println(H + " " + M);
    }
}



