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
		
		int n = Integer.valueOf(br.readLine());
		int vote = Integer.valueOf(br.readLine());
		
		// 가희가 지지하는 캐릭터의 투표수 계산
		StringTokenizer st = new StringTokenizer(br.readLine());
		int rank=1;
		
		while(n-->1) {
			if(Integer.valueOf(st.nextToken())>vote) {
				rank++;
			}
		}
		
		bw.write(Integer.toString(rank));
		
		bw.close();
	} // end of main()
} // end of Main class