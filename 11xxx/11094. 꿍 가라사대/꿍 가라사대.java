import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		String simon = "Simon says";
		int N = Integer.valueOf(br.readLine());
		
		// "Simon says"로 시작하는 문장 출력
		while(N-->0) {
			String string = br.readLine();
			
			boolean simonSays=true;
			
			for(int i=0;i<10;i++) {
				if(string.length()<10||string.charAt(i)!=simon.charAt(i)) {
					simonSays=false;
					break;
				}
			}
			
			if(!simonSays) {
				continue;
			}
			
			for(int i=10;i<string.length();i++) {
				bw.write(string.charAt(i));
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class