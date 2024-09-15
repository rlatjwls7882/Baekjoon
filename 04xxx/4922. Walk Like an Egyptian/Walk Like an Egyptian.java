import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			
			// 플레이어의 수 N
			int N = Integer.valueOf(br.readLine());
			
			if(N==0) break;
			
			// 맨 오른쪽 위 모서리에 놓인 돌의 번호 출력
			bw.write(String.format("%d => %d\n", N, N*N-N+1));
		}
		
		bw.close();
	} // end of main()
} // end of Main class