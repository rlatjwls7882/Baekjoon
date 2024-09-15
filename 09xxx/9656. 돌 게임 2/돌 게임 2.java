import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// 짝수개인 경우 먼저 시작하는 사람이, 홀수개인 경우 나중에 시작하는 사람이 이김
		if(Integer.valueOf(br.readLine())%2==0) {
			bw.write("SK");
		} else {
			bw.write("CY");
		}
		
		bw.close();
	} // end of main()
} // end of Main class