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
    		
    		// A, WorD, B 입력
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int A = Integer.valueOf(st.nextToken());
    		String WorD = st.nextToken();
    		int B = Integer.valueOf(st.nextToken());
    		
    		// 0 ? 0 입력시 종료
    		if(A==0&&B==0) break;
    		
    		// A-B 계산
    		if(WorD.equals("W")&&A-B<-200)
    			bw.write("Not allowed\n");
    		
    		else if(WorD.equals("D"))
    			bw.write(A+B+"\n");
    		
    		else
    			bw.write(A-B+"\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class