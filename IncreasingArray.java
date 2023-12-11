import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IncreasingArray {
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
        long holder0 = 0;

        String[] sHolder = new String[Integer.parseInt(line1)];
        Boolean increased = true;
        while(increased){
            long max = 0;
            for(int i = 0; i<line2.length; i++){
                holder0 = 0;
                if(sHolder[i] == null)
                    sHolder[i] = line2[i];
                if(line2.length>i+1){
                    if(Long.parseLong(line2[i]) > Long.parseLong(line2[i+1])){
                        max += Long.parseLong(line2[i]) - Long.parseLong(line2[i+1]);
                        holder0 = 1;
                    }
                    if(holder0 == 1)
                        sHolder[i+1] = line2[i];
                }
            }
            if(max == 0) increased = false;
            holder += max;
            line2 = sHolder;
        }
        System.out.println(holder);


    }
}
