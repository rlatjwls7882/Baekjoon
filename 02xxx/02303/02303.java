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
		
		// 학생 수 N
		int N = Integer.valueOf(br.readLine());
		
		// 게임에서 이긴 사람 계산
		int max_score=0, winner=0;
		
		for(int num=1;num<=N;num++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] card = new int[5];
			for(int i=0;i<5;i++) {
				card[i] = Integer.valueOf(st.nextToken());
			}
			
			for(int i=0;i<5;i++) {
				for(int j=i+1;j<5;j++) {
					for(int k=j+1;k<5;k++) {
						int score = (card[i]+card[j]+card[k])%10;
						
						if(score>max_score) {
							max_score = score;
							winner = num;
						} else if(score==max_score) {
							winner = num;
						}
					}
				}
			}
		}
		
		bw.write(Integer.toString(winner));
		
		bw.close();
	} // end of main()
} // end of Main class