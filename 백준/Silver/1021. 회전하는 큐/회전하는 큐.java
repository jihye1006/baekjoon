
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 덱의 사이즈
        int M = Integer.parseInt(st.nextToken()); // 찾을 원소의 개수

        Deque<Integer> deq = new LinkedList<>(); // 양방향으로 순회 하므로 덱 선언

        for (int i = 1; i < N + 1; i++) { // 원소 1부터 N까지 덱에 추가
            deq.add(i);
        }

        st = new StringTokenizer(br.readLine());

        int count = 0; // 연산 2와 연산 3의 최소값
        int count_2 = 0;
        int count_3 = 1;

        int[] num_location = new int[M]; // 찾을 원소 위치를 담을 배열

        for (int i = 0; i < M; i++) {



        }




        for (int i = 0; i < M; i++) {
            num_location[i] = Integer.parseInt(st.nextToken());// 배열에 원소 위치 입력

            if (deq.peek() == num_location[i]) { // 덱의 맨 앞의 값이 찾을 원소의 위치 라면
                deq.remove(); // 연산 1 == 첫번째 원소를 뽑아냄
            }
            else {
                Iterator<Integer> it_2 = deq.iterator(); // 덱을 순회 하기 위해 Iterator 이용
                while (it_2.hasNext()) { //
                    if(it_2.next() == num_location[i]){
                        break;
                    }
                    else{
                        count_2++;
                    }
                }
                Iterator<Integer> it_3 = deq.descendingIterator(); // 역순회
                while (it_3.hasNext()) {
                    if(it_3.next() == num_location[i]){
                        break;
                    }
                    else{
                        count_3++;
                    }
                }

                if(count_2> count_3){
                    count += count_3;
                }
                else{
                    count += count_2;
                }


                if (count_2 >= count_3) {
                    for (int j = 0; j < count_3; j++) {
                        deq.addFirst(deq.removeLast()); // 연산 2 == 왼쪽으로 한 칸 이동
                    }
                    deq.remove();
                }
                else {
                    for (int j = 0; j < count_2; j++) {
                        deq.addLast(deq.removeFirst()); // 연산 3 == 오른쪽으로 한 칸 이동
                    }
                    deq.remove();
                }
                count_2 = 0;
                count_3 = 1;

            }
        }
        System.out.print(count);
    }
}


