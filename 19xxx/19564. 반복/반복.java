import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		String S = br.readLine();
		
		// S를 입력하는데 키보드를 누르는 최소 횟수 계산
		int idx=0;
		for(int i=0;;i++) {
			if(S.charAt(idx)==alpha.charAt(i%26)) {
				idx++;
			}
			if(idx==S.length()) {
				bw.write(Integer.toString(i/26+1));
				break;
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class