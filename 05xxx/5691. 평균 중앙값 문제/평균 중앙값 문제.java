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
    	
    	while(true) {
    		String string = bf.readLine();
    		
    		// A, B가 0일때 종료
    		if(string.equals("0 0")) break;
    		
    		// A, B 입력
    		StringTokenizer st = new StringTokenizer(string);
    		int A = Integer.valueOf(st.nextToken());
    		int B = Integer.valueOf(st.nextToken());
    		
    		// 각각의 케이스마다의 C 계산
    		int caseABC = 2*B-A;
    		int caseACB = (A+B)/2;
    		int caseCAB = 2*A-B;
    		
    		// 제일 작은 C 출력
    		if(caseABC<=caseACB&&caseABC<=caseCAB)
    			bw.write(caseABC+"\n");
    		else if(caseACB<=caseABC&&caseACB<=caseCAB)
    			bw.write(caseACB+"\n");
    		else
    			bw.write(caseCAB+"\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class