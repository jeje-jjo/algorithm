package data_structure_part_01;

import java.io.*;
import java.util.StringTokenizer;


class Node {
    char data;
    Node next;
    Node prev;

    public Node(char data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public class Q1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        // 연결리스트 생성하기
        Node top = new Node(' ');
        Node cursor = top;          // 시작점

        for(char c : str.toCharArray()) {

            // 1. 새로운 'c' 를 담고 있는 노드를 생성
            Node nd = new Node(c);

            // 현재 가지고 있는 cursor 의 next 간선을 초기화 (nd는 방금 선언했으니 당연히 x)
            // 선언하는 시점에 다음 노드는 존재하지 않기 때문에 초기화를 함.
            cursor.next = nd;

            // nd의 prev 간선은 이전에 담고 있던 노드와 연결해주기
            nd.prev = cursor;

            // 마지막으로 이전 노드의 정보를 현재 노드 정보로 업데이트
            cursor = nd;

        }

        int m = Integer.parseInt(br.readLine());

        // 커서 위치 제일 마지막으로
        while (cursor.next != null){
            System.out.println("cursor : " + cursor);
            cursor = cursor.next;
        }


        for(int i = 0; i < m; i++){
            String[] arr = br.readLine().split(" ");
            String item = arr[0];

            switch (item) {

                case "L" :
                    if (cursor.prev != null)  cursor = cursor.prev;
                    break;

                case "D" :
                    if(cursor.next != null) cursor = cursor.next;
                    break;

                case "B" :
                    if(cursor.prev != null){
                        cursor.prev.next = cursor.next;
                        if(cursor.next != null){
                            cursor.next.prev = cursor.prev;
                        }
                        cursor = cursor.prev;
                    }
                    break;

                case "P" :
                    char c = arr[1].charAt(0);
                    Node nd = new Node(c);

                    nd.prev = cursor;
                    nd.next = cursor.next;

                    if(cursor.next != null){
                        cursor.next.prev = nd;
                    }

                    cursor.next = nd;
                    cursor = nd;
                    break;
            }
        }

        Node temp = top.next;

        while( temp != null ){
            bw.write(temp.data);
            temp = temp.next;
        }

        bw.flush();
        bw.close();
        br.close();
    }



}
