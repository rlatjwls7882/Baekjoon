import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		char[] arr = br.readLine().toCharArray();
		
		// 문자 교체
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.valueOf(st.nextToken());
			int b = Integer.valueOf(st.nextToken());
			
			char tmp = arr[a];
			arr[a] = arr[b];
			arr[b] = tmp;
		}
		
		// 결과 출력
		for(char val:arr) {
			bw.write(val);
		}
		
		bw.close();
	} // end of main()
} // end of Main class