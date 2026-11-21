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
    	
    	// N 입력
    	int N = Integer.valueOf(br.readLine());
    	
    	while(N--!=0) {
    		// T, str 입력
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int T = Integer.valueOf(st.nextToken());
    		String str = st.nextToken();
    		
    		// str을 T번 입력
    		while(T--!=0)
    			bw.write(str+"");
    		
    		bw.write("\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class