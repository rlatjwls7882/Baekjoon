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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.valueOf(st.nextToken());
		int b = Integer.valueOf(st.nextToken());
		bw.write(Integer.toString(((a+b)*a+a)*a));
		
		bw.close();
	} // end of main()
} // end of Main class