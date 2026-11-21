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
    	
    	int T = Integer.valueOf(bf.readLine());
    	
    	while(T--!=0) {
    		StringTokenizer st = new StringTokenizer(bf.readLine());
    		int N = Integer.valueOf(st.nextToken());
    		int C = Integer.valueOf(st.nextToken());
    		
    		// 날짜 계산
    		int day= (N+C-1)/C;
    		
    		// 날짜 출력
    		bw.write(day+"\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class