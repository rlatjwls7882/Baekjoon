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
		
		while(N-->0) {
			String string = br.readLine();
			
			int cnt=1;
			for(int i=1;i<string.length();i++) {
				if(string.charAt(i)==string.charAt(i-1)) {
					cnt++;
				} else {
					bw.write(cnt+""+string.charAt(i-1));
					cnt=1;
				}
			}
			bw.write(cnt+""+string.charAt(string.length()-1)+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class