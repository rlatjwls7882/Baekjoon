import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		long N = Long.valueOf(br.readLine());
		
		// 마법을 사용하는 최소횟수 계산
		if(N==0) {
			bw.write("0");
		} else {
			int magic=1;
			while(N!=1) {
				magic++;
				N=(N+1)/2;
			}
			
			bw.write(Integer.toString(magic));
		}
		
		bw.close();
	} // end of main()
} // end of Main class