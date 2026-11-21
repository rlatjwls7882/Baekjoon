import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int k = Integer.valueOf(br.readLine());
		String string1 = br.readLine();
		String string2 = br.readLine();
		int n = string1.length();
		
		int same=0, diff=0;
		for(int i=0;i<n;i++) {
			if(string1.charAt(i)==string2.charAt(i)) {
				same++;
			} else {
				diff++;
			}
		}
		
		bw.write(Math.min(k, same)+Math.min(n-k, diff)+"");
		
		bw.close();
	} // end of main()
} // end of Main class