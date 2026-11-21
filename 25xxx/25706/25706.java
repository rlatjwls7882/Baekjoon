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
		
		int N = Integer.valueOf(br.readLine());
		
		// 도로 입력
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] road = new int[N];
		for(int i=0;i<N;i++) {
			road[i] = Integer.valueOf(st.nextToken());
		}
		
		// 각 칸에서 출발할 때 밟는 칸의 수 계산
		for(int i=N-1;i>=0;i--) {

			// 점프대를 타고 저 멀리 날아가는 경우 + 마지막칸
			if(road[i]+i+1>=N) {
				road[i]=1;
			}

			// 그 외의 경우들
			else {
				road[i]=road[i+road[i]+1]+1;
			}
		}
		
		for(int i=0;i<N;i++) {
			bw.write(Integer.toString(road[i]));
			bw.write(' ');
		}
		
		bw.close();
	} // end of main()
} // end of Main class