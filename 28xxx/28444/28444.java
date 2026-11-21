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
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int case1 = Integer.valueOf(st.nextToken())*Integer.valueOf(st.nextToken());
		int case2 = Integer.valueOf(st.nextToken())*Integer.valueOf(st.nextToken())*Integer.valueOf(st.nextToken());
		
		bw.write(case1-case2+"");
		bw.close();
	} // end of main
} // end of main class