

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static long getGCD(long a, long b) { // 최대공약수
        if(a % b == 0) return b;
        return getGCD(b, a%b);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 정렬되기 바라는 행성의 개수
        StringTokenizer st = new StringTokenizer(br.readLine());
        long [] arr = new long[n-2]; // 주기를 나타내는 정수
        for(int i=0; i<=n-3; i++){
            arr[i] = Long.parseLong(st.nextToken());
        }
        long ans = arr[0];
        for(int i=1; i<=n-3; i++){ // 최소공배수 구해주기
            ans = (ans * arr[i]) / getGCD(ans, arr[i]);
        }
        System.out.println(ans);
    }
}
