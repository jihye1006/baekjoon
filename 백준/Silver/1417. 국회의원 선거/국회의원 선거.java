

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 후보 수 입력 받기
        int [] arr = new int[n]; // 득표 예정 수 넣어줄 배열

        for (int i = 0; i< n; i++){
            int vote = Integer.parseInt(br.readLine()); // 득표 예정수 입력받기
            arr[i] = vote; // 배열에 넣어줌
        }
        int num = 0; //
        int count = 0; // 매수해야하는 사람 수
        int count_2 = 0; // 다솜이 득표 수가 제일 많은지 확인할 때 쓰는 값
        int som = arr[0];// 다솜이 득표수 = som으로 설정
        int max = 0;
        boolean flag = true;

        while(flag){
            for(int j = 1; j<n; j++) {
                if (arr[j] >= max) { // 배열 값 중 최댓값 구하기
                    max = arr[j];
                    num = j;
                }
            }
            if(max>=som){ // 다솜이의 득표수보다 최댓값이 크거나같다면
                max -= 1; // 최댓값에서 1 빼주기
                som += 1; // 다솜이의 득표수 1더해주기
                count++; // 매수해야하는 수 세기
            }
            arr[num] -= 1; // 배열에 들어가있는 수 바꿔주기

            for (int k=1; k<n; k++){
                if(som>arr[k]){ //다솜이 득표수가 타후보 득표수보다 많다면
                    count_2++;
                }
            }
            if(count_2==n-1){ // 다솜이가 다른 모든 후보들보다 득표 수가 많다면
                break; // while문 빠져나오기
            }
            else{ //아니라면
                count_2=0; // count_2값 초기화
            }
        }
        System.out.println(count); // 매수해야하는 사람 수 출력

    }
}
