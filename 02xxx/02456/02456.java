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
		
		int N = Integer.valueOf(br.readLine());
		
		// 투표 결과 확인
		Score[] scores = new Score[3];
		for(int i=0;i<3;i++) {
			scores[i] = new Score(i+1);
		}
		
		while(N-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int i=0;i<3;i++) {
				int num = Integer.valueOf(st.nextToken());
				scores[i].totalScore += num;
				if(num==3) {
					scores[i].cnt3 += num;
				} else if(num==2) {
					scores[i].cnt2 += num;
				}
			}
		}
		Arrays.sort(scores);
		
		// 누가 회장으로 당선되었는지 확인
		if(scores[0].totalScore>scores[1].totalScore||scores[0].cnt3>scores[1].cnt3||scores[0].cnt2>scores[1].cnt2) {
			bw.write(String.format("%d %d", scores[0].idx, scores[0].totalScore));
		} else {
			bw.write(String.format("0 %d", scores[0].totalScore));
		}
		
		bw.close();
	} // end of main()
} // end of Main class

class Score implements Comparable<Score> {
	int idx, totalScore, cnt3, cnt2;
	
	public Score(int idx) {
		this.idx=idx;
	}
	
	@Override
	public int compareTo(Score o) {
		if(this.totalScore!=o.totalScore) {
			return o.totalScore-this.totalScore;
		} else {
			if(this.cnt3!=o.cnt3) {
				return o.cnt3-this.cnt3;
			} else {
				return o.cnt2-this.cnt2;
			}
		}
	}
} // end of Score class
