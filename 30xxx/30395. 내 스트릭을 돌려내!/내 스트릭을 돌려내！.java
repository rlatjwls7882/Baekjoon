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

		// 접속한 일수 N
		int N = Integer.valueOf(br.readLine());
		
		// N일간의 최장 스트릭 계산
		int longest=0, current=0, lastZero=-2;
		StringTokenizer st = new StringTokenizer(br.readLine());
        
		for(int i=0;i<N;i++) {
			int Pi = Integer.valueOf(st.nextToken());
			
			// 현재 스트릭 계산
			if(Pi!=0) {
				current++;
			} else if (i-lastZero>=2) {
				lastZero=i;
			} else {
				current=0;
			}
			
			// 최장 스트릭 계산
			if(current>longest) {
				longest=current;
			}
		}
		
		bw.write(Integer.toString(longest));
		
		bw.close();
	} // end of main()
} // end of Main class