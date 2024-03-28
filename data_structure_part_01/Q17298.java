package data_structure_part_01;

import java.io.*;
import java.util.*;

public class Q17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] result = new int[n];
        Deque<Integer> deq = new ArrayDeque<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < n; i++){
            while(!deq.isEmpty() && arr[deq.peekLast()] < arr[i]){
                result[deq.pollLast()] = arr[i];
            }
            deq.offerLast(i);
        }

        while(!deq.isEmpty()){
            result[deq.pollLast()] = -1;
        }

        for(int i = 0; i < n; i++){
            bw.write(result[i] + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}