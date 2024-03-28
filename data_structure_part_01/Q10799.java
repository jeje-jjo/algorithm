package data_structure_part_01;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Q10799 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuffer sb = new StringBuffer(br.readLine());
        Deque<Character> deq = new ArrayDeque<>();

        int sum = 0;

        for(int i = 0; i < sb.length(); i++){
            char c = sb.charAt(i);

            if(!deq.isEmpty()){
                char be = sb.charAt(i-1);

                if(c == '('){
                    // 여는 괄호일 경우에는 그냥 push
                    deq.push(c);
                }else{
                    // 닫는 괄호일 경우 경우의 수
                    char dc = deq.poll();
                    // 1. 이전 괄호가 '(' 면서 덱의 첫번째가 '(' 일 경우
                    if(be == '(' && dc == '('){
                        // 레이저이므로 sum에 현재 deq의 szie를 저장
                        sum += deq.size();

                    }
                    // 4. 이전 괄호가 ')' 면서 덱의 첫번째가 '(' 일 경우+
                    else if(be == ')' && dc == '('){

                        sum ++;

                    }
                }

            }else{
                deq.push(c);
            }
        }

        bw.write(sum + "");

        bw.flush();
        bw.close();
        br.close();
    }
}