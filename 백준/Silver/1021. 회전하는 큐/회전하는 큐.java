import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> deque = new LinkedList<Integer>();
        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken()); // 큐의 크기
        int m = Integer.parseInt(st.nextToken()); // 뽑아내려고 하는 수의 개수

        for(int i = 1; i<n+1; i++){ // 큐에 1~n까지 차례대로 넣어주기
            deque.offer(i);
        }
        int[] sel = new int [m]; //뽑으려고 하는 수를 담은 배열

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i<m; i++){
            sel[i] = Integer.parseInt(st.nextToken()); // 뽑을 수 입력 받기
        }

        for(int i = 0; i<m; i++){
            int target = deque.indexOf(sel[i]); //뽑으려고 하는 수의 인덱스
            int half; // 중간값

            if(deque.size() % 2 ==0){ // 짝수일 때
                half = (deque.size() / 2) -1;
            }
            else{
                half = deque.size() / 2;
            }

            if (target <= half){ // 뽑아내려고 하는 수가 중간값보다 작거나 같다면
                for(int j=0; j<target; j++){ //target 수 만큼
                    int num = deque.pollFirst(); //첫번째에 있는 값 num에 넣어줌 + 제거+ 리턴
                    deque.offerLast(num); // num을 맨 뒤에 넣어주기
                    count ++; // 연산 수 ++
                }
            }
            else{ //뽑아내려고 하는 수가 중간값보다 크다면
                for(int j=0; j<deque.size()-target; j++){ //(deque크기- 뽑아내려고 하는 수)만큼 반복
                    int num = deque.pollLast(); // 마지막에 있는 값 num에 넣어줌 + 제거 + 리턴
                    deque.offerFirst(num); // num을 맨 앞에 넣어주기
                    count++; // 연산 수 ++
                }
            }
            deque.pollFirst(); // 첫번째에 있는 값 제거 + 리턴 (뽑으려고 하는 수)

        }
        System.out.println(count); //출력
        
    }
}
