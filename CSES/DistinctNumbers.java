import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;
 
public class DistinctNumbers {
    public static void main(String[] args) {
        // BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l1 = 0;
        String[] l2 = {};
        try {
            l1 =Integer.parseInt(br.readLine());
            l2 = br.readLine().split(" ");
        } catch (IOException e) { e.printStackTrace(); }
 
        Set<String> xs = new LinkedHashSet<String>(); 
        for(int i = 0; i<l1; i++)
            xs.add(l2[i]);
        System.out.println(xs.size());
 
    }
}
