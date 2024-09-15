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
		
		int cntS=0, cntT=0;
		while(N-->0) {
			String string = br.readLine();
			for(int i=0;i<string.length();i++) {
				if(string.charAt(i)=='s'||string.charAt(i)=='S') {
					cntS++;
				} else if(string.charAt(i)=='t'||string.charAt(i)=='T') {
					cntT++;
				}
			}
		}
		if(cntT>cntS) {
			bw.write("English");
		} else {
			bw.write("French");
		}

		bw.close();
	} // end of main()
} // end of Main class