package data_structure_part_01;

import java.io.*;

public class Q10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int[] arr = new int[26];

        for(int i = 0 ; i < str.length(); i++){
            int num = str.charAt(i) - 97;

            if(arr[num] == 0){
                arr[num] = i+1;
            }
        }


        for(int i : arr) {
            bw.write( i-1 + " ");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
