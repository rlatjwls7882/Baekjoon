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
			for(int i=12;i<string.length()-1;i++) {
				if(string.charAt(i)=='\\'&&string.charAt(i+1)=='n'){
					bw.newLine();
					i++;
				} else {
					bw.write(string.charAt(i));
				}
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class