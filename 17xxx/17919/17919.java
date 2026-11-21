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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int length=st.countTokens(), cnt=0;
		while(st.hasMoreTokens()) {
			if(st.nextToken().indexOf("ae")!=-1) {
				cnt++;
			}
		}
		
		if(length*4<=cnt*10) {
			bw.write("dae ae ju traeligt va");
		} else {
			bw.write("haer talar vi rikssvenska");
		}
		
		bw.close();
	} // end of main()
} // end of Main class