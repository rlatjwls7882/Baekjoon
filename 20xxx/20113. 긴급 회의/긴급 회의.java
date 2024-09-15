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
		
		int N = Integer.valueOf(br.readLine());
		
		// 퇴출되는 플레이어 확인
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] vote = new int[N+1];
		int max=0, maxPos=0;
		
		while(N-->0) {
			int Xi = Integer.valueOf(st.nextToken());
			
			if(Xi==0) {
				continue;
			}
			vote[Xi]++;
			
			if(max<vote[Xi]) {
				max=vote[Xi];
				maxPos=Xi;
			} else if(max==vote[Xi]) {
				maxPos=0;
			}
		}
		
		if(maxPos==0) {
			bw.write("skipped");
		} else {
			bw.write(Integer.toString(maxPos));
		}
		
		bw.close();
	} // end of main()
} // end of Main class