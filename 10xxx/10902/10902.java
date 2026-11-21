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
		
		// 제출한 답안의 수 n
		int n = Integer.valueOf(br.readLine());
		
		// tf, sf, f 계산
		int tf=0, sf=0, f=0;
		for(int i=1;i<=n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int ti = Integer.valueOf(st.nextToken());
			int si = Integer.valueOf(st.nextToken());
			
			if(si>sf) {
				sf=si;
				tf=ti;
				f=i;
			}
		}
		
		// 패널티 계산
		if(sf==0) {
			bw.write("0");
		} else {
			bw.write(Integer.toString(tf+(f-1)*20));
		}
		
		bw.close();
	} // end of main()
} // end of Main class