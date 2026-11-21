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
    	
    	// N M 입력
    	StringTokenizer st = new StringTokenizer(bf.readLine());
    	int N = Integer.valueOf(st.nextToken());
    	int M = Integer.valueOf(st.nextToken());
    	
    	// 출력
    	for(int i=1;i<=N*M;i++) {
    		bw.write(i+"");
    		
    		// 마지막에만 개행
    		if(i%M==0) bw.write("\n");
    		else bw.write(" ");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class