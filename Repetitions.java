import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Repetitions {
    public static void main(String[] args) {
        // BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        try {
            line = br.readLine();
        } catch (IOException e) { e.printStackTrace(); }
        
        // Code
        String seq = line;
        int max = 1;
        int holder = 1;
        for(int i = 0; i<seq.length(); i++){
            if(seq.length()>i+1)
                if(seq.charAt(i) == seq.charAt(i+1)){
                    max += 1;
                    if(max>holder)
                        holder = max;
                }else{
                    max = 1;
                }
        }
        System.out.println(holder);
    
    }
}
