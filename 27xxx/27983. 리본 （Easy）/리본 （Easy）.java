import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static long[] X, L;
	static char[] C;
	static int N;
	
	public static void main(String[] args) throws IOException {
		
		// 리본의 수 N
		N = Integer.valueOf(br.readLine());
		
		// 리본의 위치 입력
		StringTokenizer st = new StringTokenizer(br.readLine());
		X = new long[N];
		for(int i=0;i<N;i++) {
			X[i] = Long.valueOf(st.nextToken());
		}
		
		// 리본의 길이 입력
		st = new StringTokenizer(br.readLine());
		L = new long[N];
		for(int i=0;i<N;i++) {
			L[i] = Long.valueOf(st.nextToken());
		}
		
		// 리본의 색 입력
		st = new StringTokenizer(br.readLine());
		C = new char[N];
		for(int i=0;i<N;i++) {
			C[i] = st.nextToken().charAt(0);
		}
		
		// 아름다운 매듭을 지을 수 있는지 확인
		canMakePretty();
		bw.write(sb.toString());
		
		bw.close();
	} // end of main()
	
	static void canMakePretty() {
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(i!=j&&C[i]!=C[j]&&Math.abs(X[i]-X[j])<=L[i]+L[j]) {
					sb.append("YES\n").append(i+1).append(' ').append(j+1);
					return;
				}
			}
		}
		sb.append("NO");
		
	} // end of canMakePretty()
} // end of Main class