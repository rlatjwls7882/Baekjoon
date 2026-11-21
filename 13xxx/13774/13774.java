import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		while(true) {
			String string = br.readLine();
			if(string.equals("#")) {
				break;
			}
			
			boolean isPalindrome=false;
			for(int i=0;i<string.length();i++) {
				String tmp = string.substring(0, i)+string.substring(i+1, string.length());
				
				boolean chk=true;
				for(int j=0;j<tmp.length()/2;j++) {
					if(tmp.charAt(j)!=tmp.charAt(tmp.length()-1-j)) {
						chk=false;
						break;
					}
				}
				if(chk) {
					bw.write(tmp+"\n");
					isPalindrome=true;
					break;
				}
			}
			if(!isPalindrome) {
				bw.write("not possible\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class