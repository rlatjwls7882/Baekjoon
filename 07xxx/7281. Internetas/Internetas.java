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
		
		// 측정한 횟수 N
		int N = Integer.valueOf(br.readLine());
		
		// 인터넷이 꺼져 있을 수 있는 최대 시간 계산
		int maxTime=0, beforeOn=0;
		
		for(int i=0;i<N;i++) {
			
			// 측정한 시간과 인터넷이 연결되어 있는지의 여부
			StringTokenizer st = new StringTokenizer(br.readLine());
			int Ti = Integer.valueOf(st.nextToken());
			int Mi = Integer.valueOf(st.nextToken());
			
			// 인터넷이 꺼져 있을 수 있는 시간 계산
			if(i==0)
				beforeOn=Ti;
			
			else if(Mi==1) {
				if(maxTime<Ti-beforeOn)
					maxTime = Ti-beforeOn;
				beforeOn = Ti;
			}
		}
		
		// 인터넷이 꺼져 있을 수 있는 최대 시간 출력
		bw.write(maxTime+"");
		
		bw.close();
	} // end of main()
} // end of Main class