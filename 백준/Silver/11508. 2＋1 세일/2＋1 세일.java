
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer [] arr = new Integer[n];

        for(int i=0; i<n; i++){ // 제품의 가격 입력 받기
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr, Collections.reverseOrder()); // 내림차순 정렬

        int sum = 0;
        for(int i=0; i<n;i++){
            if((i+1)%3==0){ // 3번째에 있는 숫자 제외
                continue;
            }
            else{ // 나머지는 더해줌
                sum+= arr[i];
            }
        }
        System.out.println(sum);
    }
}
