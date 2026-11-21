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
		String string = br.readLine();
		
		// 가장 많은 학생의 관심을 받는 분야 확인
		int B=0, S=0, A=0;
		for(int i=0;i<N;i++) {
			if(string.charAt(i)=='B') {
				B++;
			} else if(string.charAt(i)=='S') {
				S++;
			} else {
				A++;
			}
		}
		
		// 출력
		if(B==S&&S==A) {
			bw.write("SCU");
		} else {
			if(B>=S&&B>=A) {
				bw.write('B');
			}
			if(S>=B&&S>=A) {
				bw.write('S');
			}
			if(A>=B&&A>=S) {
				bw.write('A');
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class