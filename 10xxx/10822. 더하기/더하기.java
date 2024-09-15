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
    	
    	// 자연수의 합 계산
    	StringTokenizer st = new StringTokenizer(br.readLine(),",");
    	int sum=0;
    	
    	while(st.hasMoreTokens())
    		sum += Integer.valueOf(st.nextToken());
    	
    	bw.write(sum+"");
    	
    	bw.close();
    } // end of main
} // end of Main class