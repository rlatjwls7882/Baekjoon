import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		
		// 준원이의 공격력
		StringTokenizer st = new StringTokenizer(br.readLine());
		long A1 = Long.valueOf(st.nextToken());
		
		// 그 외 적들의 공격력
		int[] A = new int[N-1];
		for(int i=0;i<N-1;i++) {
			A[i] = Integer.valueOf(st.nextToken());
		}
		Arrays.sort(A);
		
		// 준원이가 마지막으로 살아남을 수 있는지 확인
		boolean check=true;
		for(int i=0;i<N-1;i++) {
			if(A1>A[i]) {
				A1 += A[i];
			} else {
				check=false;
				break;
			}
		}
		
		bw.write(check?"Yes":"No");	
		
		bw.close();
	} // end of main()
} // end of Main class