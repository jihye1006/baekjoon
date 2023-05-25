import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 나무의 수
        int m = Integer.parseInt(st.nextToken()); // 가져가려고 하는 나무의 길이
        int[] tree = new int[n];
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            tree[i] = Integer.parseInt(st.nextToken()); // 나무의 높이
        }
        Arrays.sort(tree); //오름차순 정렬
        long low = 0;
        long high = tree[n - 1];


        long mid =0;
        while (low <= high) {
            long sum = 0;
            mid = (low + high) / 2;
            for (int k : tree) {
                if (k > mid) { //나무의 길이가 mid보다 크면
                    k -= mid; //나무를 잘라줌
                    sum += k; // 잘려진 나무들의 길이를 더해줌
                }
            }
            if (sum > m) { 
                low = mid + 1;
            } else if (sum == m) { //더한 값이 m이라면 정답
                break;
            } else {
                high = mid - 1;
            }
        }
        System.out.println((low+high)/2);

    }
}
