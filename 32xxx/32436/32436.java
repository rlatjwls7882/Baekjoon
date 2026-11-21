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
		int N = Integer.valueOf(br.readLine());
		int[][] K = new int[N][N];
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				K[i][j] = Integer.valueOf(st.nextToken());
			}
		}
		
		if(K[0][0]<=K[N-1][0] && K[0][0]<=K[0][N-1] && K[0][0]<=K[N-1][N-1]) {
			bw.write("0");
		} else if(K[N-1][0]<=K[0][N-1] && K[N-1][0]<=K[N-1][N-1]) {
			bw.write("3");
		} else if(K[N-1][N-1]<=K[0][N-1]) {
			bw.write("2");
		} else {
			bw.write("1");
		}
		
        bw.close();
    } // end of main
} // end of Main