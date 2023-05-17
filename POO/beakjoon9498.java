package baekjoon;
import java.util.Scanner;
public class beakjoon9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // 자바의 신에서 이런 문제를 삼항연산자로 풀었던게 생각나서 해봣심
        // 결과 = (조건)  ?  (참의 경우 결과값)  :  (거짓의 경우 결과값)

        int point = sc.nextInt();


        System.out.println(point >= 90 ? "A" : point >= 80 ? "B" :
                point >= 70 ? "C" : point >= 60 ? "D" : "F");




    }
}
