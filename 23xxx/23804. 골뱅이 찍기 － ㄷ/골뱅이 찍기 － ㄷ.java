import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 크기 N 입력
    	int N = Integer.valueOf(br.readLine());
    	
    	// @@@@@
    	for(int i=0;i<N;i++) {
    		
    		for(int j=0;j<N;j++)
    			bw.write("@@@@@");
    		
    		bw.write("\n");
    	}
    	
    	// @
    	// @
    	// @
    	// @
    	for(int i=0;i<N*3;i++) {
    		
    		for(int j=0;j<N;j++)
    			bw.write("@");
    		
    		bw.write("\n");
    	}
    	
    	// @@@@@
    	for(int i=0;i<N;i++) {
    		
    		for(int j=0;j<N;j++)
    			bw.write("@@@@@");
    		
    		bw.write("\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class