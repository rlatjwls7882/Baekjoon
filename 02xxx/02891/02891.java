import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int S = Integer.valueOf(st.nextToken());
		int R = Integer.valueOf(st.nextToken());
		
		// 카약 생성
		int[] boat = new int[N];
		Arrays.fill(boat, 1);
		
		// 카약이 손상된 팀
		st = new StringTokenizer(br.readLine());
		while(S-->0) {
			boat[Integer.valueOf(st.nextToken())-1]--;
		}
		
		// 여분의 카약이 있는 팀
		st = new StringTokenizer(br.readLine());
		while(R-->0) {
			boat[Integer.valueOf(st.nextToken())-1]++;
		}
		
		// 출발할 수 없는 팀의 최솟값 계산
		for(int i=0;i<N;i++) {
			if(i!=0&&boat[i]==0&&boat[i-1]==2) {
				boat[i]++;
				boat[i-1]--;
			} else if(i!=N-1&&boat[i]==0&&boat[i+1]==2) {
				boat[i]++;
				boat[i+1]--;
			}
		}
		
		int cnt=0;
		for(int i=0;i<N;i++) {
			if(boat[i]==0) {
				cnt++;
			}
		}
		
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
} // end of Main class