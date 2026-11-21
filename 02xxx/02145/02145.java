import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while(true) {
        	int N = Integer.valueOf(br.readLine());
        	if(N==0) break;
        	
        	// 한 자릿수가 될때까지 반복
        	while(N>=10) {
        		int sum=0;
        		
        		while(N!=0) {
        			sum += N%10;
        			N/=10;
        		}
        		N=sum;
        	}
        	bw.write(N+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class