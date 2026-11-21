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
    	
    	// 두 정수 A, B 입력
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	long A = Long.valueOf(st.nextToken());
    	long B = Long.valueOf(st.nextToken());
    	
    	if(A>B) {
    		long tmp=A;
    		A=B;
    		B=tmp;
    	}
    	
    	// A와 B 사이의 정수의 개수와 종류 출력
    	bw.write(Math.max(0, B-A-1)+"\n");
    	
    	while(++A<B)
    		bw.write(A+" ");
    	
    	bw.close();
    } // end of main
} // end of Main class