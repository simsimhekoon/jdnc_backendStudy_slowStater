package JY._5_17;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        // 백준 2738번 행렬 덧셈
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];
        int[][] result = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}
