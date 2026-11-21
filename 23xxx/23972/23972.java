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
    	
    	// K, N 입력
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	long K = Long.valueOf(st.nextToken());
    	long N = Long.valueOf(st.nextToken());
    	
    	// 항상 민주가 손해를 보는 경우
    	if(N==1)
    		bw.write("-1");
    	
    	// 손해보지 않기 위해 가지고 있어야 하는 금액 X 출력
    	
    	// (X-K)N >= X
    	// ∴ X >= KN/(N-1)
    	else
    		bw.write(K*N/(N-1)+(K*N%(N-1)>0 ? 1 : 0)+"");
    	
    	bw.close();
    } // end of main
} // end of Main class