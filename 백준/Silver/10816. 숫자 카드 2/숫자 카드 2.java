
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.StringTokenizer;

public class Main {
    public static int n;
    public static int m;

    public static int lower(int key, int[] arr){ // key의 시작 위치를 찾는 함수
        int left = 0; // 배열 시작 위치
        int right = arr.length;
        while (left < right){ // left >= right가 될 때까지
            int mid = (left + right)/2; // 중간값 구하기
            //중간값과 겁색값 비교하기
            if(key <= arr[mid]){ // key값 <= 중간값일 때
                right = mid;
            }
            else{ // key값 > 중간값일 때
                left = mid +1;
            }
        }
        return right; // right가 lower bound가 됨
    }

    public static int upper(int key, int[] arr){ // key보다 처음으로 큰 값의 위치를 찾는 함수
        int left = 0;
        int right = arr.length;
        while (left < right){ // left >= right가 될 때까지
            int mid = (left + right)/2; // 중간값 구하기
            if(key < arr[mid]){ // key값 < 중간값일 때
                right = mid;
            }
            else{ // key값 >= 중간값일 때
                left = mid +1;
            }
        }
        return right; // right가 upper bound가 됨
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine()); //상근이가 가진 숫자카드
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine()); // 띄어쓰기 기준으로 문자열 분리
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken()); // arr 배열에 입력 받은 숫자 넣어주기
        }

        Arrays.sort(arr); // 오름차순으로 정렬

        m = Integer.parseInt(br.readLine()); //상근이 숫자카드와 비교할 m 숫자카드
        st = new StringTokenizer(br.readLine());
        for(int i=0; i < m; i++){ // m 길이만큼
            int key = Integer.parseInt(st.nextToken()); // 비교할 key값 입력 받기 (= m)
            int low = lower(key, arr); // lower함수 통해 key값의 시작위치 찾기
            int up = upper(key, arr); // upper함수 통해 key값보다 처음으로 큰 값의 위치 찾기
            sb.append(up - low).append(" "); // (key값보다 처음으로 큰 값의 위치 - key값 시작 위치) = key값의 갯수 

        }
        System.out.println(sb.toString());

    }
}
