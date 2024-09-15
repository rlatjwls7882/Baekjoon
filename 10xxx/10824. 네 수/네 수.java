import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		String A = st.nextToken()+st.nextToken();		
		String B = st.nextToken()+st.nextToken();		
		
		
		bw.write(new BigInteger(A).add(new BigInteger(B))+"");
		bw.close();
	} // end of main
} // end of main class