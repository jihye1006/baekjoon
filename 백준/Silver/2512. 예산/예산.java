
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine()); // 지방의 수
        int [] money = new int[n];
        long ans = 0;

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            money[i] = Integer.parseInt(st.nextToken()); // 원하는 예산
        }
        Arrays.sort(money); // 오름차순 정렬

        long m = Integer.parseInt(br.readLine()); // 총 예산
        long left = 0;
        long right = money[n-1]; // 제일 큰 값
        while(left<=right){
            long mid = (left + right)/2; //내야할 세금
            long sum = 0;
            for(int coin : money){ //coin에 money 배열에 들어있는 값을 차례대로 넣어줌
                if(coin>=mid){ //해당 세금을 낼 수 있다면
                    sum+= mid;
                }
                else{ // 못낸다면 최대 돈만 냄
                    sum += coin;
                }
            }
            if(sum > m){ // 내라는 세금보다 많다면 세금을 줄인다
                right = mid -1;
            }
            else{ //내라는 세금보다 적다면 세금을 높인다
                left = mid + 1;
                ans = Math.max(ans, mid);
            }
        }
        System.out.println(ans);
    }
}
