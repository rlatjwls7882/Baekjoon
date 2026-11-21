import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		String bit = "ABCDEFG";
		
		while(true) {
			String string = br.readLine();
			if(string.equals("#")) {
				break;
			}
			
			boolean chk=true;
			for(int i=0;i<string.length()-1;i++) {
				if(bit.charAt((string.charAt(i)-'A'+2)%7)!=string.charAt(i+1)&&bit.charAt((string.charAt(i)-'A'+4)%7)!=string.charAt(i+1)&&bit.charAt((string.charAt(i)-'A'+6)%7)!=string.charAt(i+1)) {
					chk=false;
					break;
				}
			}
			bw.write(chk?"That music is beautiful.\n":"Ouch! That hurts my ears.\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class