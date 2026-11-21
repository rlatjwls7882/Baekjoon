import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
    private static ArrayList<Integer> solveSumPairs(int target) {
    	
    	ArrayList<Integer> answer = new ArrayList<Integer>();
    	
    	for(int i=1;i<target;i++)
    		for(int j=i+1;j<target;j++)
    			if(i+j==target) {
    				answer.add(i);
    				answer.add(j);
    			}
    	
    	return answer;
    } // end of solveSumPairs
    
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numCases = Integer.valueOf(br.readLine());

        for(int n = 0; n < numCases; n++) {
            int target = Integer.valueOf(br.readLine());
            
            ArrayList<Integer> answer = solveSumPairs(target);
            
            bw.write("Pairs for "+target+": ");
            
            for (int i = 0; i<answer.size(); i+=2 ) {
            	if (i>0) 
            		bw.write(", ");
            	bw.write(answer.get(i) + " " + answer.get(i+1));
            }
            bw.write("\n");
        }
        
        bw.close();
    } // end of main
} // end of Class