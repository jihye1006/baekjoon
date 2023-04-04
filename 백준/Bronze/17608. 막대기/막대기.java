
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] height = new int[n];

        for(int i = 0; i<height.length; i++){ // n만큼 수 입력 받기
            height[i] = Integer.parseInt(br.readLine());
        }

        int count = 1;
        int max = height[height.length-1]; //최댓값 설정

        for(int j= height.length-2; j>=0; j--){ // 입력 방향 반대로 탐색
            if(height[j] > max){ 
                count++;
                max = height[j]; //최댓값 재설정
            }
        }
        System.out.println(count);
        br.close();
    }
}
