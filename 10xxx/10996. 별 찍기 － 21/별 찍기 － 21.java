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
    	
    	// 별찍기
    	for(int i=1;i<=N*2;i++) {
    		
    		// 짝수번째 줄
    		if(i%2==0) {
    			
    			for(int j=1;j<=N;j++) {
    				
    				if(j%2==0)
    					bw.write("*");
    				else
    					bw.write(" ");
    			} // end of for(int j=1;j<=N;j++)
    			
    			bw.write("\n");
    		}
    		
    		// 홀수번째 줄
    		else {
    			
    			for(int j=1;j<=N;j++) {
    				
    				if(j%2==0)
    					bw.write(" ");
    				else
    					bw.write("*");
    			} // end of for(int j=1;j<=N;j++)
    			
    			bw.write("\n");
    		}
    	} // end of for(int i=1;i<=N*2;i++)
    	
    	bw.close();
    } // end of main
} // end of Main class