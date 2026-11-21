import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		String string = br.readLine();
		
		String firstString="zzzzzzzzzzzzzz";
		int secondIdx=string.length()-1;
		while(secondIdx>1) {
			for(int firstIdx=1;firstIdx<secondIdx;firstIdx++) {
				String makeString = rev(string.substring(0, firstIdx))+rev(string.substring(firstIdx, secondIdx))+rev(string.substring(secondIdx));
				if(firstString.compareTo(makeString)>0) {
					firstString=makeString;
				}
			}
			secondIdx--;
		}
		bw.write(firstString);
		
		bw.close();
	} // end of main()
	
	static String rev(String string) {
		StringBuilder sb = new StringBuilder(string);
		return sb.reverse().toString();
	} // end of rev()
} // end of Main class