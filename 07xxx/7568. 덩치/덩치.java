import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 모든 사람의 덩치 입력
		int N = Integer.valueOf(br.readLine());
		int[][] people = new int[N][2];
		
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			people[i][0] = Integer.valueOf(st.nextToken());
			people[i][1] = Integer.valueOf(st.nextToken());
		}
		
		// 덩치 등수 계산
		int[] rank = new int[N];
		Arrays.fill(rank, 1);
		
		for(int i=0;i<N;i++)
			for(int j=0;j<N;j++)
				if(people[i][0]<people[j][0]&&people[i][1]<people[j][1])
					rank[i]++;
		
		// 덩치 등수 출력
		for(int i=0;i<N;i++) {
			if(i!=0) bw.write(" ");
			bw.write(rank[i]+"");
		}
		
		bw.close();
	} // end of main
} // end of Main class