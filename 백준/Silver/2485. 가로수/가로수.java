
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    static int GCD (int a, int b){ //최대공약수를 구하는 함수
        if(b==0){
            return a;
        }
        else return GCD(b, a%b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] road = new int[n];

        for(int i=0; i<n; i++){
            road[i] = Integer.parseInt(br.readLine()); // 가로수 위치 입력받기
        }

        Arrays.sort(road); //정렬
        int gcd = 0;
        for(int i=0; i<n-1; i++){
            int distance = road[i+1] - road[i]; //거리 구하기
            gcd = GCD(distance, gcd); //거리와 현재 최대 공약수로 최대 공약수 구하기
        }
        System.out.println((road[n-1]-road[0])/gcd + 1 - (road.length));
        //(최대 위치 - 최소 위치)/최대공약수 + 1 = 전체 가로수의 수
        //road.length를 빼는 이유는 전체 가로수의 수에서 원래 있던 가로수를 빼야 추가할 가로수의 수가 나오기 때문

    }
}
