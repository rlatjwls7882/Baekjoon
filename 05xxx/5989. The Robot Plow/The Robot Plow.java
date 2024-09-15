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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int X = Integer.valueOf(st.nextToken());
		int Y = Integer.valueOf(st.nextToken());
		int I = Integer.valueOf(st.nextToken());
		
		boolean[][] field = new boolean[X][Y];
		while(I-->0) {
			st = new StringTokenizer(br.readLine());
			int Xll = Integer.valueOf(st.nextToken())-1;
			int Yll = Integer.valueOf(st.nextToken())-1;
			int Xur = Integer.valueOf(st.nextToken())-1;
			int Yur = Integer.valueOf(st.nextToken())-1;
			
			for(int i=Xll;i<=Xur;i++) {
				for(int j=Yll;j<=Yur;j++) {
					field[i][j]=true;
				}
			}
		}
		
		int cnt=0;
		for(int i=0;i<X;i++) {
			for(int j=0;j<Y;j++) {
				if(field[i][j]) {
					cnt++;
				}
			}
		}
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
} // end of Main class