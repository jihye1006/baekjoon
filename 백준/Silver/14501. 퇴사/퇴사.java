
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine()); // 며칠 일할지 입력 받기
        int[] t = new int[n]; //걸리는 기간 저장하는 배열
        int[] p = new int[n]; //금액 저장하는 배열

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            t[i] = Integer.parseInt(st.nextToken());
            p[i] = Integer.parseInt(st.nextToken());
        }

        int dp[] = new int[n+1]; // 최대 수익을 계산할 수 있는 배열

        for(int i=0; i<n; i++){ //n만큼
            if(i+t[i]<=n){ // 걸리는 기간이 n보다 작거나 같으면
                dp[i+t[i]] = Math.max(dp[i+t[i]], dp[i]+p[i]); // 더 큰 값 저장
            }

            // i일에 일할 수 없다면 전까지 일한 최대 수당을 넣어준다.
            dp[i+1] = Math.max(dp[i+1], dp[i]);

        }
        System.out.println(dp[n]);
    }
}
