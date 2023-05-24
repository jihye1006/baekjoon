
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[] card;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine()); // 상근이가 가지고 있는 숫자 카드의 개수
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        card = new int[n];

        for(int i=0; i<n; i++){
            card[i] = Integer.parseInt(st.nextToken()); // 상근이 카드의 숫자 입력받기
        }
        Arrays.sort(card); //오름차순 정렬

        int m = Integer.parseInt(br.readLine()); // 비교할 카드의 개수
        int [] card2 = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++){
            card2[i] = Integer.parseInt(st.nextToken()); // 비교할 카드의 숫자 입력 받기
        }
        for(int k : card2){
            bw.write(BinarySearch(k, n-1, 0)+" "); // BinarySearch 함수 실행
        }
        br.close();
        bw.flush();
    }
    static int BinarySearch(int card2, int high, int low){
        int mid = (high+low)/2;
        if(card[mid]!=card2 && high == low){ // 카드가 존재하지 않으면
            return 0;
        }
        if(card[mid] == card2){ //카드가 존재하면 1
            return 1;
        }else if(card[mid]>card2){ 
            return BinarySearch(card2,mid,low);
        }else{
            return BinarySearch(card2, high, mid+1);
        }
    }
}
