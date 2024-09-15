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
    	
    	// 정수의 개수 N, 나누는 수 M 입력
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int N = Integer.valueOf(st.nextToken());
    	int M = Integer.valueOf(st.nextToken());
    	
    	// N개의 정수의 곱을 M으로 나눈 나머지 sum 계산
    	st = new StringTokenizer(br.readLine());
    	
    	long sum=1;
    	for(int i=0;i<N;i++) {
    		sum *= Integer.valueOf(st.nextToken())%M;
    		sum%=M;
    	}
    	
    	// sum 출력
    	bw.write(sum%M+"");
    	bw.close();
    } // end of main
} // end of Main class