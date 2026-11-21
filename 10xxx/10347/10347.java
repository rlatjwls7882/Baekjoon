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
		
		String rotation = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.valueOf(st.nextToken());
			if(N==0) {
				break;
			}
			String string = st.nextToken();
			
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<string.length();i++) {
				sb.append(rotation.charAt((rotation.indexOf(string.charAt(i))+N)%28));
			}
			bw.write(sb.reverse().toString()+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class