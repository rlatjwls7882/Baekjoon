import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int m = Integer.valueOf(st.nextToken());
			int d = Integer.valueOf(st.nextToken());
			int y = Integer.valueOf(st.nextToken());
			if(m==0&&d==0&&y==0) {
				break;
			}
			int shift = (y+m+d)%25+1;
			
			String string = br.readLine();
			for(int i=0;i<string.length();i++) {
				if('a'<=string.charAt(i)&&string.charAt(i)<='z') {
					bw.write((string.charAt(i)-71-shift)%26+97);
				} else {
					bw.write(string.charAt(i));
				}
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class