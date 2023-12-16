import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IncreasingArray2 {
        public static void main(String[] args) {
        // BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = "";
        String[] line2 = {};
        try {
            line1 = br.readLine();
            line2 = br.readLine().split(" ");
        } catch (IOException e) { e.printStackTrace(); }
        
        // Code
        long holder = 0;
        for(int i = 0; i<line2.length; i++){
            if(line2.length>i+1){
                if(Long.parseLong(line2[i]) > Long.parseLong(line2[i+1])){
                    holder += Long.parseLong(line2[i]) - Long.parseLong(line2[i+1]);
                    line2[i+1] = line2[i];
                }
            }
        }
        System.out.println(holder);


    }
}
