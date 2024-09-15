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
		
		// N보다 작거나 같은 가장 큰 금민수 계산
		for(;N>=4;N--) {
			if(isGoldMinsu(N)) {
				bw.write(Integer.toString(N));
				break;
			}
		}
		
		bw.close();
	} // end of main()
	
	static boolean isGoldMinsu(int N) {
		while(N!=0) {
			if(N%10==4||N%10==7) {
				N/=10;
				continue;
			} else {
				return false;
			}
		}
		
		return true;
	} // end of isGoldMinsu()
} // end of Main class