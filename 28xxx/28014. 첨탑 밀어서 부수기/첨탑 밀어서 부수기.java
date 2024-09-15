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
    	
    	// 첨탑의 개수 N 입력
    	int N = Integer.valueOf(br.readLine());
    	
    	// 첨탑의 높이 입력
    	int[] H = new int[N];
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	for(int i=0;i<N;i++)
    		H[i] = Integer.valueOf(st.nextToken());
    	
    	// 첨탑을 밀어야 하는 횟수 계산
    	int cnt=1;
    	
    	for(int i=1;i<N;i++)
    		if(H[i]>=H[i-1])
    			cnt++;
    	
    	// 첨탑을 밀어야 하는 횟수 출력
    	bw.write(cnt+"");
    	bw.close();
    } // end of main
} // end of Main class