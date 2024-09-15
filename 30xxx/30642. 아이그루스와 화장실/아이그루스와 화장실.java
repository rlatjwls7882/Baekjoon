import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// 건물의 층 수 N, 마스코트 종류 S, 현재 마스코트가 있는 층 K
		int N = Integer.valueOf(br.readLine());
		String S = br.readLine();
		int K = Integer.valueOf(br.readLine());
		
		// 안뇽이
		if(S.equals("annyong")) {
			if(K%2==1) {
				bw.write(Integer.toString(K));
			} else if(K<N) {
				bw.write(Integer.toString(K+1));
			} else {
				bw.write(Integer.toString(K-1));
			}
		}
		
		// 인덕이
		else {
			if(K%2==0) {
				bw.write(Integer.toString(K));
			} else if(K<N) {
				bw.write(Integer.toString(K+1));
			} else {
				bw.write(Integer.toString(K-1));
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class