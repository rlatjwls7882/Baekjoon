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
		String tmpstring = "";
		int sum = 0;
		
		while((tmpstring=bf.readLine())!=null&&tmpstring!="") {
			st = new StringTokenizer(tmpstring);
			
			String string = st.nextToken();
			int N = Integer.valueOf(st.nextToken());
			
			if(string.equals("Es"))
				sum+=21*N;
			else
				sum+=17*N;
		}
		bw.write(sum+"");
		bw.close();
	} // end of main
} // end of main class