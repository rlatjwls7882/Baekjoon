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

		// 참가자의 수 N
		int N = Integer.valueOf(br.readLine());

		// 초기화
		int[] score = new int[N];
		int[][] num = new int[N][3];

		// 참가자들이 종이에 쓴 정수 입력
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			for(int j=0;j<3;j++) {
				num[i][j] = Integer.valueOf(st.nextToken());
			}
		}

		// 참가자들의 점수 계산
		for(int i=0;i<3;i++) {
			for(int j=0;j<N;j++) {
				boolean getScore=true;

				for(int k=0;k<N;k++) {
					if(j==k) {
						continue;
					} else if(num[j][i]==num[k][i]) {
						getScore=false;
						break;
					}
				}

				if(getScore) {
					score[j] += num[j][i];
				}
			}
		}

		// 참가자들의 점수 출력
		for(int i=0;i<N;i++) {
			bw.write(Integer.toString(score[i]));
			bw.newLine();
		}

		bw.close();
	} // end of main()
} // end of Main class