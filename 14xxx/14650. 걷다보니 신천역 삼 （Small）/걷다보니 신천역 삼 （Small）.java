import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int N, cnt=0;
	public static void main(String[] args) throws IOException {
		
		N = Integer.valueOf(br.readLine());
		
		dfs(0, 0);
		
		bw.write(Integer.toString(cnt));
		bw.close();
	} // end of main
	
	static void dfs(int depth, int sum) {
		if(depth==N) {
			if(sum%3==0 && sum!=0) cnt++;
			return;
		}
		
		for(int i=0;i<=2;i++) {
			if(depth==0 && i==0) continue;
			dfs(depth+1, sum+i);
		}
	} // end of dfs
} // end of Main class