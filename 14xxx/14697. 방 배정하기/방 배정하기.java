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
		int A = Integer.valueOf(st.nextToken());
		int B = Integer.valueOf(st.nextToken());
		int C = Integer.valueOf(st.nextToken());
		int N = Integer.valueOf(st.nextToken());
		
		// A, B, C를 더해 N을 만들 수 있는지 확인
		boolean canMake=false;
		
		for(int i=0;i<=N;i+=A) {
			for(int j=0;i+j<=N;j+=B) {
				for(int k=0;i+j+k<=N;k+=C) {
					if(i+j+k==N) {
						canMake=true;
						i=j=k=N+1;
					}
				}
			}
		}
		
		bw.write(canMake?"1":"0");

		bw.close();
	} // end of main()
} // end of Main class