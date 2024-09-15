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

		while(true) {
			
			// 상근이와 선영이가 가지고있는 CD의 개수 N, M
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.valueOf(st.nextToken());
			int M = Integer.valueOf(st.nextToken());
			if(N==0&&M==0) break;
			
			// 동시에 가지고 있는 CD의 개수 계산
			HashSet<Integer> CD = new HashSet<Integer>();
			while(N-->0)
				CD.add(Integer.valueOf(br.readLine()));
			
			int cnt=0;
			while(M-->0)
				if(CD.contains(Integer.valueOf(br.readLine())))
					cnt++;
			
			bw.write(cnt+"\n");
		}
		
		bw.close();
	} // end of main
} // end of Main class