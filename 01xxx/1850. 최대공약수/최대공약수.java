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
    	
    	// 1의 개수 A, B 입력
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	long A = Long.valueOf(st.nextToken());
    	long B = Long.valueOf(st.nextToken());
    	
    	// 1이 A개인 수와 1이 B개인 수의 최대공약수 계산
    	while(B!=0) {
    		long tmp = A%B;
    		A=B;
    		B=tmp;
    	}
    	
    	while(A-->0)
    		bw.write("1");
    	
    	bw.close();
    } // end of main
} // end of Main class