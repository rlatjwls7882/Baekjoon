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
			String output="Z";
			
			for(int i=0;i<string.length();i++) {
				String tmp = string.substring(i)+string.substring(0, i);
				if(output.compareTo(tmp)>0) {
					output=tmp;
				}
			}
			bw.write(output+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class