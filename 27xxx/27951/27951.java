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
		
		// 옷걸이의 종류
		int N = Integer.valueOf(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int U=0, D=0;
		int[] A = new int[N];
		
		for(int i=0;i<N;i++) {
			A[i] = Integer.valueOf(st.nextToken());
			if(A[i]==1) {
				U++;
			} else if(A[i]==2) {
				D++;
			}
		}
		
		// 상의와 하의의 개수
		st = new StringTokenizer(br.readLine());
		U -= Integer.valueOf(st.nextToken());
		D -= Integer.valueOf(st.nextToken());
		
		// 옷걸이에 옷을 어떻게 걸었는지 출력
		if(U>0||D>0) {
			bw.write("NO");
		} else {
			bw.write("YES\n");
			for(int i=0;i<N;i++) {
				if(A[i]==1) {
					bw.write('U');
				} else if(A[i]==2) {
					bw.write('D');
				} else {
					if(U<0) {
						U++;
						bw.write('U');
					} else {
						bw.write('D');
					}
				}
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class