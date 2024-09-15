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

		// 교과서의 수 N, 교과서 더미의 수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 교과서를 순서대로 꺼낼 수 있는지 확인
		boolean canPick=true;
		
		while(M-->0) {
			int k = Integer.valueOf(br.readLine());
			
			st = new StringTokenizer(br.readLine());
			int lastVal = Integer.valueOf(st.nextToken());
			
			while(k-->1) {
				int curVal = Integer.valueOf(st.nextToken());
				if(curVal>lastVal) {
					canPick=false;
					M=0;
					break;
				}
				lastVal=curVal;
			}
		}
		
		bw.write(canPick?"Yes":"No");
		
		bw.close();
	} // end of main()
} // end of Main class