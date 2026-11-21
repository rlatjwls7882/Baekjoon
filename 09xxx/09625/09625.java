import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int K = Integer.valueOf(br.readLine());
		
		// 버튼을 K번 눌렀을 때의 A와 B의 개수 계산
		/* 
		 * 1 0
		 * 0 1
		 * 1 1
		 * 1 2
		 * 2 3
		 * ...
		 */
		int[][] AB = new int[K+2][2];
		AB[0][0]=1;
		AB[1][1]=1;
		
		for(int i=2;i<=K;i++) {
			for(int j=0;j<2;j++) {
				AB[i][j]=AB[i-1][j]+AB[i-2][j];
			}
		}
		
		bw.write(Integer.toString(AB[K][0]));
		bw.write(' ');
		bw.write(Integer.toString(AB[K][1]));
		
		bw.close();
	} // end of main()
} // end of Main class