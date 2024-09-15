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
    	
    	// N, M 입력
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	String N = st.nextToken();
    	int M = Integer.valueOf(st.nextToken());
    	
    	// N을 N번 출력(최대 M자리 이내)
    	if(N.length()*Integer.valueOf(N)<=M) {
    		int intN = Integer.valueOf(N);
            
    		while(intN-->0)
    			bw.write(N);
    	} else {
    		for(int i=0;i<M/N.length();i++)
    			bw.write(N);
    		
    		for(int i=0;i<M%N.length();i++)
    			bw.write(N.charAt(i));
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class