import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		char[] string = br.readLine().toCharArray();
		
		for(int i=0;i<string.length;i++) {
			if(i+2>=string.length||string[i]!=string[i+1]||string[i+1]!=string[i+2]||string[i]=='a'||string[i]=='e'||string[i]=='i'||string[i]=='o'||string[i]=='u'||string[i]=='y') {
				bw.write(string[i]);
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class