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
        while(T--!=0) {
        	
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	long A = Long.valueOf(st.nextToken());
        	String opt = st.nextToken();
        	long B = Long.valueOf(st.nextToken());
        	st.nextToken();
        	long outcome = Long.valueOf(st.nextToken());
        	
        	// 올바른 수식인지 확인
        	if(opt.equals("+")) A+=B;
        	else if(opt.equals("-")) A-=B;
        	else if(opt.equals("*")) A*=B;
        	else A/=B;

        	if(A==outcome) bw.write("correct\n");
        	else bw.write("wrong answer\n");
        }
        	
        bw.close();
    } // end of main
} // end of Main class