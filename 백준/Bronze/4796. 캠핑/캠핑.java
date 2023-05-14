
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int num = 1; // case 수
        int result = 0; // 결과 저장할 값
        StringBuilder sb = new StringBuilder();

        while(true){
            st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken()); // 사용가능한 날
            int P = Integer.parseInt(st.nextToken()); // 연속하는 p일
            int V = Integer.parseInt(st.nextToken()); // 휴가 기간

            if(L==0 && P==0 && V==0){ //0 0 0 입력받으면 break
                break;
            }
            sb.append("Case "+ num + ": ");
            if (V%P < L){ // 휴가기간을 연속하는 P일로 나눈 나머지가 L보다 작으면
                result = (V/P)*L + V%P; // 나눈 몫에 나머지를 더해줌
                sb.append(result).append("\n");
            }
            else{ // 휴가기간을 연속하는 P일로 나눈 나머지가 L보다 크거나 같으면
                result = (V/P)*L + L; // 나눈 몫에 L을 더해줌 (연속하는 P일 중 사용 가능한 날은 L일뿐이기 때문)
                sb.append(result).append("\n");
            }
            num++; // 케이스 수 증가 시켜줌
        }
        System.out.println(sb);


    }
}
