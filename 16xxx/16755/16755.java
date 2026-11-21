import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		String HONI = "HONI";
		String string = br.readLine();
		
		int idx=0;
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)==HONI.charAt(idx%4)) {
				idx++;
			}
		}
		
		bw.write(idx/4+"");
		
		bw.close();
	} // end of main()
} // end of Main class