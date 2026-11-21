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
		
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			
			// 아이들이 초기에 가지고 있던 사탕
			int N = Integer.valueOf(br.readLine());
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] C = new int[N];
			for(int i=0;i<N;i++) {
				C[i] = Integer.valueOf(st.nextToken());
				if(C[i]%2==1) {
					C[i]++;
				}
			}
			
			// 모든 아이가 같은 개수를 갖기 위한 순환의 횟수 계산
			for(int i=0;;i++) {
				if(isEqual(C, N)) {
					bw.write(Integer.toString(i));
					break;
				} else {
					int[] tmpC = new int[N];
					for(int j=0;j<N;j++) {
						C[j] /= 2;
						tmpC[j] = C[j];
					}
					
					for(int j=0;j<N;j++) {
						C[(j+1)%N] += tmpC[j];
						if(C[(j+1)%N]%2==1) {
							C[(j+1)%N]++;
						}
					}
				}
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
	
	static boolean isEqual(int[] C, int N) {
		for(int i=1;i<N;i++) {
			if(C[i]!=C[i-1]) {
				return false;
			}
		}
		
		return true;
	} // end of isEqual()
} // end of Main class