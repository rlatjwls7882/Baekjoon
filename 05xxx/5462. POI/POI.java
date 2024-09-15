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
		
		// 참가자의 수 N, 문제의 수 T, 필립의 아이디 P
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int T = Integer.valueOf(st.nextToken());
		int P = Integer.valueOf(st.nextToken());
		
		// 문제를 풀었는지 여부
		boolean[][] check = new boolean[N][T];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<T;j++) {
				if(st.nextToken().equals("1")) {
					check[i][j]=true;
				}
			}
		}
		
		// 점수 계산
		Score[] scores = new Score[N];
		for(int i=0;i<N;i++) {
			scores[i] = new Score(i+1);
		}
		
		for(int i=0;i<T;i++) {
			int cnt=0;
			for(int j=0;j<N;j++) {
				if(!check[j][i]) {
					cnt++;
				}
			}
			
			for(int j=0;j<N;j++) {
				if(check[j][i]) {
					scores[j].totalScore += cnt;
					scores[j].problemCnt++;
				}
			}
		}
		Arrays.sort(scores);
		
		// 필립의 최종점수와 등수 출력
		for(int i=0;i<N;i++) {
			if(scores[i].ID==P) {
				bw.write(scores[i].totalScore+" "+(i+1));
				break;
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class

class Score implements Comparable<Score> {
	int totalScore, problemCnt, ID;
	
	public Score(int ID) {
		this.ID=ID;
	}
	
	@Override
	public int compareTo(Score o) {
		if(this.totalScore!=o.totalScore) {
			return o.totalScore-this.totalScore;
		} else if(this.problemCnt!=o.problemCnt) {
			return o.problemCnt-this.problemCnt;
		} else {
			return this.ID-o.ID;
		}
	}
} // end of Score class