import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 표지판의 크기 N
		int N = Integer.valueOf(br.readLine());
		
		// 출입제한 표지판 출력
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				
				// 위쪽과 아래쪽 테두리
				if(i==0||i==N-1) {
					bw.write("*");
				}
				
				// 왼쪽과 오른쪽 테두리
				else if(j==0||j==N-1) {
					bw.write("*");
				}
				
				// 대각선
				else if(i==j||i==N-1-j) {
					bw.write("*");
				}
				
				// 빈 공간
				else {
					bw.write(" ");
				}
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class