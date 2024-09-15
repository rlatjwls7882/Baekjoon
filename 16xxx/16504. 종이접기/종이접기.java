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
    	
    	// 가로, 세로의 길이 N 입력
    	int N = Integer.valueOf(br.readLine());
    	
    	// 모든 수의 합(마지막에 남는 수) 계산
    	long sum=0;
    	while(N--!=0) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		
    		while(st.hasMoreTokens())
    			sum += Integer.valueOf(st.nextToken());
    	}
    	
    	// 합 출력
    	bw.write(sum+"");
    	bw.close();
    } // end of main
} // end of Main class