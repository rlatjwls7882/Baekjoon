import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int n = Integer.valueOf(bf.readLine());
		
		while(n--!=0) {
			String string = bf.readLine();
			st = new StringTokenizer(string);
			int a = Integer.valueOf(st.nextToken());
			int b = Integer.valueOf(st.nextToken());
			int c = Integer.valueOf(st.nextToken());
			
			bw.write(string+"\n");
			if(a>=10&&b>=10&&c>=10)
				bw.write("triple-double\n\n");
			else if((a>=10&&b>=10)||(a>=10&&c>=10)||(b>=10&&c>=10))
				bw.write("double-double\n\n");
			else if(a>=10||b>=10||c>=10)
				bw.write("double\n\n");
			else
				bw.write("zilch\n\n");
		}
		bw.close();
	} // end of main
} // end of main class