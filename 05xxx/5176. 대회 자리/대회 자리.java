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

		// 테스트 케이스의 수 K
		int K = Integer.valueOf(br.readLine());
		
		while(K-->0) {
			
			// 참가자의 수 P
			StringTokenizer st = new StringTokenizer(br.readLine());
			int P = Integer.valueOf(st.nextToken());
			
			// 대회에 참가하지 못하는 참가자의 수 계산
			int cantEnter=0;
			HashSet<Integer> enter = new HashSet<Integer>();
			
			while(P-->0)
				if(!enter.add(Integer.valueOf(br.readLine())))
					cantEnter++;
			
			bw.write(cantEnter+"\n");
		}

		bw.close();
	} // end of main
} // end of Main class