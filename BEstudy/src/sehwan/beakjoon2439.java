package sehwan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            for(int j = n; j > 0; j--) {
                if(j > i + 1) sb.append(" ");
                else sb.append("*");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
