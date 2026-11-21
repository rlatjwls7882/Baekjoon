import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// 열의 개수 K
		int K = Integer.valueOf(br.readLine());
		
		// 암호한된 문자열 입력
		String string = br.readLine();
		
		// 원래의 문자열 확인
		int row = string.length()/K;
		char[][] original = new char[row][K];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<K;j++) {
				if(i%2==0) {
					original[i][j] = string.charAt(i*K+j);
				} else {
					original[i][K-1-j] = string.charAt(i*K+j);
				}
			}
		}

		for(int i=0;i<K;i++) {
			for(int j=0;j<row;j++) {
				bw.write(original[j][i]);
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class