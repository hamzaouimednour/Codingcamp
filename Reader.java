import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {
    public static void main(String[] args) {
        // Reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        try {
            line = br.readLine();
        } catch (IOException e) { e.printStackTrace(); }
        
        // Code
        long n = Long.parseLong(line);
        System.out.print(n + " ");
    }
}
