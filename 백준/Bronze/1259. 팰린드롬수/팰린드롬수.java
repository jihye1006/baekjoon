import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼스트림 사용
        StringBuilder sb = new StringBuilder(); // StringBuilder 사용해서 결과 저장

        while(true){
            String s = br.readLine(); // 숫자 입력 받기
            boolean b = true;
            int n = s.length(); // 숫자의 길이
            if(s.equals("0")){ // 입력 받은 숫자가 0이면
                break; // 끝내기
            }
            for(int i = 0; i <= n/2; i++){
                if (s.charAt(i) != s.charAt(n - i - 1)) { // 앞 뒤가 다르면
                    b = false; // 팰린드롬 아님
                }
            }
            if(b){ // 팰린드롬이면 yes 출력
                sb.append("yes\n");
            }
            else{ // 팰린드롬이 아니라면 no 출력
                sb.append("no\n");
            }
        }
        System.out.print(sb);
    }
}
