
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>(); //hashmap
        int n = Integer.parseInt(br.readLine()); // 펼쳐진 카드의 개수

        for(int i = 0; i<n; i++){ // 카드 개수 만큼 반복
            String[] fruit = br.readLine().split(" "); // 공백을 기준으로 fruit 배열 
            if(map.containsKey(fruit[0])){ // map에 fruit[0] (즉 과일명)이 같은게 있다면
                map.put(fruit[0], map.get(fruit[0])+Integer.parseInt(fruit[1]));// <과일명, 전 map의 숫자 + 현재 숫자> map 에 put
            }
            else{ // 동일한 과일명이 없는 경우
                map.put(fruit[0], Integer.parseInt(fruit[1])); // 새로 map 추가해주기
            }
        }
        if(map.containsValue(5)){ // value 값이 5가 있다면
            System.out.println("YES");
        }
        else{ // 없다면
            System.out.println("NO");
        }
    }
}
