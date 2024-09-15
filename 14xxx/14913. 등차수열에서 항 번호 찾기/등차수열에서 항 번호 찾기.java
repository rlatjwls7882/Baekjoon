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
    	
    	// 첫 항 a, 공차 d, 찾는 수 k 입력
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int a = Integer.valueOf(st.nextToken());
    	int d = Integer.valueOf(st.nextToken());
    	int k = Integer.valueOf(st.nextToken());
    	
    	// k=a+(n-1)d
    	// ∴n=(k-a)/d+1
    	
    	// 등차수열이 아닌 경우
    	if((k-a)%d!=0||(k-a)/d+1<1)
    		bw.write("X");
    	
    	// 등차수열인 경우
    	else
    		bw.write((k-a)/d+1+"");
    	
    	bw.close();
    } // end of main
} // end of Main class