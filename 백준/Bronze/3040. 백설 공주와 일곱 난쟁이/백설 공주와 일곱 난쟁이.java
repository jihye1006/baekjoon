import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int [] person = new int[9]; //
        int lier1 = 0; // 난쟁이가 아닌 사람1
        int lier2 = 0; // 난쟁이가 아닌 사람2
        int sum = 0; // 모두 더한 값

        for(int i = 0; i<9; i++){
            person[i] = sc.nextInt(); // 9명 숫자 입력받기
            sum += person[i]; // sum = 모자에 쓰인 숫자 모두 더한 값
        }
        for(int i = 0; i < person.length; i++){ 
            for(int j = 1; j < 9; j++){
                if(person[i] + person[j] == sum - 100){ // 두 숫자를 더한 값이 총합에서 100을 뺀 숫자와 같다면
                    lier1 = i; // 해당 배열값이 난쟁이가 아닌 사람1
                    lier2 = j; // 해당 배열값이 난쟁이가 아닌 사람2
                    break;
                }
            }
        }
        for(int i = 0; i < person.length; i++){
            if(i == lier1 || i == lier2){ // lier인 경우 출력하지 않고 계속
                continue;
            }
            System.out.println(person[i]);
        }
    }
}
