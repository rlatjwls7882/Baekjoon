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
		
		int[] string = {1, 0, 0, 1, 0, 0, 1, 0, 0, 0};
		
		// 문자열의 길이 N, 놀이 횟수 Q
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int Q = Integer.valueOf(st.nextToken());
		
		// 초기 상태
		int[] upperCase = new int[N];
		int cnt=0;
		
		for(int i=0;i<N;i++) {
			cnt += upperCase[i] = string[i%10];
		}
		
		// 놀이 과정마다 대문자의 개수 계산
		for(int i=0;i<Q;i++) {
			int idx = Integer.valueOf(br.readLine())-1;
			
			if(upperCase[idx]==1) {
				upperCase[idx]=0;
				cnt--;
			} else {
				upperCase[idx]=1;
				cnt++;
			}
			
			bw.write(Integer.toString(cnt));
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class