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
    	
    	// 테스트 케이스의 수 입력
    	int T = Integer.valueOf(bf.readLine());
    	
    	while(T--!=0) {
    		int N = Integer.valueOf(bf.readLine()); 
    		StringTokenizer st = new StringTokenizer(bf.readLine());

    		// 최대, 최소 계산
    		int max=-1_000_000, min=1_000_000;
   
    		while(N--!=0) {
    			int tmp = Integer.valueOf(st.nextToken());
    			if(max<tmp) max=tmp;
    			if(min>tmp) min=tmp;
    		}
    		// 각 테스트 케이스의 최대, 최소 출력
    		bw.write(min+" "+max+"\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class