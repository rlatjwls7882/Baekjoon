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
        
        int T = Integer.valueOf(br.readLine());
        while(T-->0) {
        	
        	// 각 문장을 요다의 말로 바꾸어 출력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	String first = st.nextToken();
        	String second = st.nextToken();
        	
        	while(st.hasMoreTokens())
        		bw.write(st.nextToken()+" ");
        	bw.write(first+" "+second+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class