package data_structure_part_01;

import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Q1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        Deque<Integer> deq = new ArrayDeque<>();

        for(int i = 0; i < n ; i++){
            arr[i] = Integer.parseInt(br.readLine());

        }

        // 스택 시작
        int idx = 0;
        int[] aft = new int[n];                     // 배열 담을 곳
        List<String> sArr = new ArrayList<>();      // 연산담을곳
        for(int i = 1; i <= n; i++){

            if(deq.isEmpty()){
                // 덱이 비어있을 경우에는 삽입함
                deq.push(i);
                sArr.add("+");

                // 덱에 삽입됐으니 비교하기
                if(arr[idx] == deq.peek()){
                    // 같을 경우 aft에 저장하고 idx 1 추가 / sArr에 push 추가
                    aft[idx] = deq.pop();
                    sArr.add("-");
                    idx++;
                }
            }else{

                // 우선 push를 하고~
                deq.push(i);
                sArr.add("+");

                // deq에 값이 비어있지 않으면~
                while(!deq.isEmpty()){

                    // 현재 arr랑 peek 비교하기~
                    if(arr[idx] == deq.peek()){
                        aft[idx] = deq.pop();
                        sArr.add("-");
                        idx++;
                    }else{
                        break;
                    }
                }

            }

        }

        if(deq.isEmpty()){
            for(String s : sArr){
                bw.write(s + "\n");
            }
        }else{
            bw.write("NO");
        }



        bw.flush();
        bw.close();
        br.close();
    }
}
