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
		int rk = Integer.valueOf(st.nextToken());
		int ck = Integer.valueOf(st.nextToken());
		int n = Integer.valueOf(br.readLine());
		while(n-->0) {
			st = new StringTokenizer(br.readLine());
			int ri = Integer.valueOf(st.nextToken());
			int ci = Integer.valueOf(st.nextToken());
			
			if(ri==rk || ci==ck) bw.write("0\n");
			else bw.write("1\n");
		}
        bw.close();
    } // end of main
} // end of Main