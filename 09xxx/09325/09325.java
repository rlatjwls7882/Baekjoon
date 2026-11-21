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
		
		int T = Integer.valueOf(bf.readLine());
		
		while(T--!=0) {
			int price = Integer.valueOf(bf.readLine());
			int n = Integer.valueOf(bf.readLine());
			
			while(n--!=0) {
				StringTokenizer st = new StringTokenizer(bf.readLine());
				price+=Integer.valueOf(st.nextToken())*Integer.valueOf(st.nextToken());
			} // end of while n
			
			bw.write(price+"\n");
		} // end of while T
		
		bw.close();
	} // end of main
} // end of main class