//package baekjoon.beakjoon5_22;
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        // 1.배열 InputValue의 크기 설정
//        // 2.배열에 스캐너로 입력받기
//        // 3.InputValue의 하나하나의 값을 42로 나눈 나머지 구하기
//        // 4.나머지 끼리 비교하기
//        // 5.중복되는 것 빼기
//        // 6.개수 출력
//
//        Scanner sc = new Scanner(System.in);
//
//        int A = sc.nextInt();
//        int[] inputValue  = new int[A]; // 1 , 2
//
//        for(int i = 0; i < inputValue.length; i++) {
//            int B = (inputValue[i] % 42); // 3.
//
//           if(B == B){ // 4.
//               B.length --; // 5.
//               System.out.println(B.length); // 6.
//            }
//        }
//    }
//}
