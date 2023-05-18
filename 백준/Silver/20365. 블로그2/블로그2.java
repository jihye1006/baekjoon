

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 문제의 수 입력 받기
        char[] arr = new char[n]; // 한 문자씩 저장해줄 배열
        String str = br.readLine(); // 어떻게 칠해야하는지 입력 받기
        int rcnt = 0, bcnt = 0;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = str.charAt(i); //한 문자씩 저장
            if (i == 0) {
                if (arr[i] == 'B') bcnt++;
                else rcnt++;
            } else { // i가 1일때부터
                if (arr[i] == arr[i - 1]) continue; // 연속된 문자가 오면 continue
                else { // 문자가 다르다면
                    if (arr[i] == 'B') bcnt++; // B가 오면 bcnt++
                    else rcnt++; // R이 오면 rcnt++
                }
            }
            //최솟값을 구하는 거니 둘 중 비교해서 더 작은 값 대입
            if (rcnt >= bcnt) {
                sum = bcnt + 1;
            } else {
                sum = rcnt + 1;
            }
        }
        System.out.println(sum);
    }
}

