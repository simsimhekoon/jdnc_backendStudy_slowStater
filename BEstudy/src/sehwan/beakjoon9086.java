package sehwan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String s;

        for(int i = 0; i < n; i ++) {
            s = br.readLine();
            sb.append(s.charAt(0));
            sb.append(s.charAt(s.length() -1 ));
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
