package sehwan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon11382 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] values = br.readLine().split(" ");
        System.out.println(Long.parseLong(values[0])+Long.parseLong(values[1])+Long.parseLong(values[2]));
    }
}