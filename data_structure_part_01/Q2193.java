package data_structure_part_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        long[] bp = new long[91];

        bp[1] = bp[2] = 1;
        bp[3] = 2;

        for(int i = 4; i <= n; i++){

            bp[i] = bp[i-1] + bp[i-2];
        }

        System.out.println(bp[n]);

        br.close();


    }
}
