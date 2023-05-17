package JY._5_17;

import java.util.Arrays;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        // 백준 2908번 상수
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

//        int max = (a > b) ? a : b;
//        int max;
//        if (a > b) {
//            max = a;
//        } else {
//            max = b;
//        }

//        String result = Integer.toString(max);
//        for (int i = result.length(); i >= 1; i--) {
//            System.out.print(result.charAt(i-1));
//        }

        String a1 = Integer.toString(a);
        String b1 = Integer.toString(b);

        String[] arr1 = a1.split("");
        String[] arr2 = b1.split("");

        String[] reverse1 = new String[a1.length()];
        String[] reverse2 = new String[b1.length()];

        for (int i = a1.length()-1, j = 0; i >= 0; i--) {
            reverse1[j] = arr1[i];
            j++;
        }
        for (int i = b1.length()-1, j = 0; i >= 0; i--) {
            reverse2[j] = arr2[i];
            j++;
        }
//        System.out.println(Arrays.toString(reverse1));
//        System.out.println(Arrays.toString(reverse2));

        int[] iarr1 = new int[reverse1.length];
        int[] iarr2 = new int[reverse2.length];
        for (int i = 0; i < reverse1.length; i++) {
            iarr1[i] = Integer.parseInt(reverse1[i]);
        }
        for (int i = 0; i < reverse2.length; i++) {
            iarr2[i] = Integer.parseInt(reverse2[i]);
        }

        int A = 0;
        int B = 0;
        for (int i = 0; i < iarr1.length; i++) {
            int ia1 = iarr1[i];
            A *= 10;
            A += ia1;
        }
        for (int i = 0; i < iarr2.length; i++) {
            int ia2 = iarr2[i];
            B *= 10;
            B += ia2;
        }
//        System.out.println(A);
//        System.out.println(B);

        if (A > B) {
            System.out.println(A);
        } else {
            System.out.println(B);
        }
    }
}
