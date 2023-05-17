package sehwan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int value = Integer.parseInt(br.readLine());

        if(value >= 90) System.out.println("A");
        else if(value >= 80) System.out.println("B");
        else if(value >= 70) System.out.println("C");
        else if(value >= 60) System.out.println("D");
        else System.out.println("F");
    }
}
