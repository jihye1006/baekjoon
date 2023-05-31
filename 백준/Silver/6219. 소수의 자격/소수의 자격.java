
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken()); //포함하는 소수
        int count = 0;
        int max = 4000000;

        boolean isPrime[] = new boolean[max+1];

        //에라토스테네스의 체를 이용하여 소수가 아닌 것을 false로 바꿔줌
        for (int i = 2; i <= max; i++) {
            isPrime[i] = true;
        }
        for(int i=2; i<=max; i++){
            for(int j = 2*i; j<=max; j +=i){
                isPrime[j] = false;
            }
        }
        for(int i=a; i<=b; i++){
            if(isPrime[i]){ // 소수라면
                String s = Integer.toString(i); // string으로 바꿔줌
                if(s.contains(Integer.toString(d))){ //d 숫자를 포함하고 있다면
                    count ++;
                }
            }
        }
        System.out.println(count);
    }
}
