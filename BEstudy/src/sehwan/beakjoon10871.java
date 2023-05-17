package sehwan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] nx = br.readLine().split(" ");
        String[] tc = br.readLine().split(" ");

        for(int i = 0; i < tc.length; i++) {
            if(Integer.parseInt(tc[i]) < Integer.parseInt(nx[1])) sb.append(Integer.parseInt(tc[i])).append(" ");
        }

        System.out.println(sb);
    }
}
