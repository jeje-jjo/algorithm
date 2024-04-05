package data_structure_part_01;

import java.io.*;
import java.util.*;

public class Q6588 {

    static long startTime = System.currentTimeMillis();
    static List<Integer> primes = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        primes.add(3);

        for(int i = 1; i < 1000000; i += 2){

            if(primeCk(i)){
                primes.add(i);
               // System.out.println(i);
            }
        }

        int n;
        Set<Integer> pSet = new HashSet<>(primes);

        while((n = Integer.parseInt(br.readLine())) != 0){


            int halfSize = primes.size()/2 + 1;
            for(int i = 0; i < halfSize; i++){
                int fst = primes.get(i);
                int last = n - primes.get(i);

                if(pSet.contains(last)){
                    System.out.println(n + " = " + fst + " + " + last);
                    break;
                }

                if(i == halfSize -1){
                    System.out.println("Goldbach's conjecture is wrong.");
                }
            }

        }

        long endTime = System.currentTimeMillis();
        long exTime = endTime - startTime;

        System.out.println(exTime + "ms 걸림");

        br.close();
    }

    public static boolean primeCk(int num){

        if(num <= 2) return false;

        for(int i = 0; primes.get(i) * primes.get(i) <= num; i++){

            if(num % primes.get(i) == 0){
                return false;
            }
        }

        return true;
    }


}
