import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 점의 개수 n
		int n = Integer.valueOf(br.readLine());
		
		// 등장한 x, y좌표 입력
		HashMap<String, Integer> x = new HashMap<>();
		HashMap<String, Integer> y = new HashMap<>();
		
		while(n-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String tmpx = st.nextToken();
			String tmpy = st.nextToken();
			x.put(tmpx, x.getOrDefault(tmpx, 0)+1);
			y.put(tmpy, y.getOrDefault(tmpy, 0)+1);
		}
		
		// 그릴 수 있는 축에 평행한 직선의 개수 계산
		int line=0;
		for(int i:x.values())
			if(i>1)
				line++;
		
		for(int i:y.values())
			if(i>1)
				line++;
		
		bw.write(line+"");
		
		bw.close();
	} // end of main
} // end of Main class