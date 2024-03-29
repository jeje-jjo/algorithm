package data_structure_part_01;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q17299 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        HashMap<Integer, Integer> map = new HashMap<>();
        Deque<Integer> deq = new ArrayDeque<>();

        int[] arr = new int[n];
        int[] res = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(st.nextToken());
            map.put(num, map.getOrDefault(num, 0) +1);
            arr[i] = num;
        }


        for(int i = 0; i < n; i++){

            while (!deq.isEmpty() && map.get(arr[i]) > map.get(arr[deq.peekLast()])){
                int po = deq.pollLast();
                res[po] = arr[i];
            }

            deq.offerLast(i);
        }

        while(!deq.isEmpty()){
            res[deq.pollLast()] = -1;
        }

        for(int i : res){
            bw.write(i + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
