import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 테스트 케이스의 개수 T 입력
    	int T = Integer.valueOf(br.readLine());
    	
    	// n보다 크거나 같은 가장 작은 소수 계산
    	while(T-->0) {
    		
    		long n = Long.valueOf(br.readLine());
    		if(n<2) n=2;
    		
    		while(true) {
    			Boolean isSosu=true;
    			for(int i=2;i<=Math.sqrt(n);i++)
    				if(n%i==0) {
    					isSosu=false;
    					break;
    				}
    			
    			if(!isSosu) n++;
    			else break;
    		}
    		bw.write(n+"\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class