import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.valueOf(st.nextToken());
		int K = Integer.valueOf(st.nextToken());
		
		// A를 K로 만드는 최소 연산 횟수 계산
		int[] time = new int[K+1];
		for(int i=A+1;i<=K;i++) {
			
			if(i%2==0&&i/2>=A) {
				time[i]=time[i/2]+1;
			} else {
				time[i]=time[i-1]+1;
			}
		}
		
		bw.write(Integer.toString(time[K]));
		
		bw.close();
	} // end of main()
} // end of Main class