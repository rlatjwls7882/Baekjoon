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
		
		int N = Integer.valueOf(br.readLine());
		
		// 2번 나온 수 검색
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		while(N-->0) {
			int num = Integer.valueOf(st.nextToken());
			
			if(arr[num]==1) {
				bw.write(Integer.toString(num));
				break;
			}
			arr[num]++;
		}
		
		bw.close();
	} // end of main()
} // end of Main class