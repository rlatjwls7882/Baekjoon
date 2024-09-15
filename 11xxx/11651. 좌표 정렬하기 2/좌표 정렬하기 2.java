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

		// N개의 좌표 입력
		int N = Integer.valueOf(br.readLine());
		Integer[][] list = new Integer[N][2];
		
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			list[i][0] = Integer.valueOf(st.nextToken());
			list[i][1] = Integer.valueOf(st.nextToken());
		}
		
		// 좌표 정렬
		Arrays.sort(list, (pos1, pos2) -> {
			// y좌표 증가하는 순
			if(!pos1[1].equals(pos2[1]))
				return pos1[1]-pos2[1];
			// x좌표 증가하는 순
			else
				return pos1[0]-pos2[0];
		});

		for(Integer[] pos:list)
			bw.write(pos[0]+" "+pos[1]+"\n");
		
		bw.close();
	} // end of main
} // end of Main class