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
		
		int cnt=0;
		while(N-->0) {
			String string = br.readLine().toLowerCase();
			if(string.indexOf("pink")!=-1||string.indexOf("rose")!=-1) {
				cnt++;
			}
		}
		
		if(cnt==0) {
			bw.write("I must watch Star Wars with my daughter");
		} else {
			bw.write(Integer.toString(cnt));
		}
		
		bw.close();
	} // end of main()
} // end of Main class