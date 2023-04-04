
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<>();
        int n = Integer.parseInt(br.readLine()); //카드가 들어간 큐 선언

        for(int i = 1; i<n+1; i++){ // 큐에 1~n까지 차례대로 넣어주기
            q.offer(i);
        }

        while(q.size() > 1){ // 하나만 남기 전까지
            q.poll(); // 첫번째값 삭제
            q.offer(q.poll()); // 다시 남은 것중 첫번째값 삭제후 맨 뒤에 넣어주기
        }
        System.out.println(q.poll()); //하나 남은 값 출력
        br.close();
    }
}
