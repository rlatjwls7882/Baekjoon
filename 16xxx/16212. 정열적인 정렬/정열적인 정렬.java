import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// 배열의 길이 N
		int N = Integer.valueOf(br.readLine());
		
		// 배열 정렬
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i] = Integer.valueOf(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		// 출력
		for(int i=0;i<N;i++) {
			bw.write(Integer.toString(arr[i]));
			bw.write(' ');
		}
		
		bw.close();
	} // end of main()
} // end of Main class