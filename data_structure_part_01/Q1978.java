package data_structure_part_01;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Q1978 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int cnt = 0;
        for(int i = 0; i < n; i++){

            int num = Integer.parseInt(st.nextToken());
            boolean ck = true;

            if(num >= 2){

                for(int j = 2; j * j <= num; j++){

                    if(num % j == 0){
                        ck = false;
                        break;
                    }
                }

                if(ck) cnt++;
            }

        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();


    }


}
