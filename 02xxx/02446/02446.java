import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// N 입력
    	int N = Integer.valueOf(br.readLine());
    	
    	// *****
    	//  ***
    	//   *
    	for(int i=N;i>0;i--) {
    		
    		for(int j=N;j>i;j--)
    			bw.write(" ");
    		
    		for(int j=i*2-1;j>0;j--)
    			bw.write("*");
    		
    		bw.write("\n");
    	}
    	
    	//  ***
    	// *****
    	for(int i=2;i<=N;i++) {
    		
    		for(int j=i;j<N;j++)
    			bw.write(" ");
    		
    		for(int j=i*2-1;j>0;j--)
    			bw.write("*");
    		
    		bw.write("\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class