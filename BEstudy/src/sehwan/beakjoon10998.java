package sehwan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon10998 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int check = 1;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)) {
                check = 0;
                break;
            }
        }

        System.out.println(check);
    }
}
