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
    	
    	while(true) {
    		String string = br.readLine();
    		
    		// 0 0 입력시 종료
    		if(string.equals("0 0")) break;
    		
    		// 양의 정수 B, N 입력
    		StringTokenizer st = new StringTokenizer(string);
    		int B = Integer.valueOf(st.nextToken());
    		int N = Integer.valueOf(st.nextToken());
    		
    		// B와 가장 가까운 A 출력
    		int A1 = (int)Math.floor(Math.pow(B, 1.0/N));
    		int A2 = A1+1;
    		
    		if(Math.abs(B-Math.pow(A1, N))<Math.abs(B-Math.pow(A2, N)))
    			bw.write(A1+"\n");
    		else
    			bw.write(A2+"\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class