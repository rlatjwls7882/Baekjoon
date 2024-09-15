import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
    public static void main(String[] args) throws IOException {
    	
    	long N = Long.valueOf(br.readLine());
    	
    	long make=0;
    	for(long i=N-(int)(Math.log10(N)+1)*9;i<N;i++) {
    		if(getSum(i)==N) {
    			make=i;
    			break;
    		}
    	}
    	bw.write(make+"");
    	
        bw.close();
    } // end of main
    
    static long getSum(long N) {
    	long sum=N;
    	while(N!=0) {
    		sum += N%10;
    		N/=10;
    	}
    	return sum;
    } // end of getSum()
} // end of Main class