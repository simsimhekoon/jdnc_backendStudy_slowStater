package baekjoon.beakjoon5_22;
import java.util.Scanner;
public class beakjoon2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // B + C = X  X가 60분을 넘지 않으면 A 와 B+C 출력
        // X가 60을 넘어가면 AA(시 결과값)에 ++, BB(분 결과값) = X - 60
        // 예제 2. 처럼 BB가 60의 배수이면 0으로 만들고 배수의 수 만큼 A를 증가시킨다.
        // AA가 24가 넘어가면 0으로 출력되게한다.

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int X = B + C;
        int AA; // A 결과 값
        int BB; // B 결과 값

        if (X < 60) System.out.println(A + " " + (B + C));

        if (X > 60) {
            AA = A + 1;
            BB = X - 60;
//            System.out.println(AA + " " + BB);

            for (int i = 0; i <= 1000; i++) {
                if(i % 60 == 0){
                    if (BB == i) {
                        AA++;
                        BB = 0;
                    } else if (A >= 23) {
                        AA = 0;
                    }
                }
            } System.out.println(AA + " " + BB);
        }
    }
}


