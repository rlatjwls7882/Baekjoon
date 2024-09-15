import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int MOD = 1_000_000_000;
	
	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		
		// 길이가 1~N인 계단수의 각각 0~9로 끝나는 개수 계산
		int[][] stair = new int[N][10];
		for(int i=1;i<=9;i++) {
			stair[0][i]=1;
		}
		
		for(int i=1;i<N;i++) {
			for(int j=0;j<10;j++) {
				if(j==0) {
					stair[i][0]=stair[i-1][1]%MOD;
				} else if(j==9) {
					stair[i][9]=stair[i-1][8]%MOD;
				} else {
					stair[i][j]=(stair[i-1][j-1]+stair[i-1][j+1])%MOD;
				}
			}
		}
		
		// 길이가 N인 계단수의 개수 계산
		int sum=0;
		for(int j=0;j<10;j++) {
			sum = (sum+stair[N-1][j])%MOD;
		}
		
		bw.write(Integer.toString(sum));
		
		bw.close();
	} // end of main()
} // end of Main class