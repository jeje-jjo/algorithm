package data_structure_part_01;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Q10866 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Deque<String> deq = new ArrayDeque<>();

        for (int i = 0; i < n; i++){
            String[] arr = br.readLine().split(" ");
            String str = arr[0];
            String et = i != n-1 ? "\n" : "";

            switch (str){
                case ("push_front") :
                    deq.addFirst(arr[1]);
                    break;

                case ("push_back") :
                    deq.addLast(arr[1]);
                    break;

                case ("pop_front") :
                    bw.write(deq.isEmpty() ? "-1" + et : deq.pollFirst() + et);
                    break;

                case ("pop_back") :
                    bw.write(deq.isEmpty() ? "-1" + et : deq.pollLast() + et);
                    break;

                case ("size") :
                    bw.write(deq.size() + et);
                    break;

                case ("empty") :
                    bw.write(deq.isEmpty() ? "1" + et : "0" + et);
                    break;

                case ("front") :
                    bw.write(deq.isEmpty() ? "-1" + et : deq.peek() + et);
                    break;

                case ("back") :
                    bw.write(deq.isEmpty() ? "-1" + et : deq.peekLast() + et);

            }

        }

        bw.flush();
        bw.close();
        br.close();
    }
}
