import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Apartments {
    public static void main(String[] args) {
        // BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] l1 = {};
        String[] l2 = {};
        String[] l3 = {};
        try {
            l1 = br.readLine().split(" ", 3);
            l2 = br.readLine().split(" ");
            l3 = br.readLine().split(" ");
        } catch (IOException e) { e.printStackTrace(); }
 
        int count = 0;
        for(int d = 0; d < Long.parseLong(l1[0]); d++) {
            for(int a = 0; a < Long.parseLong(l1[1]); a++) {
                if( (l2[d] != null && l3[a] != null)
                    && (
                        Long.parseLong(l2[d]) == Long.parseLong(l3[a])
                        || (Long.parseLong(l1[2]) != 0 && Math.abs(Long.parseLong(l2[d]) - Long.parseLong(l3[a])) <= Long.parseLong(l1[2]))
                    )
                ){
                    l2[d] = null;
                    l3[a] = null;
                    ++count;
                }
            }
        }
        System.out.println(count);
    }
}
