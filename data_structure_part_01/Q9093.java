package data_structure_part_01;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class Q9093 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        //String[] arr = new String[1000];

        for(int i = 0; i < n ; i ++){
            String str = br.readLine();
            String[] arr = str.split(" ");

            for(int j = 0; j < arr.length ; j++){
                String[] sArr = arr[j].split("");

                for(int k = sArr.length-1; k >= 0; k--){
                    bw.write(sArr[k]);
                }
                if(j != arr.length-1) bw.write(" ");
            }

            if(i != n-1) bw.write("\n");

        }

        bw.flush();
        bw.close();
        br.close();

    }
}
