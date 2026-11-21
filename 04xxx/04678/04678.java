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
			if(string.equals("0")) {
				break;
			}
			
			int length = string.length();
			int sum=0;
			for(int i=0;i<length;i++) {
				sum += (string.charAt(i)-'0')*(Math.pow(2, length-i)-1);
			}
			bw.write(sum+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class