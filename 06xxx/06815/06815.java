import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int a = Integer.valueOf(br.readLine());
		int b = Integer.valueOf(br.readLine());
		
		int cnt=0;
		while(a<=b) {
			if(Math.sqrt(a)==(int)Math.sqrt(a)&&Math.cbrt(a)==(int)Math.cbrt(a)) {
				cnt++;
			}
			a++;
		}
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
} // end of Main class