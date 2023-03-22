import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String[] colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(colors));

        int first = list.indexOf(sc.next())*10;
        int second = list.indexOf(sc.next());
        int third = list.indexOf(sc.next());

        System.out.println((long)((first + second)*Math.pow(10, third)));
    }
}
