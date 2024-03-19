package data_structure_part_01;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Q10828 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deq = new ArrayDeque<>();

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            String s = i == n-1 ? "" : "\n";



            // push
            if(str.equals("push")){
                deq.push(Integer.valueOf(st.nextToken()));

            }

            // pop
            else if(str.equals("pop")){

                // 덱이 비어있을 경우
                if(deq.isEmpty()){
                    bw.write("-1" + s);
                }else{
                    bw.write(deq.pop()+ s);
                }
            }

            // size
            else if(str.equals("size")){
                bw.write(deq.size()+ s);
            }

            //empty
            else if(str.equals("empty")){
                bw.write( (deq.isEmpty() ? "1" : "0")+s );
            }

            // top
            else if(str.equals("top")){

                if(deq.isEmpty()){
                    bw.write("-1" + s);
                }else {
                    bw.write(deq.peek()+ s);
                }
            }



        }

        bw.flush();
        bw.close();
        br.close();
    }
}
