package data_structure_part_01;

import java.io.*;

public class Q10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[26];
        String str = br.readLine();

        for(int i = 0; i < str.length(); i++){
            int num = str.charAt(i) - 97;

            arr[num] += 1;
        }

        for(int i : arr){
            bw.write(i + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
