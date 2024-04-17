package data_structure_part_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q15990 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long[][] dp = new long[100001][4];
        int n = Integer.parseInt(br.readLine());


        // 1 = 1+0
        // 2 = 2+0
        // 3 = 3+0 / 2+1 / 1+2

        dp[1][1] = 1;
        dp[2][2] = 1;
        dp[3][1] = 1;
        dp[3][2] = 1;
        dp[3][3] = 1;

        for(int i = 4; i <= 100000 ; i++){

            dp[i][1] = (dp[i-1][2] + dp[i-1][3]) % 1000000009;
            dp[i][2] = (dp[i-2][1] + dp[i-2][3]) % 1000000009;
            dp[i][3] = (dp[i-3][1] + dp[i-3][2]) % 1000000009;

        }

        for(int i = 0 ; i < n ; i ++){
            int num = Integer.parseInt(br.readLine());
            System.out.println(dp[num][1] + dp[num][2] + dp[num][3]);
        }


        br.close();

    }
}
