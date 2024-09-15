import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.valueOf(br.readLine());
        
        if(N%2==0) bw.write("I LOVE CBNU");
        else {
        	
        	// *******
        	for(int i=0;i<N;i++)
        		bw.write("*");
        	bw.write("\n");
        	
        	//    *
        	for(int i=0;i<N/2;i++)
        		bw.write(" ");
        	bw.write("*\n");
        	
        	//   * *
        	//  *   *
        	// *     *
        	for(int i=0;i<N/2;i++) {
        		for(int j=i;j<N/2-1;j++)
        			bw.write(" ");
        		bw.write("*");
        		
        		for(int j=0;j<(i+1)*2-1;j++)
        			bw.write(" ");
        		bw.write("*\n");
        	}
        }
        
        bw.close();
    } // end of main
} // end of Main class