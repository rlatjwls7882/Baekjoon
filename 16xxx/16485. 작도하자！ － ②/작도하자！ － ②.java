import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		double c = Double.valueOf(st.nextToken());
		double b = Double.valueOf(st.nextToken());

		// BM/CM(==c/b) 계산
		bw.write(c/b+"");
		
		bw.close();
	} // end of main()
} // end of Main class