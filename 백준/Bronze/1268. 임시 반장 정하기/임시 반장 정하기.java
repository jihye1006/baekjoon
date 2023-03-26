import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 학생 몇명을 입력 받을지 입력받기
        int [][] table = new int[N][5]; // N명과 5학년까지를 나타내는 2차원 배열

        for(int i = 0; i < N; i++){
            for(int j = 0; j < 5; j++){
                table[i][j]= sc.nextInt(); // 몇반이었는지 입력 받기
            }
        }
        int [] arr = new int[N];

        for(int i = 0; i < N; i++){ //학생 수만큼
            HashSet<Integer> set = new HashSet<Integer>(); // 중복되는 학생 제거
            for(int j = 0; j<5; j++){ //학년
                for(int r = 0; r < N; r++){ //비교할 다른 학생
                    if(i == r){
                        continue;
                    }
                    else if(table[i][j] == table[r][j]){ // 반이 같았던 학생이면
                        set.add(r);
                    }
                }
            }
            arr[i]= set.size();
        }
        int max = arr[0]; // 최댓값 임의로 설정
        int num = 0; //학생 번호
        for(int a=1; a<arr.length; a++){
            if(max<arr[a]){ //최댓값보다 크면
                max = arr[a]; //최댓값 변경
                num = a; //학생번호 변경
            }
        }
        System.out.println(num+1); //0부터 시작해서 1을 더해줌
    }
}
