import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while(true) {
        	
        	// 마지막항 n
        	long n = Integer.valueOf(br.readLine());
        	
        	if(n==0) break;
        	
        	// 첫항부터 세 항
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	long a1 = Long.valueOf(st.nextToken());
        	long a2 = Long.valueOf(st.nextToken());
        	long a3 = Long.valueOf(st.nextToken());
        	
        	// 첫항부터 N항까지의 합 Sn 계산
        	long Sn=0;
        	
        	// 등차수열인 경우
        	if(a2-a1==a3-a2) {
        		long d = a2-a1;
        		
        		Sn = n*(2*a1+(n-1)*d)/2;
        	}
        	
        	// 등비수열인 경우
        	else {
        		long r = a2/a1;
        		
        		Sn = ((long)Math.pow(r, n)-1)/(r-1)*a1;
        	}
        	
        	bw.write(Sn+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class