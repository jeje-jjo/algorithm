package data_structure_part_01;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Q1935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String[] arr = (br.readLine()).split("");
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            char num = (char) (i+65);

            map.put(num, Integer.valueOf(br.readLine()));

        }

        Deque<Double> deq = new ArrayDeque<>();

        for(int i = 0; i < arr.length; i++){

            // i가 문자라면 해당하는 map의 value를 deq에 넣기
            int item = arr[i].charAt(0);

            if(item >= 65){
                double d = map.get(arr[i].charAt(0));
                deq.addFirst(d);
            }else{
                // 연산자라면 앞에 있는 두개를 해당하는 연산자로 계산한 뒤 덱의 제일 앞으로
                double num2 = deq.pop();
                double num1 = deq.pop();

                if(arr[i].equals("+")){
                    deq.addFirst(num1 + num2);
                }else if(arr[i].equals("-")){
                    deq.addFirst(num1 - num2);
                }else if(arr[i].equals("/")){
                    deq.addFirst(num1 / num2);
                }else if(arr[i].equals("*")){
                    deq.addFirst(num1 * num2);
                }

            }
        }

        bw.write(String.format("%.2f", deq.pop()));


        bw.flush();
        bw.close();
        br.close();

    }
}
