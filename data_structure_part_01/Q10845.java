package data_structure_part_01;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Q10845 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Deque<String> deq = new ArrayDeque<>();

        for(int i = 0; i < n ; i++){
            String[] arr = br.readLine().split(" ");
            String str = arr[0];
            String enter = ( i != n-1) ? "\n" : "";

            switch (str) {

                case("push") :
                    deq.add(arr[1]);
                    break;

                case("pop") :
                    if(deq.isEmpty()){
                        bw.write("-1" + enter);
                    }else{
                        bw.write(deq.poll() + enter);
                    }
                    break;

                case("size") :
                    bw.write(deq.size() + enter);
                    break;

                case("empty") :
                    bw.write( deq.isEmpty() ? "1" : "0");
                    bw.write( enter );
                    break;

                case("front") :
                    bw.write( deq.isEmpty() ? "-1" + enter : deq.peek() + enter);
                    break;

                case("back") :
                    bw.write( deq.isEmpty() ? "-1" + enter : deq.peekLast() + enter);

            }

        }


        bw.flush();
        bw.close();
        br.close();

    }
}
