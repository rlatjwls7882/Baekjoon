import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int K = Integer.valueOf(br.readLine());
		
		String string = br.readLine();
		for(int i=0;i<string.length();i++) {
			if('a'<=string.charAt(i)&&string.charAt(i)<='z') {
				bw.write((string.charAt(i)-71-K)%26+'a');
				if(++K==26) {
					K=1;
				}
			} else {
				bw.write(string.charAt(i));
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class