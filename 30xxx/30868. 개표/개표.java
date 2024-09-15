import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		int T = Integer.valueOf(br.readLine());
		
		// 칠판에 그려지게 되는 결과물 출력
		while(T-->0) {
			int N = Integer.valueOf(br.readLine());
			
			while(N>=5) {
				bw.write("++++ ");
				N -= 5;
			}
			
			while(N-->0) {
				bw.write("|");
			}
			
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class