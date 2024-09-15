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
    	
    	// A, B 입력
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int A = Integer.valueOf(st.nextToken());
    	int B = Integer.valueOf(st.nextToken());
    	
    	// A, B 비교하여 출력
    	if(A>B)
    		bw.write(">");
    	else if(A<B)
    		bw.write("<");
    	else
    		bw.write("==");
    	
    	bw.close();
    } // end of main
} // end of Main class