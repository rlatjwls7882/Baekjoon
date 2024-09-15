import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// N을 1, 2, 3의 합으로 나타내는 방법의 수 계산
		/* 
		 * 1:1
		 * 2:2
		 * 3:4
		 * 4:7
		 * 5:13
		 * 6:24
		 * 7:44
		 * ...
		 */
		int[] sum = new int[12];
		sum[1]=1; sum[2]=2; sum[3]=4;
		
		for(int i=4;i<=11;i++) {
			sum[i]=sum[i-1]+sum[i-2]+sum[i-3];
		}
		
		// 출력
		int T = Integer.valueOf(br.readLine());
		while(T-->0) {
			int N = Integer.valueOf(br.readLine());
			bw.write(Integer.toString(sum[N]));
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class