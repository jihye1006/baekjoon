
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static long getGCD(long a, long b) { // 최대공약수
        if (a % b == 0) {
            return b;
        } else {
            return getGCD(b, a % b);
        }
    }
    public static long getGCD(long[] arr) { // 최대공약수
        if (arr.length < 2) {
            return arr[0];
        }
        long result = arr[0];
        for (int i = 1; i < arr.length; ++i) {
            result = getGCD(result, arr[i]);
        }
        return result;
    }

    public static long getLCM(long a, long b) { // 최소공배수
        return a * b / getGCD(a, b);
    }

    public static long getLCM(long[] arr) { // 최소공배수
        if (arr.length < 2) {
            return arr[0];
        }
        long result = arr[0];
        for (int i = 1; i < arr.length; ++i) {
            result = getLCM(result, arr[i]);
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        long[] coin1 = new long[n]; //분자
        long[] coin2 = new long[n]; //분모

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            long gcd = getGCD(a, b);
            coin1[i] = a/gcd;
            coin2[i] = b/gcd;

        }
        long resultnum = getLCM(coin2);
        long resultnum2 = getGCD(coin1);
        System.out.println(resultnum2 + " "+ resultnum);
    }
}

