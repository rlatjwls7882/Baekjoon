import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int n = Integer.valueOf(br.readLine());
		
		int cost=100;
		while(n-->0) {
			bw.write(cost+"\n");
			cost*=2;
			
			String string = Integer.toString(cost);
			int cnt=0;
			for(int i=string.length()-1;i>=0;i--) {
				if(string.charAt(i)=='0') {
					cnt++;
				} else {
					break;
				}
			}
			
			if(cnt*2<string.length()) {
				cost = (int)(cost/Math.pow(10, cnt+1)+1)*(int)Math.pow(10, cnt+1);
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class