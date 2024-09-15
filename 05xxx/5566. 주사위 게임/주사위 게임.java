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
		
		// 칸의 수 N, 주사위를 던진 횟수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 보드판 입력
		int[] board = new int[N];
		for(int i=0;i<N;i++) {
			board[i] = Integer.valueOf(br.readLine());
		}
		
		// 주사위 입력
		int[] dice = new int[M];
		for(int i=0;i<M;i++) {
			dice[i] = Integer.valueOf(br.readLine());
		}
		
		// 주사위를 몇 번 던져서 도착할 수 있는지 확인
		int pos=0, diceNum=0;
		while(pos<N-1) {
			pos += dice[diceNum++];
			
			if(pos<N) {
				pos += board[pos];
			}
		}
		
		bw.write(Integer.toString(diceNum));
		
		bw.close();
	} // end of main()
} // end of Main class