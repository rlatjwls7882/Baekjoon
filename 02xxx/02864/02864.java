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
    	String A = st.nextToken();
    	String B = st.nextToken();
    	
    	// A+B의 최솟값 출력
    	bw.write(Integer.valueOf(A.replace("6", "5"))
    			+Integer.valueOf(B.replace("6", "5"))
    			+" ");
    	
    	
    	// A+B의 최댓값 출력
    	bw.write(Integer.valueOf(A.replace("5", "6"))
    			+Integer.valueOf(B.replace("5", "6"))
    			+" ");
    	
    	bw.close();
    } // end of main
} // end of Main class