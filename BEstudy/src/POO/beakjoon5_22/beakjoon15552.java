package baekjoon.beakjoon5_22;

import java.io.*;
import java.util.StringTokenizer;

public class beakjoon15552 {
    // 1.버퍼드리더 사용법 알아보기
        /*

        buffer: 데이터를 한곳에서 다른 한 곳으로 전송하는 동안 일시적으로 그 데이터를 보관하는 임시 메모리 영역
        BufferedReader -> Scanner 같은것, 버퍼를 이용한 입력
            readLine(); 메서드 사용
            -> 한 줄의 텍스트를 읽는다.
            -> 리턴 값이 String 이기 때문에 String 형태로 받는다.
            -> 그래서 다른 타입으로 입력 받으려면 형변환을 해야한다.
            -> 예외처리를 해야한다. (
                  예외처리: 프로그래머가 예기치못한 예외의 발생에 미리 대처하는 코드를 작성하는 것으로,
                          실행중인 프로그램의 비정상적인 종료를 막고, 상태를 정상상태로 유지하는 것이 목적이다.

                          무슨 말인지 감은 안오는데 일단 예외처리 방법은 두가지  1. try-catch  2. throws IOException
                  )

            읽은 데이터는 Line 단위로 나눠지기때문에 공백단위로 데이터를 가공하려면 따로 작업을 해주어야한다.
                1. StringTokenizer 클래스 nextToken()메서드 사용
                    -> StringTokenizer 의 역할은 String 에서 구분자를 통해서 토큰형태로 나눌 때 사용하는 클래스
                    -> nextToken()은 StringTokenizer 에서 다음 토큰을 불러오는 메서드입니다
                2. String.split()함수 -> 데이터를 공백마다 끊어서 배열에 넣음

        BufferedWriter -> System.out.println 같은것, 버퍼를 이용한 출력
            write() -> 출력할 내용을 담는다
            flush() -> 버퍼를 비워낸다
            close() -> 출력이 끝난 후 스트림을 닫는다.


         */

    // 2. 입력받은 A, B 더해서 출력하기

    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
        String input = br.readLine();

        int i = Integer.parseInt(br.readLine());


        StringTokenizer st = new StringTokenizer(input);

        int a = Integer.parseInt(st.nextToken());


        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));






    }
}
