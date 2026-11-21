import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.valueOf(br.readLine());
		
		for(int i=1;i<=T;i++) {
			bw.write(String.format("Case #%d: ", i));
			
			// I와 O를 1과 0으로 변경
			StringBuilder decode = new StringBuilder();
			int N = Integer.valueOf(br.readLine());
			String string = br.readLine();
			
			for(int j=0;j<8*N;j++) {
				if(string.charAt(j)=='I') {
					decode.append('1');
				} else {
					decode.append('0');
				}
			}
			
			// 메세지 번역
			for(int j=0;j<8*N;j+=8) {
				int message = Integer.valueOf(decode.substring(j, j+8), 2);
				bw.write((char)message);
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class