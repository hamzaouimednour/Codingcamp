import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DiceCombinations {
    public static void main(String[] args) {
        // BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long n = 0;
        try {
            n = Long.parseLong(br.readLine());
        } catch (IOException e) { e.printStackTrace(); }

        int dice = 0;
        if(n != 0) {
            if(n!=1)
                for(int i = 1; i < 7; i++) {
                    if(i<=n){
                        // dice: 1+x1+x2+...
                        if(i + (n-i) == n) {
                            ++dice;
                        }
                    }
                }
        
            // n: 1
            // dice: n
            if(dice!=0 || n==1) ++dice;
        }
        System.out.println(dice);
    }
}
