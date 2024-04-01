package data_structure_part_01;

import java.io.*;

public class Q10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] arr = new int[100][];
        String str = "";

        long end = System.currentTimeMillis() + 1000;

        while(System.currentTimeMillis() < end){
            if(System.in.available() > 0){
               str = br.readLine();
               end = System.currentTimeMillis() + 1000;
            }

        }


        bw.flush();
        bw.close();
        br.close();
    }
}
