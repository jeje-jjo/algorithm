package data_structure_part_01;

import java.io.*;
import java.util.StringTokenizer;

public class Q2004 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());


        long countFive = fiveCount(n) - fiveCount(n - m) - fiveCount(m);
        long countTwo = twoCount(n) - twoCount(n - m) - twoCount(m);


        System.out.println(Math.min(countFive, countTwo));


        br.close();

    }


    public static long fiveCount(long num){
        long count = 0;

        for(long i = 5; i <= num; i *= 5){


            count += num / i;
        }

        return count;
    }

    public static long twoCount(long num){
        long count = 0;

        for(long i = 2; i <= num ; i *= 2){

            count += num / i;
        }

        return count;
    }
}
