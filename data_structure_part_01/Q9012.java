package data_structure_part_01;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Q9012 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        boolean[] b = new boolean[t];
        boolean ck = false;

        for(int i = 0 ; i < t ; i ++){
            String str = br.readLine();
            Deque<Character> deq = new ArrayDeque<>();
            ck = false;
            String e = (i != t-1) ? "\n" : "";

            for(int j  = 0; j < str.length(); j++){
                deq.add(str.charAt(j));
            }

           while(!ck){

               b[i] = true;

               // 덱이 비어있지 않을 경우
               if(!deq.isEmpty()){

                   // 덱의 첫번째 요소를 반환하고
                   char c = deq.poll();

                   // c가 여는 괄호일 경우에
                   if(c == '('){

                       // 현재 덱의 전체 길이를 가져옴
                       int size = deq.size();

                       // 덱의 처음에서부터 찾았을 때 ')'가 존재한다면 지우기
                       deq.removeFirstOccurrence(')');

                       // 현재 덱의 길이와 지운 후 길이가 같다면 ')' 괄호가 없는 것이므로 반복 바로 종료
                       if(size == deq.size()){
                           b[i] = false;
                           break;
                       }
                   // 첫번째가 닫는 괄호일 경우
                   }else{
                       b[i] = false;
                       break;
                   }
               // 덱이 비었을 때
               }else{
                   b[i] = true;
                   break;
               }

           }

          bw.write((b[i] ? "YES"  : "NO") + e );
        }


        bw.flush();
        bw.close();
        br.close();
    }
}
