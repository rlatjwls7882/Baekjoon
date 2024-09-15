import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		String left = "qazwsxedcrfvtgb";
		
		while(true) {
			String string = br.readLine();
			if(string.equals("#")) {
				break;
			}
			
			int cnt=0;
			for(int i=1;i<string.length();i++) {
				if(left.indexOf(string.charAt(i))!=-1&&left.indexOf(string.charAt(i-1))==-1||left.indexOf(string.charAt(i))==-1&&left.indexOf(string.charAt(i-1))!=-1) {
					cnt++;
				}
			}
			bw.write(cnt+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class