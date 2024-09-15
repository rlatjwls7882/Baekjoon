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
		
		// 울타리의 길이 m, 관찰한 날의 수 n
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.valueOf(st.nextToken());
		int n = Integer.valueOf(st.nextToken());
		
		// 울타리 덮기
		boolean[] fence = new boolean[m];
		while(n-->0) {
			st = new StringTokenizer(br.readLine());
			int l = Integer.valueOf(st.nextToken())-1;
			int r = Integer.valueOf(st.nextToken())-1;
			
			while(l<=r) {
				fence[l]=true;
				l++;
			}
		}
		
		// 모든 울타리가 덮여있는지 확인
		boolean chk = true;
		for(int i=0;i<m;i++) {
			if(!fence[i]) {
				chk=false;
				break;
			}
		}
		bw.write(chk?"YES":"NO");
		
		bw.close();
	} // end of main()
} // end of Main class