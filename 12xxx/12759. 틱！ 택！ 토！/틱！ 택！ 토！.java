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

		// 시작하는 플레이어 번호
		int Player1 = Integer.valueOf(br.readLine());
		int Player2=1;
		if(Player1==Player2) {
			Player2=2;
		}
		
		// 게임 시작
		int[][] board = new int[4][4];
		int winner=0;
		
		for(int i=0;i<9;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.valueOf(st.nextToken());
			int y = Integer.valueOf(st.nextToken());
			
			// 번갈아가며 O, X 그리기
			if(i%2==0) {
				board[x][y] = Player1;
			} else {
				board[x][y] = Player2;
			}
			
			// 누가 이겼는지 확인
			
			// 대각선
			if(board[1][1]!=0&&board[1][1]==board[2][2]&&board[2][2]==board[3][3]) {
				winner = board[1][1];
				break;
			} else if(board[1][3]!=0&&board[1][3]==board[2][2]&&board[2][2]==board[3][1]) {
				winner = board[1][3];
				break;
			}
			
			// 가로 세로
			for(int j=1;j<=3;j++) {
				if(board[j][1]!=0&&board[j][1]==board[j][2]&&board[j][2]==board[j][3]) {
					winner = board[j][1];
					i=9;
					break;
				} else if(board[1][j]!=0&&board[1][j]==board[2][j]&&board[2][j]==board[3][j]) {
					winner = board[1][j];
					i=9;
					break;
				}
			}
		}
		
		// 게임 결과 출력
		bw.write(Integer.toString(winner));
		
		bw.close();
	} // end of main()
} // end of Main class