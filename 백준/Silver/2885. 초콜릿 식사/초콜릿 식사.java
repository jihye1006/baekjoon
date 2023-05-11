
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine()); // 상근이가 먹을 초콜릿
        StringBuilder sb = new StringBuilder();
        int ans1 = 0;
        for(int i=0; i<=20; i++){ //k의 최댓값이 1,000,000이고 2의 20승이 1,048,576이기 때문
            if(k<= Math.pow(2, i)){ //k보다 크거나 같은 첫 2의 거듭제곱수
                ans1 = (int) Math.pow(2, i);
                break;
            }
        }

        int piece = ans1; // 계산을 위한 복사
        int count = 0; // 쪼개는 수

        while(true){
            if(k==0){ // 더이상 나눌 초콜릿이 없으면
                break;
            }
            if(k==piece){
                break;
            }
            else{
                piece = piece/2;
                if(k>=piece){
                    k -= piece;
                }
                count ++;
            }
        }
        sb.append(ans1).append(" ").append(count);
        System.out.println(sb);
        br.close();

    }
}
