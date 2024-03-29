package data_structure_part_01;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class g001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();


        int fin = 0;

        // 첫번째줄
        fst:
        for(int i = 0; i < n ; i++){

            StringTokenizer st = new StringTokenizer(br.readLine());
            //두번째줄
            for(int j = 0; j < n; j++){
                int key = Integer.parseInt(st.nextToken());

                map.put(key, map.getOrDefault(key, 0) +1);

                if(map.get(key) > (Math.pow(n, 2)/2)){
                    fin = key;
                    break fst;
                }
            }
        }

        // 전체 종료 후에 fin이 0이면 초과하는 게 없으니까
        if(fin == 0){


            for(Map.Entry<Integer, Integer> ent : map.entrySet()){
                fin += ent.getKey() * ent.getValue();
            }

            double d = Math.pow(n, 2);
            fin = (int) (fin / d);

        }

        bw.write(fin + "");


        bw.flush();
        bw.close();
        br.close();


    }
}
