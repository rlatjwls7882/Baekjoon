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
        	
        	// 조사한 일 수 N 입력
        	int N = Integer.valueOf(br.readLine());
        	
        	if(N==0) break;
        	
        	// N일 동안의 양성 사례 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int[] covid = new int[N];
        	
        	for(int i=0;i<N;i++)
        		covid[i] = Integer.valueOf(st.nextToken());
        	
        	// 각 데이터의 피크의 개수 계산
        	int peak=0;
        	
        	for(int i=1;i<N-1;i++)
        		if(covid[i]>covid[i-1]&&covid[i]>covid[i+1])
        			peak++;
        	
        	// 각 데이터의 피크의 개수 출력
        	bw.write(peak+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class