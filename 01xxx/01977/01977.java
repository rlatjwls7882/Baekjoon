import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// M², N² 입력
    	int M = (int)Math.ceil(Math.sqrt(Double.valueOf(br.readLine())));
    	int N = (int)Math.sqrt(Double.valueOf(br.readLine()));
    	
    	// M²<=X<=N²인 완전제곱수 X의 합과 최솟값 계산
    	if(N<M)
    		bw.write("-1");
    	else {
    		int sum=0;
    		for(int i=M;i<=N;i++)
    			sum+=i*i;
    		bw.write(sum+"\n"+(M*M));
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class