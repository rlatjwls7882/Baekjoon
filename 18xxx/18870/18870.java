import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// N개의 좌표 입력
		int N = Integer.valueOf(br.readLine());
		Integer[] originalX = new Integer[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++)
			originalX[i] = Integer.valueOf(st.nextToken());
		
		// 좌표 압축
		ArrayList<Integer> sortedX = new ArrayList<>(Arrays.asList(originalX));
		Collections.sort(sortedX);
		
		HashMap<Integer, Integer> ranking = new HashMap<>();
		int idx=0;
		for(int i:sortedX)
			if(!ranking.containsKey(i))
				ranking.put(i, idx++);
		
		// 결과 출력
		for(int i:originalX)
			bw.write(ranking.get(i)+" ");
		
		bw.close();
	} // end of main
} // end of Main class