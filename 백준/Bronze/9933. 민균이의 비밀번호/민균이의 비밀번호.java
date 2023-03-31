import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 입력 받을 단어의 수
        String[] s = new String[n]; // 단어를 넣어줄 배열

        for (int i = 0; i < n; i++) { // 단어 입력받기
            s[i] = sc.next();
        }

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length; j++) {
                StringBuilder sb = new StringBuilder(s[j]);
                if (s[i].equals(sb.reverse().toString())) { // 입력 받은 문자열과 뒤집어서 쓴 문자열이 같은 경우
                    System.out.print(s[i].length() + " " + s[i].charAt(s[i].length()/2));
                    // 문자열의 길이 + 문자열의 가운데 글자 출력
                    return;
                }
            }
        }
    }
}
