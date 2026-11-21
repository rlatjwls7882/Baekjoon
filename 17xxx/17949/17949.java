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
		
		String string = br.readLine();
		int N = Integer.valueOf(br.readLine());
		
		// 16진수를 10진수로 변환
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<string.length();) {
			String form = st.nextToken();
			if(form.equals("char")) {
				bw.write(Integer.toString(Integer.valueOf(string.substring(i,i+2), 16)));
				i+=2;
			} else if(form.equals("int")) {
				bw.write(Integer.toString(Integer.valueOf(string.substring(i,i+8), 16)));
				i+=8;
			} else {
				bw.write(Long.toString(Long.valueOf(string.substring(i,i+16), 16)));
				i+=16;
			}
			bw.write(' ');
		}
		
		bw.close();
	} // end of main()
} // end of Main class