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
			if(
					string.length()==8
					&&'1'<=string.charAt(0)&&string.charAt(0)<='9'&&string.charAt(0)==string.charAt(1)
					&&'1'<=string.charAt(2)&&string.charAt(2)<='9'
					&&'1'<=string.charAt(3)&&string.charAt(3)<='9'
					&&'A'<=string.charAt(4)&&string.charAt(4)<='Z'
					&&'1'<=string.charAt(5)&&string.charAt(5)<='9'
					&&'1'<=string.charAt(6)&&string.charAt(6)<='9'
					&&'1'<=string.charAt(7)&&string.charAt(7)<='9'
					) {
				bw.write(string+"\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class