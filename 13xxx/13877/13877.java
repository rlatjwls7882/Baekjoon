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
		
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			bw.write(st.nextToken());
			bw.write(' ');
			
			String string = st.nextToken();
			
			// 8진수로 나타내기
			if(canOct(string)) {
				bw.write(Integer.toString(getVal(string, 8)));
				bw.write(' ');
			} else {
				bw.write("0 ");
			}
			
			// 10진수로 나타내기
			bw.write(Integer.toString(getVal(string, 10)));
			bw.write(' ');
			
			// 16진수로 나타내기
			bw.write(Integer.toString(getVal(string, 16)));
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
	
	static boolean canOct(String string) {
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)>='8') {
				return false;
			}
		}
		
		return true;
	} // end of canOct()
	
	static int getVal(String string, int radix) {
		int ret=0, length = string.length();
		
		for(int i=0;i<length;i++) {
			ret += (string.charAt(i)-'0')*Math.pow(radix, length-i-1);
		}
		
		return ret;
	} // end of getVal()
} // end of Main class