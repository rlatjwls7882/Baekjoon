import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {

		// 전장에 놓인 칸의 개수 N
		int N = Integer.valueOf(br.readLine());
		
		// 전장의 칸의 수가 짝수개인 경우 먼저 시작하는 사람이 이김
		if(N%2==0) {
			bw.write("Duck");
		} else {
			bw.write("Goose");
		}
		
		bw.close();
	} // end of main()
} // end of Main class