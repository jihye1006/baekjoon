import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int nscore = sc.nextInt();
        int P = sc.nextInt();

        Integer[] rank = new Integer[N]; // N개의 숫자가 들어가는 배열 만들기

        for(int i=0;i<N; i++){ // rank 배열에 들어갈 숫자 입력 받기
            rank[i] = sc.nextInt();
        }
        Arrays.sort(rank, Collections.reverseOrder()); //내림차순으로 정렬

        if(N == P && nscore <= rank[rank.length-1]){ // N==P이거나 새로운 점수(nscore)이 rank배열의 마지막 수와 같을 때
            System.out.println("-1"); //-1 출력
        }
        else{ // 위의 경우가 아닐 때
            int r = 1;
            for(int i=0; i<rank.length; i++){ //배열 길이만큼 반복
                if(nscore < rank[i]){ // nscore이 해당 배열값보다 작을 때
                    r++;
                }
                else{ // nscore이 해당 배열값보다 크거나 같을 때
                    break;
                }
            }
            System.out.print(r); // 순위 출력
        }

    }
}
