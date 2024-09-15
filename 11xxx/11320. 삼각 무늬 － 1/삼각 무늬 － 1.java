import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 테스트 케이스 T
    	int T = Integer.valueOf(bf.readLine());
    	
    	while(T--!=0) {
    		StringTokenizer st = new StringTokenizer(bf.readLine());
    		int A = Integer.valueOf(st.nextToken());
    		int B = Integer.valueOf(st.nextToken());
    		
    		bw.write((int)Math.ceil((double)A*A/(B*B))+"\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class