

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int earth = 1;
        int sun = 1;
        int moon = 1;

        int e = Integer.parseInt(st.nextToken()); //지구
        int s = Integer.parseInt(st.nextToken()); //태양
        int m = Integer.parseInt(st.nextToken()); //달
        int year = 1;

        while (true) {
            if (earth == e && sun == s && moon == m) { // 입력과 년도가 다 맞아 떨어지는 경우
                break;
            }
            year++;
            earth++;
            sun++;
            moon++;
            if(earth ==16){ //범위를 벗어나면
                earth = 1; //초기화
            }
            if(sun ==29){ //범위를 벗어나면
                sun = 1;//초기화
            }
            if(moon ==20){ //범위를 벗어나면
                moon = 1;//초기화
            }

        }
        System.out.println(year);


    }
}
