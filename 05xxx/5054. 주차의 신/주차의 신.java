import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			
			// N개의 수의 최댓값, 최솟값 계산
			int N = Integer.valueOf(br.readLine());
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int max=0, min=99;
			while(N-->0) {
				int pos = Integer.valueOf(st.nextToken());
				if(pos>max) max=pos;
				if(pos<min) min=pos;
			}
			
			// 모든 상점을 방문하고 차로 돌아오기까지 걸리는 거리 계산
			bw.write((max-min)*2+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class