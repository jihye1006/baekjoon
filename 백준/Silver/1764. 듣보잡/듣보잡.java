
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<String> answer = new ArrayList<>(); // 듣보잡 명단을 넣을 arraylist

        int n = Integer.parseInt(st.nextToken()); // 듣도 못한 사람의 수
        int m = Integer.parseInt(st.nextToken()); // 보도 못한 사람의 수
        int count = 0; // 듣보잡의 수를 세기위한 count

        HashMap<String, String> map = new HashMap<>();

        for(int i=0; i<n; i++){
            map.put(br.readLine(),"one"); //듣도 못한 사람의 명단
        }
        for(int i=0; i<m; i++){
            String see = br.readLine(); // 보도 못한 사람의 명단
            if(map.containsKey(see)){ // 듣도 못한 사람이름 = 보도 못한 사람이름
                answer.add(see); // answer 에 추가해줌
                count++; // 듣보잡의 수
            }
        }
        Collections.sort(answer); // 사전 순서대로 정렬
        System.out.println(count); // 듣보잡의 수
        for(int i=0; i<count; i++){
            System.out.println(answer.get(i));
        }
        br.close();
    }
}
