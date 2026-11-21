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
		
		// N개의 카드의 앞면과 뒷면의 숫자 입력
		int[][] AB = new int[N][2];
		int[] AorB = new int[N];
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			AB[i][0] = Integer.valueOf(st.nextToken());
			AB[i][1] = Integer.valueOf(st.nextToken());
		}
		
		// M개의 명령 수행
		while(M-->0) {
			int K = Integer.valueOf(br.readLine());
			
			for(int i=0;i<N;i++) {
				if(AB[i][AorB[i]]<=K) {
					if(AorB[i]==0) {
						AorB[i]=1;
					} else {
						AorB[i]=0;
					}
				}
			}
		}
		
		// 카드의 보이는 면의 합 계산
		int sum=0;
		for(int i=0;i<N;i++) {
			sum += AB[i][AorB[i]];
		}
		
		bw.write(Integer.toString(sum));
		
		bw.close();
	} // end of main()
} // end of Main class