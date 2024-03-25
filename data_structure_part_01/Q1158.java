package data_structure_part_01;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class Q1158 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        Deque<Integer> deq = new ArrayDeque<>();

        for(int i = 1; i <= n; i++){
            deq.add(i);
        }

        // 덱이 빌 때까지 순회

        bw.write("<");

        while(!deq.isEmpty()){
            String sp = deq.size() != 1 ? ", " : "";

            // k 까지 올라가면서
            for(int i = 0; i < k; i++){
                int item = deq.pop();

                // i가 k-1이라면 arr[idx] 에 추가
                if(i == k-1){

                    bw.write(item + sp);

                }else{
                    deq.add(item);
                }
            }
        }

        bw.write(">");



        bw.flush();
        bw.close();
        br.close();

    }
}
