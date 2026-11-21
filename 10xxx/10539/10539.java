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
    	
    	// 길이 N의 수열 B 입력
    	int N = Integer.valueOf(br.readLine());
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int[] B = new int[N];
    	
    	for(int i=0;i<N;i++)
    		B[i] = Integer.valueOf(st.nextToken());
    	
    	// 수열 A 계산
    	bw.write(B[0]+"");
    	
    	for(int i=1;i<N;i++)
    		bw.write(" "+(B[i]*(i+1)-B[i-1]*i));
    	
    	bw.close();
    } // end of main
} // end of Main class