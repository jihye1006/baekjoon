import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); //가로
        int M = in.nextInt(); //세로
        int row = 0; // 행
        int col = 0; // 열
        char[][] cas = new char[N][M];
        for (int i = 0; i < N; i++) {
            String str = in.next();
            for (int j = 0; j < M ; j++) {
                cas[i][j] = str.charAt(j);
            }
        }

        // 행에 필요한 경비원 수
        for (int i = 0; i < N; i++) {
            boolean flag = true;
            for (int j = 0; j < M; j++) {
                if (cas[i][j] == 'X') { //경비원이 있으면
                    flag = false; // flag를 거짓으로
                    break;
                }
            }
            if (flag) // flag가 진실일 경우에만
                row++; // row값 더해주기
        }

        //열에 필요한 경비원 수
        for (int j = 0; j < M; j++) {
            boolean flag = true;
            for (int i = 0; i < N; i++) {
                if (cas[i][j] == 'X') { // 경비원이 있으면
                    flag = false; // flag를 거짓으로
                    break;
                }
            }
            if (flag) // flag가 진실일 경우에만
                col++; // col값 더해주기
        }

        // 행과 열 중 더 많은 경비원 출력
        System.out.println(Math.max(row,col));
    }
}