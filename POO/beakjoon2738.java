package baekjoon;
import java.util.Scanner;
public class beakjoon2738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] plus = new int[N][M]; // 배열의 크기 선언
        for (int i = 0; i < plus.length; i++) { //세로
            for (int j = 0; j < plus[i].length; j++) { //가로
               int A = i;
               int B = j;
               System.out.print(A + B) ;
            }
            System.out.println();
        }
    }
}

