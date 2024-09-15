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
		
		// 'S'가 들어있는 문자열 찾기
		while(N-->0) {
			String string = br.readLine();
			if(string.indexOf("S")!=-1) {
				bw.write(string);
				break;
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class