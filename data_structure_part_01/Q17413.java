package data_structure_part_01;

import java.io.*;
import java.util.*;

public class Q17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringBuffer sb = new StringBuffer();
        String s = br.readLine();
        Deque<Character> deq = new ArrayDeque<>();
        boolean ck = false;

        for(int i = 0; i < s.length(); i++){

            if(s.charAt(i) == '<'){
                while(!deq.isEmpty()){
                    sb.append(deq.pop());
                }
                ck = true;
            }else if(s.charAt(i) == '>'){
                ck = false;
                sb.append(s.charAt(i));
                continue;
            }

            if(ck == true){
                sb.append(s.charAt(i));
            }else if(ck == false){
                if(s.charAt(i) == ' '){
                    while(!deq.isEmpty()){
                        sb.append(deq.pop());
                    }
                    sb.append(' ');
                    continue;
                }else {
                    deq.push(s.charAt(i));
                }
            }

            if(i == s.length() -1) {
                while(!deq.isEmpty()){
                    sb.append(deq.pop());
                }
            }
        }

        bw.write(String.valueOf(sb));



        bw.flush();
        bw.close();
        br.close();
    }
}
