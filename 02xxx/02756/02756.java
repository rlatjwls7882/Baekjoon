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
		
		int T = Integer.valueOf(br.readLine());
		
		int[] score = {100, 80, 60, 40, 20};
		
		while(T-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			// 두 플레이어의 다트 점수 계산
			int player1=0, player2=0;
			for(int i=0;i<6;i++) {
				double x = Double.valueOf(st.nextToken());
				double y = Double.valueOf(st.nextToken());
				
				for(int r=3;r<=15;r+=3) {
					if(x*x+y*y<=r*r) {
						if(i<3) {
							player1 += score[r/3-1];
						} else {
							player2 += score[r/3-1];
						}
						break;
					}
				}
			}

			// 게임에서 누가 이겼는지 확인
			bw.write(String.format("SCORE: %d to %d, ", player1, player2));

			if(player1==player2) {
				bw.write("TIE.\n");
			} else if(player1>player2) {
				bw.write("PLAYER 1 WINS.\n");
			} else {
				bw.write("PLAYER 2 WINS.\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class