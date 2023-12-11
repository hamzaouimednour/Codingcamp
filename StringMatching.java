import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class StringMatching {
    public static void main(String[] args) {
        // BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String l1 = "";
        String l2 = "";
        try {
            l1 = br.readLine();
            l2 = br.readLine();
        } catch (IOException e) { e.printStackTrace(); }
        
        // Code
        System.out.println(l1.split(Pattern.quote(l2)).length -1);
    }
}
