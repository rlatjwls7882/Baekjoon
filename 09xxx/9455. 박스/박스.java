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

		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int m = Integer.valueOf(st.nextToken());
			int n = Integer.valueOf(st.nextToken());
			
			// 박스의 위치 입력
			int[][] box = new int[m][n];
			for(int i=0;i<m;i++) {
				st = new StringTokenizer(br.readLine());
				
				for(int j=0;j<n;j++) {
					box[i][j] = Integer.valueOf(st.nextToken());
				}
			}
			
			// 모든 박스가 이동한 거리 계산
			int move=0;
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					if(box[j][i]==1) {
						int cnt=0;
						
						for(int k=j+1;k<m;k++) {
							if(box[k][i]==0) {
								cnt++;
							}
						}
						
						move += cnt;
					}
				}
			}
			
			bw.write(Integer.toString(move));
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class