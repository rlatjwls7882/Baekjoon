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
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		int K = Integer.valueOf(st.nextToken());
		String string = br.readLine();
		
		// 감염된 사람의 수 계산
		boolean[] infected = new boolean[N];
		for(int i=0;i<N;i++) {
			if(string.charAt(i)=='R') {
				for(int j=Math.max(0, i-K);j<Math.min(N, i+K+1);j++) {
					infected[j]=true;
				}
			}
		}
		
		int cnt=0;
		for(int i=0;i<N;i++) {
			if(infected[i]) {
				cnt++;
			}
		}
		
		// 모두 치료할 수 있는지 확인
		if(cnt<=M) {
			bw.write("Yes");
		} else {
			bw.write("No");
		}
		
		bw.close();
	} // end of main()
} // end of Main class