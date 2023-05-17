package sehwan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb  = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            for(int j = i; j < n - 1; j++) {
                sb.append(" ");
            }

            for(int k = 0; k < i * 2 + 1; k++){
                sb.append("*");
            }

            sb.append("\n");
        }

        for(int i = n - 1; i > 0; i--) {
            for(int j = n - i; j > 0; j--) {
                sb.append(" ");
            }

            for(int k = 0; k < i * 2 - 1; k++) {
                sb.append("*");
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}
