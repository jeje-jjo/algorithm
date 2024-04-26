package data_structure_part_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());


        int[] nums = new int[n+1];
        int[] dp = new int[n+1];

        for(int i = 1; i <= n ; i++){

            nums[i] = Integer.parseInt(st.nextToken());

        }

        int max = nums[1];

        for(int i = 1; i <= n ; i++){

            dp[i] = Math.max(dp[i-1] + nums[i], nums[i]);

            max = Math.max(max, dp[i]);
        }

        System.out.println(max);

        br.close();
    }
}
