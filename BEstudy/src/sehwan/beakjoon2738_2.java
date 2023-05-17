package sehwan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon2738_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] size = br.readLine().split(" ");
        String[][] tc = new String[Integer.parseInt(size[0])][Integer.parseInt(size[1])];
        String[][] tc2 = new String[Integer.parseInt(size[0])][Integer.parseInt(size[1])];

        for(int i = 0; i < tc.length; i++){
            tc[i] = br.readLine().split(" ");
        }

        for(int i = 0; i < tc2.length; i++){
            tc2[i] = br.readLine().split(" ");
        }

        for(int i = 0; i < tc.length; i++) {
            for(int j = 0; j < tc[i].length; j++) {
                sb.append(Integer.parseInt(tc[i][j])+Integer.parseInt(tc2[i][j]));
                sb.append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
