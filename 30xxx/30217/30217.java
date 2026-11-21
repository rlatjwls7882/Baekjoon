import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		String string1 = br.readLine();
		String string2 = br.readLine();
		
		int idx1=string1.length();
		for(int i=1;i<string1.length();i++) {
			if(string1.charAt(i)=='a'||string1.charAt(i)=='e'||string1.charAt(i)=='i'||string1.charAt(i)=='o'||string1.charAt(i)=='u') {
				idx1=i;
				break;
			}
		}
		
		int idx2=-1;
		for(int i=string2.length()-2;i>=0;i--) {
			if(string2.charAt(i)=='a'||string2.charAt(i)=='e'||string2.charAt(i)=='i'||string2.charAt(i)=='o'||string2.charAt(i)=='u') {
				idx2=i;
				break;
			}
		}
		
		if(idx2!=-1) {
			bw.write(string1.substring(0, idx1)+string2.substring(Math.max(0, idx2), string2.length()));
		} else if(idx1!=string1.length()) {
			bw.write(string1.substring(0, idx1+1)+string2);
		} else {
			bw.write(string1+"o"+string2);
		}
		
		bw.close();
	} // end of main()
} // end of Main class