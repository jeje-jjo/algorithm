package data_structure_part_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10844 {

    static Long[][] dp;
    static long mod = 1000000000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        dp = new Long[n+1][10];

        for(int i = 0; i < 10; i++){
            dp[1][i] = 1L;
        }

        long sum = 0;
        for(int i = 1; i <= 9; i++){
            sum += cal(n, i);
        }

        System.out.println(sum % mod);

        br.close();


    }


    static long cal(int num, int val){


        if(num == 1){
            return dp[num][val];

        }

        if(dp[num][val] == null ) {


            if (val == 0) {
                dp[num][val] = cal(num - 1, 1);
            } else if (val == 9) {
                dp[num][val] = cal(num - 1, 8);
            } else {
                dp[num][val] = cal(num - 1, val - 1) + cal(num - 1, val + 1);
            }

        }



        return dp[num][val] % mod;
    }
}
