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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.valueOf(st.nextToken());
		int y = Integer.valueOf(st.nextToken());
		
		String xString = Integer.toBinaryString(x);
		String yString = Integer.toBinaryString(y);
		
		while(xString.length()<yString.length()) {
			xString = "0"+xString;
		}
		while(xString.length()>yString.length()) {
			yString = "0"+yString;
		}
		
		String mortenString="";
		for(int i=0;i<xString.length();i++) {
			mortenString += xString.charAt(i);
			mortenString += yString.charAt(i);
		}
		bw.write(Long.toString(Long.valueOf(mortenString, 2)));

		bw.close();
	} // end of main()
} // end of Main class