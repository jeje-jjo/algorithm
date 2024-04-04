package data_structure_part_01;

import java.io.*;
import java.util.StringTokenizer;

public class Q1934 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());


        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            // 입력받아서 출력하기
            int fst = Integer.parseInt(st.nextToken());
            int sec = Integer.parseInt(st.nextToken());
            bw.write( (fst * sec) / gcd(fst, sec) +"\n");

        }


        bw.flush();
        br.close();
        br.close();

    }

    public static int gcd(int fst, int sec){

        System.out.println("fst : " + fst + " | sec : " + sec );
        if(sec == 0){
            return fst;
        }

        return gcd(sec, fst%sec);
    }
}
