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
		
		int n = Integer.valueOf(br.readLine());
		
		// 색종이 덮기
		int size=1001;
		int[][] paper = new int[size][size];
		for(int i=1;i<=n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x1 = Integer.valueOf(st.nextToken());
			int y1 = Integer.valueOf(st.nextToken());
			int x2 = Integer.valueOf(st.nextToken());
			int y2 = Integer.valueOf(st.nextToken());
			
			for(int j=0;j<y2;j++) {
				for(int k=0;k<x2;k++) {
					paper[y1+j][x1+k]=i;
				}
			}
		}
		
		// 각 색종이가 보이는 면적 계산
		for(int i=1;i<=n;i++) {
			int cnt=0;
			for(int j=0;j<size;j++) {
				for(int k=0;k<size;k++) {
					if(paper[j][k]==i) {
						cnt++;
					}
				}
			}
			
			bw.write(Integer.toString(cnt));
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class