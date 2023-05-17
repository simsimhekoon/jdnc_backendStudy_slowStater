package baekjoon;
import java.util.Scanner;

public class beakjoon9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //String st = sc.nextLine();
        //st에 입력값을 넣었을때 첫글자와 마지막 문자가 출력되는 걸로 보아 스캐너가 문제인듯 하다.. 아닌감,,?

        String st = "ACDKJFOWIEGHE";

        System.out.println(st.charAt(0));
        System.out.println(st.charAt(st.length()-1));
    }
}
