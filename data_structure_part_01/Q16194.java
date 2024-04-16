package data_structure_part_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q16194 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] pack = new int[n+1];
        int[] dp = new int[n+1];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 1; i <= n ; i++){

            int card = Integer.parseInt(st.nextToken());
            pack[i] = card;
            dp[i] = pack[i];

            for(int j = 1; j <= i ; j++){

                dp[i] = Math.min(dp[i], dp[i-j] + pack[j]);
            }

        }

        System.out.println(dp[n]);

        br.close();
    }
}
