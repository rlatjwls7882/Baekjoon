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
    	
    	// 테스트 케이스 수 T 입력
    	int T = Integer.valueOf(br.readLine());
    	
    	while(T--!=0) {
    		
    		// 개발하는데 걸리는 시간 d, 다음해 동안 시행되는 횟수 n, 직렬버전과 병렬버전의 실행시간 s p
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int d = Integer.valueOf(st.nextToken());
    		int n = Integer.valueOf(st.nextToken());
    		int s = Integer.valueOf(st.nextToken());
    		int p = Integer.valueOf(st.nextToken());
    		
    		// 병렬 작업량 time1, 직렬 작업량 time2
    		int time1 = d+n*p;
    		int time2 = n*s;
    		
    		// 비교
    		if(time1<time2) bw.write("parallelize\n");
    		else if(time1>time2) bw.write("do not parallelize\n");
    		else bw.write("does not matter\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class