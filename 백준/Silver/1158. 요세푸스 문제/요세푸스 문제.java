import java.util.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // N값 입력 받기
        int K = sc.nextInt(); // K값 입력 받기

        Queue<Integer> queue = new LinkedList<>(); //Queue 선언
        StringBuilder sb = new StringBuilder(); //StringBuilder 객체 생성

        for(int i =1; i<=N; i++){ // 1부터 N까지 queue에 값 추가
            queue.offer(i);
        }
        sb.append('<');

        while(queue.size()!=1){ //queue에 남은게 1이 아닐 때까지
            for(int i=1; i<K; i++){ // K번째가 되기 전까지
                queue.offer(queue.poll()); // 삭제 된 값을 queue에 추가 (맨 뒤에)
            }
            sb.append(queue.poll()).append(", "); // K번째일 때 값과 ','를 sb 문자열에 넣어줌
        }
        sb.append(queue.poll()).append('>'); // 마지막 남은 값과 '>' 문자열에 넣어줌
        System.out.println(sb); //출력

    }
}