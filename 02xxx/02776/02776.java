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

		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			
			// 수첩1에 적어놓은 정수들
			int N = Integer.valueOf(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			HashSet<String> note = new HashSet<String>();
			while(N-->0)
				note.add(st.nextToken());
			
			// 수첩2에 적혀있는 수가 수첩1에도 적혀있는지 확인
			int M = Integer.valueOf(br.readLine());
			st = new StringTokenizer(br.readLine());
			
			while(M-->0) {
				if(note.contains(st.nextToken()))
					bw.write("1\n");
				else
					bw.write("0\n");
			}
		}
		
		bw.close();
	} // end of main
} // end of Main class