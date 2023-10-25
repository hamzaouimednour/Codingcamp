import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WeirdAlgorithm {
    public static void main(String[] args) {
        // BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        try {
            line = br.readLine();
        } catch (IOException e) { e.printStackTrace(); }
        
        // Code
        long n = Long.parseLong(line);
        System.out.print(n + " ");
        while(n!=1) {
            n = ((n & 1) == 0) ? n/2 : (n*3)+1;
            System.out.print(n + " ");
        }
    }
}
