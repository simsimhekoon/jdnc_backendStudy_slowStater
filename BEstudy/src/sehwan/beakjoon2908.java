package sehwan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] values = br.readLine().split(" ");
        String value1 = "";
        String value2 = "";

        for(int i = 2; i >= 0; i--) {
            value1 += values[0].charAt(i);
            value2 += values[1].charAt(i);
        }

        System.out.println(Math.max(Integer.parseInt(value1), Integer.parseInt(value2)));
    }
}
