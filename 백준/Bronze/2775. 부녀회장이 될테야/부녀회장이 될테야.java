

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int arr[][] = new int[15][15];

        for(int j=0; j<15; j++){
            arr[0][j] = j; // k가 0일 때 n 값과 동일
            arr[j][1] = 1; // n 이 1이면 값은 1
        }
        for(int r=1; r<15; r++){ // k 값
            for(int j=2; j<15; j++){ // n 값
                arr[r][j] = arr[r][j-1]+arr[r-1][j]; // 같은층 앞호수 + 아래층 같은호수 = 해당층 해당호수
            }
        }
        int t = Integer.parseInt(br.readLine()); // 반복 횟수 
        for(int i=0; i<t; i++){ // 반복 횟수만큼
            int k = Integer.parseInt(br.readLine()); // 층
            int n = Integer.parseInt(br.readLine()); // 호수
            sb.append(arr[k][n]).append("\n");
        }
        System.out.println(sb);
    }
}
