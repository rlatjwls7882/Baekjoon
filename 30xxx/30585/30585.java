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
		
		// 열의 수 N, 행의 수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 1과 0이 등장한 횟수 확인
		int numOfZero=0, numOfOne=0;
		for(int i=0;i<N;i++) {
			String string = br.readLine();
			
			for(int j=0;j<M;j++) {
				if(string.charAt(j)=='1') {
					numOfOne++;
				} else {
					numOfZero++;
				}
			}
		}
		
		// 더 적은 값 출력
		if(numOfOne<numOfZero) {
			bw.write(Integer.toString(numOfOne));
		} else {
			bw.write(Integer.toString(numOfZero));
		}
		
		bw.close();
	} // end of main()
} // end of Main class