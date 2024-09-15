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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		long[] arr = new long[3];
		for(int i=0;i<3;i++) {
			arr[i] = Long.valueOf(st.nextToken());
		}
		Arrays.sort(arr);
		
		bw.write(Long.toString(arr[1]));
		
		bw.close();
	} // end of main()
} // end of Main class