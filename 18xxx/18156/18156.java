import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		
		char[][] map = new char[N][N];
		for(int i=0;i<N;i++) {
			map[i] = br.readLine().toCharArray();
		}
		
		if(chk(map, N)) {
			bw.write('1');
		} else {
			bw.write('0');
		}
		
		bw.close();
	} // end of main()
	
	static boolean chk(char[][] map, int N) {
		for(int i=0;i<N;i++) {
			int whiteCnt1=0;
			int whiteCnt2=0;
			for(int j=0;j<N;j++) {
				if(map[i][j]=='W') {
					whiteCnt1++;
				}
				if(map[j][i]=='W') {
					whiteCnt2++;
				}
				if(i+2<N&&map[i][j]==map[i+1][j]&&map[i][j]==map[i+2][j]||j+2<N&&map[i][j]==map[i][j+1]&&map[i][j]==map[i][j+2]) {
					return false;
				}
			}
			if(whiteCnt1*2!=N||whiteCnt2*2!=N) {
				return false;
			}
		}
		
		return true;
	} // end of chk()
} // end of Main class