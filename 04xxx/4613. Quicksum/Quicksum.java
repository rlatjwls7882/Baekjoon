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
			
			// Quicksum 계산
			int sum=0;
			for(int i=0;i<string.length();i++) {
				if(string.charAt(i)!=' ') {
					sum += (i+1)*(string.charAt(i)-'A'+1);
				}
			}
			
			bw.write(Integer.toString(sum));
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class