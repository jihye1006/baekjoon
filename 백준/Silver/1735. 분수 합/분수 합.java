
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int GCD(int a, int b) { //최대공약수를 구해주는 함수
        if(a%b==0) {
            return b;
        }
        return GCD(b, a%b);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //분수1
        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());

        //분수2
        st = new StringTokenizer(br.readLine());
        int n3 = Integer.parseInt(st.nextToken());
        int n4 = Integer.parseInt(st.nextToken());

        int ans1, ans2;
        ans1 = n1*n4 + n2*n3; //분자 통분
        ans2 = n2*n4; //분모의 곱
        int gcd = GCD(ans1,ans2); // 나눠주기위해 최대공약수 구하기

        System.out.println(ans1/gcd + " " + ans2/gcd); // 기약분수로 만들기위해 최대공약수로 나눠줌
    }
}
