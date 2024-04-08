package data_structure_part_01;

import java.io.*;

public class Q10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int fact = 1;

        if(n > 1){

            for(int i = 1; i <= n; i++){
                fact = fact * i;
            }

        }


        bw.write(fact + "");

        bw.flush();
        bw.close();
        br.close();

    }
}
