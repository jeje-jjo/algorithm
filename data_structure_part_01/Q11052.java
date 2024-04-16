package data_structure_part_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] pack = new int[n+1];
        int[] dp = new int[n+1];

        // 팩에 값 담고
        for(int i = 1; i <= n; i++){
            int price = Integer.parseInt(st.nextToken());
            pack[i] = price;

            // dp 굴리기
            // 최대값 구해오기
            for(int j = 1; j <= i ; j++){

                dp[i] = Math.max(dp[i], dp[i-j] + pack[j]);

            }
        }

        System.out.println(dp[n]);

        br.close();

    }
}
