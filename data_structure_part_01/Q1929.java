package data_structure_part_01;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public class Q1929 {

    static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int fst = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        list.add(2);
        list.add(3);

        for(int i = 2; i <= end; i++){

            if(prime(i)){
                list.add(i);

                if(i >= fst) bw.write(i + "\n");
            }
        }



        bw.flush();
        bw.close();
        br.close();

    }

    public static boolean prime(int num){

        if(num <= 1) return false;

//        for (int i : list) {
//
//            if (i * i <= num) {
//                if (num % i == 0) {
//                    return false;
//                }
//            }
//        }

        for(int i = 0; list.get(i)* list.get(i) <= num; i++){


                if(num % list.get(i) == 0){
                    return false;
                }

        }

        return true;
    }
}
