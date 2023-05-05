

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 병사명 수 입력받기
        int[] fight = new int[n+1]; // 전투력 저장할 배열
        int[] dp = new int[n + 10]; // 최대의 병사수를 구할 수 있는 배열

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            fight[i] = Integer.parseInt(st.nextToken()); //전투력 입력 받기
        }

        //입력 값이 7명 , 15 11 4 8 5 2 4 라고 예를 들 때 계산을 차례대로 해보면
        //dp[0] = 1, dp[1] = 2, dp[2] = 3이 된다
        //i 값이 3일 때 dp[3]의 초깃값은 1인 상태에서 j로 돌아가는 for문을 들어가면
        //j=0일 땐 dp[3] = 2, j=1일 땐 dp[3] = 3, j=2일 땐 fight[3]이 fight[2]보다 크기 때문에
        //if문에 걸리지 않는다. 그렇게 되면 dp[3] = 3이 된다. 이런식으로 내림 차순에서 열외 되어야하는 값이 있으면 전 dp값(ex: dp[2])과 같게 설정해준다.
        for(int i=0; i<n; i++){ //dp 초기값 지정
            dp[i] = 1;
            for(int j=0; j<i; j++){
                if(fight[j]>fight[i]){ // 올바르게 전투력이 내림차순으로 되어있으면
                    dp[i] = Math.max(dp[i], dp[j]+1); // dp값 증가
                }
            }
        }
        int max = dp[0];
        //위의 예제에 이어서 dp 값이 1 2 3 3 4 4 5가 나온다.
        //max에 초깃값 dp[0]을 넣어주고 for문을 통해 반복되는 수는 한 번만 저장되게 하고 max 보다 더 큰 수를 저장하게끔하면 max는 5가 된다.
        //병사 수에서 max 값을 빼면 열외시켜야할 병사 수가 나온다.
        for(int i=0; i<n; i++){
            if(max<dp[i]){
                max = dp[i];
            }
        }


        System.out.println(n - max);

    }
}