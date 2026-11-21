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

		// 체스판의 가로, 세로 길이 N, M 입력
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 체스판 입력
		String[] board = new String[N];
		for(int i=0;i<N;i++)
			board[i] = br.readLine();
		
		// 다시 칠해야 하는 정사각형의 개수의 최솟값 계산
		int min=64;
		
		// 체스판을 잘라내는 위치
		for(int i=0;i<N-7;i++)
			for(int j=0;j<M-7;j++) {
				
				// 각각의 잘라진 체스판의 다시 칠해야 하는 개수
				int cnt=0;
				
				for(int k=i;k<i+8;k++)
					for(int l=j;l<j+8;l++)
						if((k%2==0&&l%2==0||k%2==1&&l%2==1)&&board[k].charAt(l)=='B')
							cnt++;
						else if((k%2==1&&l%2==0||k%2==0&&l%2==1)&&board[k].charAt(l)=='W')
							cnt++;
				
				if(cnt<min) min=cnt;
				if(64-cnt<min) min=64-cnt;
			}
		
		// 다시 칠해야 하는 정사각형의 개수의 최솟값 출력
		bw.write(min+"");
		
		bw.close();
	} // end of main
} // end of Main class