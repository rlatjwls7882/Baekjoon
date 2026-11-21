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
		
		int cnt=0;
		for(int i=0;i<=string1.length()-string2.length();i++) {
			boolean chk=true;
			for(int j=0;j<string2.length();j++) {
				if(string1.charAt(i+j)==string2.charAt(j)) {
					chk=false;
					break;
				}
			}
			
			if(chk) {
				cnt++;
			}
		}
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
} // end of Main class