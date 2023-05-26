
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine()); // 용액의 수
        long [] arr = new long[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Long.parseLong(st.nextToken()); // 용액의 특성값 입력 받음
        }
        long min = Long.MAX_VALUE; //초기 최솟값 설정
        int ans1 =0, ans2 = 0;
        for(int i=0; i<n-1; i++) {
            int left =i+1;
            int right =n-1;
            while(left<=right) {
                int mid = (left+right)/2;
                long sum = Math.abs(arr[i]+arr[mid]);

                if(min > sum) {
                    min = sum;
                    ans1 = i; ans2 = mid;
                }
                if(arr[mid] >= -arr[i]) {
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }
        }
        System.out.println(arr[ans1]+" "+arr[ans2]);
        br.close();

    }
}
