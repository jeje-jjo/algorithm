package data_structure_part_01;

import java.io.*;
import java.util.*;

public class Q14002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        int[] bp = new int[n];
        Map<Integer, List<Integer>> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(st.nextToken());
            nums[i] = num;
        }

        for(int i = 0; i < n ; i++){
            bp[i] = 1;
            ArrayList<Integer> list = new ArrayList<>();

            for(int j = 0 ; j < i ; j++){
                if(nums[i] > nums[j] && bp[i] < bp[j]+1){

                    // 기존 리스트 초기화하고
                    list.clear();

                    // 현재 리스트에는 j의 값을 넣고
                    list.addAll(map.get(j));

                    // bp[i]의 값은 bp[j] +1
                    bp[i] = bp[j] + 1;

                }
            }

            // 마지막으로 현재 i까지 list에 넣은 다음에 map에 넣기
            list.add(nums[i]);
            map.put(i, list);
        }


        int max = 0;
        int num = 0;
        for(int i = 0; i < n ; i++){
            if(max < bp[i]){
                max = bp[i];
                num = i;
            }
        }

        List<Integer> last = map.get(num);


        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        System.out.println(max);
        for(int i = 0; i < last.size() ; i++){
            bw.write(last.get(i) + " ");
        }

        bw.flush();
        bw.close();

        br.close();
    }
}
