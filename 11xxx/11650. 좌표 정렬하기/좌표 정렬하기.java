import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// N개의 좌표 입력
		int N = Integer.valueOf(br.readLine());
		ArrayList<Integer[]> list = new ArrayList<>();
		
		while(N-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			Integer[] tmp = new Integer[2];
			tmp[0] = Integer.valueOf(st.nextToken());
			tmp[1] = Integer.valueOf(st.nextToken());
			list.add(tmp);
		}
		
		// 좌표 정렬
		Collections.sort(list, new Comparator<Integer[]>() {
			@Override
			public int compare(Integer[] pos1, Integer[] pos2) {
				// x좌표 증가하는 순
				if(!pos1[0].equals(pos2[0]))
					return pos1[0]-pos2[0];
				// y좌표 증가하는 순
				else
					return pos1[1]-pos2[1];
			}
		});
		
		for(Integer[] pos:list)
			bw.write(pos[0]+" "+pos[1]+"\n");
		
		bw.close();
	} // end of main
} // end of Main class