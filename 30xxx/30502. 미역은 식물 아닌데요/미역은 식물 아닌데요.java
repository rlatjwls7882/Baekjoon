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
		
		// 생물의 종류 수 N, 실험의 수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 실험 결과 입력
		int[][] result = new int[N][2];
		while(M-->0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.valueOf(st.nextToken())-1;
			String b = st.nextToken();
			
			// 0:광합성, 1:운동성 / 0:모름, 1:특성을 가지지 않음, 2:특성을 가짐
			if(b.equals("P")) {
				if(st.nextToken().equals("1")) {
					result[a][0]=2;
				} else {
					result[a][0]=1;
				}
			} else {
				if(st.nextToken().equals("1")) {
					result[a][1]=2;
				} else {
					result[a][1]=1;
				}
			}
		}
		
		// 가능한 식물의 수의 최솟값, 최댓값 계산
		int min=0, max=0;
		for(int i=0;i<N;i++) {
			if(result[i][0]!=1&&result[i][1]!=2) {
				max++;
			}
			if(result[i][0]==2&&result[i][1]==1) {
				min++;
			}
		}
		
		bw.write(Integer.toString(min));
		bw.write(' ');
		bw.write(Integer.toString(max));
		
		bw.close();
	} // end of main()
} // end of Main class