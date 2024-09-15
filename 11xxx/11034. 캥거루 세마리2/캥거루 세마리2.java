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
    	
    	String kangaroos;
    	
    	while((kangaroos=bf.readLine())!=null) {
    		
    		// 캥거리 위치 입력
    		StringTokenizer st = new StringTokenizer(kangaroos);
    		int A = Integer.valueOf(st.nextToken());
    		int B = Integer.valueOf(st.nextToken());
    		int C = Integer.valueOf(st.nextToken());
    		
    		// 캥거루가 움직인 최대 거리 출력
    		if(C-B>B-A)
    			bw.write(C-B-1+"\n");
    		else
    			bw.write(B-A-1+"\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class