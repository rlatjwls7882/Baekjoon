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

		String s1 = br.readLine();
		String s2 = br.readLine();
		
		int cnt=0;
		for(int i=0;i<N;i++) {
			if(s1.charAt(i)=='C'&&s1.charAt(i)==s2.charAt(i)) {
				cnt++;
			}
		}
		bw.write(Integer.toString(cnt));

		bw.close();
	} // end of main()
} // end of Main class