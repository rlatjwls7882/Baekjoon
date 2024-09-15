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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int H = Integer.valueOf(st.nextToken());
		int W = Integer.valueOf(st.nextToken());
		
		// 구름의 초기 위치 입력
		int[][] cloud = new int[H][W];
		for(int i=0;i<H;i++) {
			Arrays.fill(cloud[i], -1);
		}
		
		for(int i=0;i<H;i++) {
			String string = br.readLine();
			
			for(int j=0;j<W;j++) {
				if(string.charAt(j)=='c') {
					cloud[i][j]=0;
				}
			}
		}
		
		// 처음으로 구름이 오는 시간 계산
		for(int i=0;i<H;i++) {
			for(int j=1;j<W;j++) {
				if(cloud[i][j-1]!=-1&&cloud[i][j]==-1) {
					cloud[i][j] = cloud[i][j-1]+1;
				}
			}
		}
		
		// 출력
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				bw.write(Integer.toString(cloud[i][j]));
				bw.write(' ');
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class