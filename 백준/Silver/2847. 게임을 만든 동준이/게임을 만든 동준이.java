

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 레벨의 수 입력 받기
        StringTokenizer st ;
        int [] arr = new int[n+1]; // 레벨에 해당하는 점수를 저장해주는 배열
        int count = 0;

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int level = Integer.parseInt(st.nextToken()); // 레벨 점수 입력 받기
            arr[i] = level;
        }

        for(int i=n-1; i>0; i--){ // 마지막 가장 큰 값부터 비교
            while(true){ 
                if(arr[i]<=arr[i-1]){ //만약 앞 레벨이 뒤 레벨보다 점수가 높다면
                    arr[i-1] -= 1; //1빼주기
                    count ++; // 점수를 몇 번 감소시키는지 count
                }
                else{
                    break; // while문 빠져나감
                }
            }

        }
        System.out.println(count);


    }
}
