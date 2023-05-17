package baekjoon;
import java.util.Scanner;
public class beakjoon10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = {10, 5, 1, 10, 4, 9, 2, 3, 8, 5, 7, 6};
        int N = sc.nextInt(); //10
        int X = sc.nextInt(); //5



        for (int i = 1; i <= A.length-1; i++) {
            if (A[i] < X) {
                System.out.print(A[i]);
            }

        }
    }

}

