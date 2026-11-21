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
		String str1 = st.nextToken();
		String str2 = st.nextToken();
		if(str2.equals("BC")) {
			String tmp = str1;
			str1=str2;
			str2=tmp;
		}
		
		st = new StringTokenizer(br.readLine());
		String str3 = st.nextToken();
		String str4 = st.nextToken();
		if(str4.equals("BC")) {
			String tmp = str3;
			str3=str4;
			str4=tmp;
		}
		
		if(!str1.equals(str3)) {
			bw.write(Integer.toString(Integer.valueOf(str2)+Integer.valueOf(str4)-1));
		} else {
			bw.write(Integer.toString(Math.abs(Integer.valueOf(str2)-Integer.valueOf(str4))));
		}
		
		bw.close();
	} // end of main()
} // end of Main class