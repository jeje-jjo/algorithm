package data_structure_part_01;

import java.io.*;
import java.util.*;

public class g002 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> aSet = new TreeSet<>();
        Set<String> bSet = new HashSet<>();

        for(int i = 0; i < 2; i++){
            st = new StringTokenizer(br.readLine());

            for(int j = 0; j < n; j++){

                if(i == 0){
                    aSet.add(st.nextToken());
                }else{
                    bSet.add(st.nextToken());
                }
            }

        }


        for(int i = 0; i < m ; i ++){
            st = new StringTokenizer(br.readLine());

            String aStr = st.nextToken();
            String bStr = st.nextToken();

            // a에 단어 들어있는지 확인
            if(aSet.contains(aStr)){

                // b에 단어 들어있는지 확인
                if(bSet.contains(bStr)){

                    // 둘 다 있다면 단어 교환
                    aSet.remove(aStr);
                    aSet.add(bStr);

                    bSet.remove(bStr);
                    bSet.add(aStr);
                }
            }

        }



        for(String s : aSet){
            bw.write(s + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
