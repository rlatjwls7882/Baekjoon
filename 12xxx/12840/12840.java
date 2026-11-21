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
    	
    	// 현재 시간 입력
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int currH = Integer.valueOf(st.nextToken());
    	int currM = Integer.valueOf(st.nextToken());
    	int currS = Integer.valueOf(st.nextToken());
    	
    	// 쿼리의 개수 입력
    	int q = Integer.valueOf(br.readLine());
    	
    	while(q--!=0) {
    		st = new StringTokenizer(br.readLine());
    		
    		// 쿼리의 T가 1인 경우
    		if(st.nextToken().equals("1"))
    			currS += Integer.valueOf(st.nextToken());
    		
    		// 쿼리의 T가 2인 경우
    		else if(st.hasMoreTokens())
    			currS -= Integer.valueOf(st.nextToken());
    		
    		// 쿼리의 T가 3인 경우
    		else
    			bw.write(currH+" "+currM+" "+currS+"\n");
    		
    		// 0 ≤ h ≤ 23, 0 ≤ m ≤ 59, 0 ≤ s ≤ 59
    		if(currS<0) {
    			currM += currS/60-1;
    			currS = currS%60+60;
    		}
    		
    		if(currS>59) {
    			currM += currS/60;
    			currS %= 60;
    		}
    		
    		if(currM<0) {
    			currH += currM/60-1;
    			currM = currM%60+60;
    		}
    		
    		if(currM>59) {
    			currH += currM/60;
    			currM %= 60;
    		}
    		
    		if(currH<0)
    			currH = currH%24+24;
    		
    		if(currH>23)
    			currH %= 24;
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class