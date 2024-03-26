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

                if(c == '('){
                    deq.push(c);

                }else if(c == ')'){

                    // 경우의 수
                    // 1. 바로 이전 괄호가 '(' 일 경우
                    // - 이전 괄호와 현재 덱의 첫 괄호가 같을 경우
                    // - 이전 괄호와 현재 덱의 첫 괄호가 다를 경우

                    // 2. 바로 이전 괄호가 ')' 일 경우
                    // - 이전 괄호와 현재 덱의 철 괄호가 다를 경우
                    // - 이전 괄호와 현재 덱의 첫 괄호가 같을 경웅

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
