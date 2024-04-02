package data_structure_part_01;

import java.io.*;

public class Q10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;

        while((s = br.readLine()) != null){

            int[] arr = new int[4];

            for(int i = 0; i < s.length() ; i++){

                if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                    arr[0] += 1;
                }else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                    arr[1] += 1;
                }else if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                    arr[2] += 1;
                }

                if(s.charAt(i) == ' '){
                    arr[3] += 1;
                }
            }

            for(int i : arr){
                bw.write(i + " ");
            }

            bw.write("\n");
        }


        bw.flush();
        bw.close();
        br.close();
    }
}
