

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] height = new int[n];

        for(int i = 0; i<height.length; i++){
            height[i] = Integer.parseInt(br.readLine());
        }

        int count = 1;
        int max = height[height.length-1];

        for(int j= height.length-2; j>=0; j--){
            if(height[j] > max){
                count++;
                max = height[j];
            }
        }
        System.out.println(count);
    }
}
