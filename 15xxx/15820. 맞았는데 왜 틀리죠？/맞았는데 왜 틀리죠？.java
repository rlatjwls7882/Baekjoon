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
    	
    	// 샘플 테스트케이스 S1, 시스템 테스트케이스 S2
    	StringTokenizer st = new StringTokenizer(bf.readLine());
    	int S1 = Integer.valueOf(st.nextToken());
    	int S2 = Integer.valueOf(st.nextToken());
    	
    	// 샘플 테스트케이스 검사
    	boolean isSampleWrong=false;
    	while(S1--!=0&&!isSampleWrong) {
    		st = new StringTokenizer(bf.readLine());
    		String tmp1 = st.nextToken();
    		String tmp2 = st.nextToken();
    		
    		if(!tmp1.equals(tmp2))
    			isSampleWrong=true;
    	}
    	
    	// 시스템 테스트케이스 검사
    	boolean isSystemWrong=false;
    	while(S2--!=0&&!isSampleWrong&&!isSystemWrong) {
    		st = new StringTokenizer(bf.readLine());
    		String tmp1 = st.nextToken();
    		String tmp2 = st.nextToken();
    		
    		if(!tmp1.equals(tmp2))
    			isSystemWrong=true;
    	}
    	
    	// 출력
    	if(isSampleWrong)
    		bw.write("Wrong Answer");
    	else if(isSystemWrong)
    		bw.write("Why Wrong!!!");
    	else
    		bw.write("Accepted");
    	
    	bw.close();
    } // end of main
} // end of Main class