package JY._5_18;

import java.io.*;

public class Main5 {
    public static void main(String[] args) throws IOException {
        // 백준 10813번 공 바꾸기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine(); // 첫번째 줄 입력받음
        String[] arr = s.split(" "); // 첫번째 줄을 공백 기준으로 배열에 입력
        int n = Integer.parseInt(arr[0]); // 첫번째 줄 첫번쩨 숫자 바구니 갯수 입력
        int m = Integer.parseInt(arr[1]); // 첫번째 줄 두번째 숫자 교환 횟수 입력

        int[] basket = new int[n]; // n개의 바구니 생성
        for (int i = 0; i < n; i++) {
            basket[i] = i + 1;
        }
        for (int i = 0; i < m; i++) {
            String s2 = br.readLine();
            String[] arr2 = s2.split(" ");
//            String[] arr2 = br.readLine().split(" ");
            int x = Integer.parseInt(arr2[0]);
            int y = Integer.parseInt(arr2[1]);

            int trade = basket[x-1];
            basket[x-1] = basket[y-1];
            basket[y-1] = trade;
        }
        for (int i = 0; i < n; i++) {
            bw.write(String.valueOf(basket[i] + " "));
        }
        bw.flush();
        bw.close();
    }
}
