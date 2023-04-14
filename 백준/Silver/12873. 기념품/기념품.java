

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
    static int solution(int i, int mod) { 
        int ans = i;
        ans*=i;
        ans%=mod;
        ans*=i;
        return ans%mod;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> arr = new LinkedList<>();

        for (int i = 1; i <= n; i++) arr.add(i);

        int k = 0;

        for (int i = 1; i < n; i++) {
            int num = (k + solution(i, arr.size()) - 1) % arr.size();
            if (num < 0) num+=arr.size();
            arr.remove(k=num);
        }
        System.out.println(arr.get(0));
    }
}