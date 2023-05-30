import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        int max = (int) Math.sqrt(b); // 10^14는 10^7의 제곱근
        int count = 0;

        // 에라토스테네스의 체를 이용해서 소수 판별
        boolean[] isPrime = new boolean[max + 1];
        for (int i = 2; i <= max; i++) {
            isPrime[i] = true;
        }
        // 특정 수의 배수에 해당하는 수를 모두 false로 만듦
        for (int i = 2; i * i <= max; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        // a부터 b까지 수 중에서 소수인지 확인
        for (long i = 2; i <= max; i++) {
            if (isPrime[(int) i]) { // true 인 것 중에
                long num = i * i; // n제곱 꼴
                while (num <= b) {
                    if (num >= a) {
                        count++;
                    }
                    if (num > Long.MAX_VALUE / i) break; // 오버플로우 방지
                    num *= i;
                }
            }
        }
        System.out.println(count);
    }
}
