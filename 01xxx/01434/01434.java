import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 박스의 개수 N, 책의 개수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 박스의 용량
		int space=0;
		st = new StringTokenizer(br.readLine());
		while(N-->0)
			space += Integer.valueOf(st.nextToken());
		
		// 책의 용량
		st = new StringTokenizer(br.readLine());
		while(M-->0)
			space -= Integer.valueOf(st.nextToken());
		
		// 낭비되는 용량 출력
		bw.write(space+"");
		
		bw.close();
	} // end of main
} // end of Main class