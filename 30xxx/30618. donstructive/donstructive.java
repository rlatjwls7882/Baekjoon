import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// 순열의 길이 N
		int N = Integer.valueOf(br.readLine());
		
		// 점수가 가장 높은 순열 계산(1 3 5 ... N-1 N ... 6 4 2)
		int[] num = new int[N];
		for(int i=1;i<=N;i++) {
			if(i%2==0) {
				num[N-i/2]=i;
			} else {
				num[i/2]=i;
			}
		}
		
		for(int i=0;i<N;i++) {
			bw.write(Integer.toString(num[i]));
			bw.write(' ');
		}
		
		bw.close();
	} // end of main()
} // end of Main class