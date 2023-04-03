

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //학생 수

        ArrayList<Integer> list = new ArrayList<>(); // 줄을 선 순서를 저장할 배열

        for(int i = 1; i<n+1; i++){ //학생 수만큼
            int num = sc.nextInt(); // 번호 입력 받기
            list.add(i-1-num, i); // 줄 서는 순서대로 배열에 넣어주기
        }
        for(int j = 0; j<n; j++){ //출력
            System.out.print(list.get(j)+" ");
        }
    }
}
