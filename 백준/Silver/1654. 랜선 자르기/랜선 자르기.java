
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int arr[] = new int[k+1];

        long max = 0;

        for(int i=0; i<k; i++){
            arr[i] = Integer.parseInt(br.readLine());
            if(max<arr[i]){ //입력 받은 수 중 최댓값 저장
                max = arr[i];
            }
        }
        max++;
        long min = 0, mid=0;

        while(min<max){
            mid = (max+min)/2; // 범위 내의 중간값
            long count =0; //랜선의 개수를 구하기 위한 변수

            for(int i=0; i<k; i++){
                count += (arr[i]/mid); // 중간 길이로 자르면 몇개가 만들어지는지
            }
            if(count < n){
                max = mid;
            }
            else{
                min = mid +1;// 잘라야하는 길이를 늘려야하므로 최소길이를 늘림
            }

        }
        System.out.println(min-1); //다시 1빼주기
    }
}
