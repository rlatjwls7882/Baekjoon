import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 체스판의 크기 N, 다바바의 개수 K
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int K = Integer.valueOf(st.nextToken());
		
		// 다바바가 움직일 수 있는 칸의 수 계산
		HashSet<String> move = new HashSet<>();
		for(int i=0;i<K;i++) {
			
			// 다바바의 원래 위치
			st = new StringTokenizer(br.readLine());
			int x = Integer.valueOf(st.nextToken());
			int y = Integer.valueOf(st.nextToken());
			move.add(new String(x+", "+y));
			
			// 다바바의 움직인 위치
			if(x-2>=1) move.add(new String(x-2+", "+y));
			if(x+2<=N) move.add(new String(x+2+", "+y));
			if(y-2>=1) move.add(new String(x+", "+(y-2)));
			if(y+2<=N) move.add(new String(x+", "+(y+2)));
		}
		
		bw.write(move.size()-K+"");
		
		bw.close();
	} // end of main
} // end of Main class