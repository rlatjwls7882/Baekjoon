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
    	
    	// 컵개수 N, 공 위치 X, 컵 변경 횟수 K
    	StringTokenizer st = new StringTokenizer(bf.readLine());
    	int N = Integer.valueOf(st.nextToken());
    	int X = Integer.valueOf(st.nextToken());
    	int K = Integer.valueOf(st.nextToken());
    	
    	while(K--!=0) {
    		st = new StringTokenizer(bf.readLine());
    		int A = Integer.valueOf(st.nextToken());
    		int B = Integer.valueOf(st.nextToken());
    		
    		// 공 위치 변경
    		if(A==X) X=B;
    		else if(B==X) X=A;
    	}
    	
    	bw.write(X+"");
    	bw.close();
    } // end of main
} // end of Main class