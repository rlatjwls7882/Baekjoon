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
    	
    	// R1, S 입력
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int R1 = Integer.valueOf(st.nextToken());
    	int S = Integer.valueOf(st.nextToken());
    	
    	// S = (R1+R2)/2
    	// ∴ R2 = 2S-R1
    	
    	// R2 출력
    	bw.write(2*S-R1+"");
    	bw.close();
    } // end of main
} // end of Main class