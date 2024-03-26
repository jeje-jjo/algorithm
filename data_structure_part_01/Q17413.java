package data_structure_part_01;

import java.io.*;
import java.util.*;

public class Q17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //StringBuffer s = new StringBuffer(br.readLine());

        String s = br.readLine();
        String[] arr = s.split(" ");

        List<String> list = new ArrayList<String>(Arrays.asList(arr));


        int idx = 0;

        for(int i = 0; i < list.size(); i++){

            String[] str = list.get(i).split("");

            Deque<String> deq = new ArrayDeque<>();
            List<String> sl = new ArrayList<>();

            boolean ck = true;

            for(int j = 0; j < str.length ; j++){

                if(str[j].equals("<")){
                    ck  = false;
                }

                if(ck == true){
                    sl.add(0, str[j]);
                }else{
                    sl.add(str[j]);
                }

                if(str[j].equals(">")){
                    ck = true;
                }

            }


            for(String ss : sl){
                bw.write(ss + "");
            }

            bw.write(" ");

        }

        bw.flush();
        bw.close();
        br.close();
    }
}
