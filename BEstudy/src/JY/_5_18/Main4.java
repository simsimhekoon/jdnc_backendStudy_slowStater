package JY._5_18;

import java.io.*;

public class Main4 {
    public static void main(String[] args) throws IOException {
        // 백준 15552번 빠른 A+B
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String s = br.readLine();
            String[] arr = s.split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            bw.write(String.valueOf(a+b+"\n"));
//            System.out.println(a+b);
        }
        bw.flush();
        bw.close();
    }
}
