package JY._5_17;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        // 백준 10871번 X보다 작은 수
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < x) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
