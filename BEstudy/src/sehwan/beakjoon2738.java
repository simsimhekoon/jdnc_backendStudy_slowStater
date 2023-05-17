package sehwan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] size = br.readLine().split(" ");
        String[][] tc = new String[Integer.parseInt(size[0]) * 2][Integer.parseInt(size[1])];

        for(int i = 0; i < tc.length; i++){
            tc[i] = br.readLine().split(" ");
        }

        for(int i = 0; i < tc.length / 2; i++) {
            for(int j = 0; j < tc[i].length; j++) {
                sb.append(Integer.parseInt(tc[i][j])+Integer.parseInt(tc[i+tc.length / 2][j]));
                sb.append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
