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
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ,;");
		String first = st.nextToken();
		
		
		while(st.hasMoreTokens()) {
			String name = st.nextToken();
			
			int pos=name.length();
			for(int i=name.length()-1;i>0;i--) {
				if(!('a'<=name.charAt(i)&&name.charAt(i)<='z'||'A'<=name.charAt(i)&&name.charAt(i)<='Z')) {
					pos=i;
				} else {
					break;
				}
			}
			
			bw.write(first);
			for(int i=name.length()-1;i>=pos;i--) {
				if(name.charAt(i)==']') {
					bw.write("[]");
					i--;
				} else {					
					bw.write(name.charAt(i));
				}
			}
			bw.write(" "+name.substring(0, pos)+";\n");
		}
		
		bw.close();
	} // end of main
} // end of Main class