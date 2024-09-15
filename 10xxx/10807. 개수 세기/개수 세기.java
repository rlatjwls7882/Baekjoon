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
    	
    	// N 입력
    	int N = Integer.valueOf(br.readLine());
    	
    	// N개의 정수와 v 입력
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	String v = br.readLine();
    	
    	// N개의 정수중 v가 몇번 나왔는지 계산
    	int cnt=0;
    	
    	while(N--!=0)
    		if(st.nextToken().equals(v))
    			cnt++;
    	
    	bw.write(cnt+"");
    	bw.close();
    } // end of main
} // end of Main class