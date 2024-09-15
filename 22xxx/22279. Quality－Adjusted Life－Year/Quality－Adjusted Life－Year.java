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
    	
    	// 일정한 인생의 질의 기간
    	int N = Integer.valueOf(br.readLine());
    	
    	// 삶의 질 반영 수명(QALY) 계산
    	double QALY=0;
    	
    	while(N--!=0) {
    		
    		// 인생의 질 q, 기간 y
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		double q = Double.valueOf(st.nextToken());
    		double y = Double.valueOf(st.nextToken());
    		
    		QALY += q*y;
    	}
    	
    	// QALY 출력
    	bw.write(QALY+"");
    	bw.close();
    } // end of main
} // end of Main class