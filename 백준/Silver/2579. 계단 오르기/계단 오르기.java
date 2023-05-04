import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 계단 개수 입력받기
        int[] arr = new int[n+10]; // 계단에 저장되는 수
        int[] dp = new int[n+10]; // 최고로 얻을 수 있는 점수

        for(int i=1; i<=n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = arr[1];
        dp[2] = arr[1] + arr[2];
        dp[3] = Math.max(arr[1],arr[2]) + arr[3];// 1->3층으로 가는 경우, 2->3층으로 가는 경우 비교한 후 큰 수 저장

        for(int j=4; j<n+1; j++){
            // n-3 -> n-1 -> n 으로 가는 경우와 n-2 -> n 으로 가는 경우 비교 후 큰 수 저장
            dp[j] = Math.max(dp[j-3]+arr[j-1], dp[j-2]) + arr[j];
        }
        System.out.println(dp[n]);

    }
}
