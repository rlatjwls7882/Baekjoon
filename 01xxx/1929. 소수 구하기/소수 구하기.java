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
    	
    	// M, N 입력
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int M = Integer.valueOf(st.nextToken());
    	int N = Integer.valueOf(st.nextToken());
    	
    	// 에라토스테네스의 체 사용
    	boolean[] num = new boolean[N+1];
    	num[0]=num[1]=true;
    	
    	for(int i=2;i*i<=N;i++)
    		if(!num[i])
    			for(int j=i*i;j<=N;j+=i)
    				num[j]=true;
    	
    	// M 이상 N 이하의 소수 찾기
    	for(int i=M;i<=N;i++)
    		if(!num[i])
    			bw.write(i+"\n");
    	
    	bw.close();
    } // end of main
} // end of Main class