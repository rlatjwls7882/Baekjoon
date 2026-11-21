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
		
		// 높이 N, 가로 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 지도에서 두 1의 위치 확인
		int[][] pos = new int[2][2];
		int idx=0;
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j=0;j<M;j++) {
				if(st.nextToken().equals("1")) {
					pos[idx][0]=i;
					pos[idx][1]=j;
					idx++;
				}
			}
		}
		
		// 두 1 사이의 택시 거리 계산
		bw.write(Integer.toString(Math.abs(pos[0][0]-pos[1][0])+Math.abs(pos[0][1]-pos[1][1])));
		
		bw.close();
	} // end of main()
} // end of Main class