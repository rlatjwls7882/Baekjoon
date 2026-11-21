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
		
		int T = Integer.valueOf(br.readLine());
		
		// 평문을 암호식으로 치환
		while(T-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.valueOf(st.nextToken());
			int b = Integer.valueOf(st.nextToken());
			
			String string = br.readLine();
			for(int i=0;i<string.length();i++) {
				bw.write(((string.charAt(i)-'A')*a+b)%26+'A');
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class