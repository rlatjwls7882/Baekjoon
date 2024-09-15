import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		// 문어의 수 N
		int N = Integer.valueOf(br.readLine());
		
		// N마리의 문어로 만들수 있는 사전순으로 가장 앞서는 수열 출력
		for(int i=0;i<N;i++) {
			if(i%2==0&&i==N-1) {
				bw.write("3 ");
			} else if(i%2==0) {
				bw.write("1 ");
			} else {
				bw.write("2 ");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class