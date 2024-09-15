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
		
		// 정점의 개수 N
		int N = Integer.valueOf(br.readLine());
		
		// 각 정점마다의 간선 입력
		int[][] route = new int[N][N];
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int j=0;j<N;j++) {
				route[i][j] = Integer.valueOf(st.nextToken());
			}
		}

		// 각 정점에서 다른 정점으로의 경로가 있는지 확인
		for(int mid=0;mid<N;mid++) {
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					if(route[i][mid]==1&&route[mid][j]==1) {
						route[i][j]=1;
					}
				}
			}
		}
		
		// i번째 정점에서 j번째 정점으로 양수의 경로로 갈 수 있는지 확인
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				bw.write(Integer.toString(route[i][j]));
				bw.write(' ');
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class