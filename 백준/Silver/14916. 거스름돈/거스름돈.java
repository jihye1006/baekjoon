

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        int n = Integer.parseInt(br.readLine());

        if(n==1||n==3){ // 거스름돈을 줄 수 없는 경우
            result = -1;
        }
        else if(n%5==1|| n%5==4){ // 5로 나눴을 때 나머지가 1과 4인 경우에 5로 나눈 몫에 2를 더해주면 거스름돈 수와 같음
            result = (n/5)+2;
        }
        else if(n%5==2){ // 5로 나눴을 때 나머지가 2인 경우에 5로 나눈 몫에 1를 더해주면 거스름돈 수와 같음
            result = (n/5)+1;
        }
        else if(n%5==3){ // 5로 나눴을 때 나머지가 3인 경우에 5로 나눈 몫에 3를 더해주면 거스름돈 수와 같음
            result = (n/5)+3;
        }
        else if(n%5==0){ // 5로 나눴을 때 나누어 떨어지면 5로 나눈 몫과 거스름돈 수가 같음
            result = n/5;
        }
        System.out.println(result);
    }
}
