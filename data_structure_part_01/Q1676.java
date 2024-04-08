package data_structure_part_01;

import java.io.*;
import java.math.BigInteger;

public class Q1676 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        for(int i = 5; i <= n; i *= 5){
            System.out.println("i = " + i);

            cnt += n / i;
        }

        bw.write(cnt + "\n");


        bw.flush();
        bw.close();
        br.close();
    }
}
