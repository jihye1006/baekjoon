
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //학생 수
        int [] arr = new int[n+1]; // 등수를 저장할 배열
        long sum = 0;
        arr[0] = 0;

        for(int i=1; i<=n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr); // 오름차순 정렬

        for(int i=1; i<=n; i++){
            sum += Math.abs(i-arr[i]); //예상등수 - 원래 등수 빼준 절대값
        }
        System.out.println(sum);
    }
}
