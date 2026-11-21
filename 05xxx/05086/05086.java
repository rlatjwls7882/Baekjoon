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
		String string = "";
		
		while(!((string = bf.readLine()).equals("0 0"))) {
			st = new StringTokenizer(string);
			int x = Integer.valueOf(st.nextToken());
			int y = Integer.valueOf(st.nextToken());
			
			if(y%x==0)
				bw.write("factor\n");
			else if(x%y==0)
				bw.write("multiple\n");
			else
				bw.write("neither\n");
		}
		
		bw.close();
	} // end of main
} // end of main class