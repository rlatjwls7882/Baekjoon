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
		
		int[] chars = new int[26];
		for(int i=0;i<N;i++) {
			chars[string.charAt(i)-'A']++;
			
			if(chars['A'-'A']>=2&&chars['R'-'A']>=1&&chars['K'-'A']>=1&&chars['S'-'A']>=1&&chars['T'-'A']>=1) {
				bw.write(i+1+"");
				break;
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class