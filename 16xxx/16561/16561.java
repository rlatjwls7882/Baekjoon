import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int n = Integer.valueOf(br.readLine());
		
		if(n<9) {
			bw.write("0");
		} else {
			
			// 3의 덩어리를 3명에게 최소 1개씩 분배하는 방법의 수 계산
			// = H(3,n)
			// = C(n+2,n) = C(n+2,2)
			n = n/3-3;
			bw.write(Long.toString((n+2)*(n+1)/2));
		}
		
		bw.close();
	} // end of main()
} // end of Main class