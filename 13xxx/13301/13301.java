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
		
		// 1~N+1번째 타일의 길이 계산
		long[] length = new long[N+1];
		length[0]=length[1]=1;
		
		for(int i=2;i<=N;i++) {
			length[i]=length[i-1]+length[i-2];
		}
		
		// N개의 타일로 구성된 직사각형의 둘레 계산
		bw.write(Long.toString((length[N]+length[N-1])*2));
		
		bw.close();
	} // end of main()
} // end of Main class