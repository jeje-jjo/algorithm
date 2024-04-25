package data_structure_part_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q11053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n+1];
        int[] dp = new int[n+1];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i ++){
            int num = Integer.parseInt(st.nextToken());
            nums[i] = num;
        }

        for(int i = 0 ; i < n ;  i++){
            dp[i] = 1;

            for(int j = 0; j < i ; j++){

                if(nums[i] > nums[j] && dp[i] < dp[j]+1){
                    dp[i] = dp[j] +1;
                }
            }
        }

        // 최대값 찾기

        int max = 0;
        for(int i = 0; i < dp.length; i++){

            if(max < dp[i]){
                max = dp[i];
            }
        }


        System.out.println(max);

        br.close();
    }
}
