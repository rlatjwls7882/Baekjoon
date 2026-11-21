import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		
		// N개의 수를 카운팅정렬
		int[] sort = new int[2_000_001];
		
		while(N-->0) {
			sort[Integer.valueOf(br.readLine())+1_000_000]++;
		}
		
		for(int i=0;i<=2_000_000;i++) {
			while(sort[i]-->0) {
				bw.write(Integer.toString(i-1_000_000));
				bw.newLine();
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class