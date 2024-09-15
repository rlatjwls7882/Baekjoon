import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int Q = Integer.valueOf(bf.readLine());
    	
    	while(Q--!=0) {
    		int a = Integer.valueOf(bf.readLine());
    		
    		// 2의 거듭제곱인지 판단
    		int isInvolution = 1;
    		
    		while(a!=0) {
    			if(a%2!=0&&a!=1) {
    				isInvolution = 0;
    				break;
    			}
    			
    			a/=2;
    		}
    		
    		// 출력
    		bw.write(isInvolution+"\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class