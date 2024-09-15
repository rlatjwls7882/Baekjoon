import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	for(int i=1000;i<10000;i++) {
    		
    		// 10진수
    		int tmp=i, sum10=0;
    		
    		while(tmp!=0) {
    			sum10+=tmp%10;
    			tmp/=10;
    		}
    		
    		// 12진수
    		int sum12=0;
    		tmp=i;
    		
    		while(tmp!=0) {
    			sum12+=tmp%12;
    			tmp/=12;
    		}
    		
    		if(sum10!=sum12) continue;
    		
    		// 16진수
    		int sum16=0;
    		tmp=i;
    		
    		while(tmp!=0) {
    			sum16+=tmp%16;
    			tmp/=16;
    		}
    		
    		if(sum10!=sum16) continue;
    		
    		// 각 자리수의 합이 같은 숫자 출력
    		bw.write(i+"\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class