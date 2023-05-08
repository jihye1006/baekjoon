

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double n = Integer.parseInt(br.readLine());
        double sqrt = Math.sqrt(n);
        System.out.println((int)Math.floor(sqrt)); // 구하는 규칙이 제곱근을 반내림한 값이다

    }
}
