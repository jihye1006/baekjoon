
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = 0;

        if(n==4 || n==7){ // n이 4또는 7인 경우
            result = -1;
        }
        else if(n%5 ==0){ // n이 5의 배수인 경우
            result = n/5;
        }
        else if (n%5 == 1|| n% 5 ==3) { // n을 5로 나눈 나머지가 1또는 3인 경우
            result = (n/5)+1;
        }
        else if(n%5 ==2 || n% 5 ==4){ // n을 5로 나눈 나머지가 2또는 4인 경우
            result = (n/5)+2;
        }
        System.out.println(result);


    }
}
