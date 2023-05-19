

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        long sum = 0, ans = 0;
        int n = Integer.parseInt(st.nextToken()); // 카드 개수 입력 받기
        int m = Integer.parseInt(st.nextToken()); // 합체 몇 번 할지 입력 받기
        long [] card = new long[n]; // 카드에 적힌 수를 저장할 배열

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            card[i] = Integer.parseInt(st.nextToken()); //카드에 적힌 수 입력 받기
        }
        for(int i=0; i<m; i++){
            Arrays.sort(card); // 오름차순으로 배열
            sum = card[0] + card[1]; // 가장 작은 두개의 수 저장
            card[0] = sum; // 두 카드 다 합친 값으로 바꿔주기
            card[1] = sum;
        }
        for(int i=0; i<n; i++){ // 모든 카드의 수 더해주기
            ans +=card[i];
        }
        System.out.println(ans);
        br.close();

    }
}
