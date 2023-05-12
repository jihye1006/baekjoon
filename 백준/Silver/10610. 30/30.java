
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine(); //숫자 입력 받기

        int[] arr = new int[10];
        int len = n.length();
        int sum = 0;

        for(int i=0; i<len; i++){
            int one = Integer.parseInt(n.substring(i,i+1)); // 숫자 하나씩 분리
            arr[one] += 1; // 같은 수가 나올 수도 있기 때문
            sum += one; // 각 자리 숫자의 합
        }

        if(n.contains("0") && sum % 3 ==0){ // 0을 포함하고 자리수의 합이 3의 배수이면
            for(int i=9; i>=0; i--){ //큰 수부터 출력
                while(arr[i]>0){
                    System.out.print(i);
                    arr[i]--;
                }
            }
        }
        else{
            System.out.print(-1);
        }


    }
}
